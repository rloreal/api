# Standard library imports
import csv
import json
from math import e
import os
import re
import traceback
import logging
import logging.config
from turtle import end_fill
import yaml
from typing import List, Tuple
from xml.dom import minidom
import xmlschema
import unicodedata

# Third-party imports
from bs4 import BeautifulSoup

# Constants and Configuration
nexo_tool_config: dict[str, str] = {}
ISO20022_MODEL = 'C:/Users/romai/OneDrive/Documents/NEXO/api/20240729_ISO20022_2013_eRepository.iso20022'
REPO_DESC_FILE = "C:/Users/romai/OneDrive/Documents/NEXO/api/" + \
    os.path.basename(ISO20022_MODEL) + ".description.json"
PREVIOUS_VERSION_NUMBER = "02"
ROW_LEVEL_INDENT = "&nbsp;&nbsp;"

LOG_CONFIGURATION_FILE = "nexo_table_generator_logging.yaml"

OUTPUT_DIR = "C:/Users/romai/OneDrive/Documents/NEXO/api/casp_v5/NEW_HTML/ENDPOINTS_WITHOUT_ENDPOINTS/"
SCHEMA_DIR = "C:/Users/romai/OneDrive/Documents/NEXO/api/casp_v5/"
PREVIOUS_VERSION_DIR = "C:/Users/romai/OneDrive/Documents/NEXO/api/casp_v5/HTML/"
V5_VERSION_DIR = "C:/Users/romai/OneDrive/Documents/NEXO/api/casp_v2/NEW_HTML/"
# Set this to False if you don't want to generate endpoint tables
GENERATE_ENDPOINTS = True
# Set this to False if you don't want to see stop at sub endpoints in endpoints
ENDPOINTS_IN_ENDPOINT = True
# Set this to False if you don't want to compare message to a previous version
COMPARE_TO_PREVIOUS_VERSION = True
# Set this to False if you don't want to compare endpoints to a previous version
ENDPOINT_COMPARE_TO_PREVIOUS_VERSION = True
SPECIAL_COMPARE_V5 = True


# OUTPUT_DIR = "C:/Users/romai/OneDrive/Documents/NEXO/api/casp_v2/NEW_HTML/"
# SCHEMA_DIR = "C:/Users/romai/OneDrive/Documents/NEXO/api/casp_v2/"
# PREVIOUS_VERSION_DIR = "C:/Users/romai/OneDrive/Documents/NEXO/api/casp_v5/HTML/"
# V5_VERSION_DIR = "C:/Users/romai/OneDrive/Documents/NEXO/api/casp_v2/NEW_HTML/"
# Set this to False if you don't want to generate endpoint tables
# GENERATE_ENDPOINTS = True
# Set this to False if you don't want to see stop at sub endpoints in endpoints
# ENDPOINTS_IN_ENDPOINT=False
# Set this to False if you don't want to compare message to a previous version
# COMPARE_TO_PREVIOUS_VERSION = False
# ENDPOINT_COMPARE_TO_PREVIOUS_VERSION = False
# SPECIAL_COMPARE_V5 = False

# Status Constants
STATUS_NOCHANGE = 0
STATUS_UPDATED = 1
STATUS_NEW = 2
STATUS_DELETED = 4

# Global variables

logger: logging.Logger
endpoints: dict[str, str] = {}
business_area: str = ""
iso_repository_description: dict[str, dict[str, str]] = {}
bs_previous_html: BeautifulSoup
element_tags: dict[str, str] = {}
message_tags: dict[str, dict[str, str]] = {}
endpoints_elements: dict[str, xmlschema.validators.elements.XsdElement] = {}

# XML namespaces
namespaces = {
    "xmi": "http://www.omg.org/XMI",
    "xs": "http://www.w3.org/2001/XMLSchema"
}

# HTML Style Template
HTML_STYLE = """<style type="text/css">
    p {
        color: #000000;
        line-height: 95%;
        text-align: left;
        orphans: 2;
        widows: 2;
        margin-bottom: 0.25cm;
        direction: ltr;
        background: transparent
    }
    p.western {
        font-family: "Arial", serif;
        font-size: 10pt;
        so-language: en-GB
    }
    a:visited { color: #954f72; text-decoration: underline }
    a:link { color: #0563c1; text-decoration: underline }
    table.fixed {
        table-layout: fixed;
        width: 840px;
        border-collapse: collapse;
        border: 1px solid #a6a6a6;
    }
    tr.updated {
        font-color: #0000ff;
    }
    tr.new {
        font-color: #00cc00;
    }
    tr.deleted {
        font-color: #ff0000;
        text-decoration: line-through;
    }

    table.fixed td { word-wrap: break-word; }
    table.fixed td:nth-of-type(1) { width: 32px; }
    table.fixed td:nth-of-type(2) { width: 190px; }
    table.fixed td:nth-of-type(3) { width: 60px; }
    table.fixed td:nth-of-type(4) { width: 60px; }
    table.fixed td:nth-of-type(5) { width: 60px; }
    table.fixed td:nth-of-type(6) { width: 438px; }
</style>"""

HTML_BODY = '''
    <body>
    '''
namespaces = {"xmi": "http://www.omg.org/XMI",
              "xs": "http://www.w3.org/2001/XMLSchema"}


def load_endpoints() -> dict[str, str]:
    """
    Load endpoints from CSV file.
    Returns a dictionary mapping element types to protocols.
    """
    mdr_endpoints: dict[str, str] = {}
    for filename in os.listdir(SCHEMA_DIR):
        if filename.endswith(".csv") and (filename.upper().startswith("NEW_EXPANDABLES")):
            logger.info(f"Processing {filename} for endpoints")
            with open(os.path.join(SCHEMA_DIR, filename), 'r', encoding='UTF-8') as file:
                csv_reader = csv.reader(file, delimiter=";")
                for elt_type, protocol in csv_reader:
                    mdr_endpoints[elt_type] = protocol
    return mdr_endpoints


def is_endpoint(elt_type: str = "") -> bool:
    """
    Check if the given element type is an endpoint for the current business area.
    """
    return elt_type in endpoints and business_area in endpoints[elt_type]


def collect_all_endpoints_elements(doc, endpoints_dict: dict[str, xmlschema.validators.elements.XsdElement]) -> dict[str, xmlschema.validators.elements.XsdElement]:
    """
    iterates over a XMLSchema and collect all elements that are endpoints.
    Args:
        doc : a XMLSchema Element document root
        endpoints_dict : a dictionary mapping element types to XsdElement objects for endpoints.

    Returns:
         updated dictionary mapping element types to XsdElement objects for endpoints.
    """
    for element in doc.iterchildren():
        # type: ignore
        if element.type is not None and is_endpoint(element.type.local_name):
            endpoints_dict[element.type.local_name] = element
        endpoints_dict = collect_all_endpoints_elements(
            element, endpoints_dict)
    return endpoints_dict


def generate_message_table_xsd_endpoint(message_name: str, output_dir: str, element_type: str, endpoint_elt) -> None:
    """
    Generate HTML table for a endpoint.
    Depending on compare flags, it will try to load HTML files from another version of the schema and compare the elements
    to highlight changes between versions.

    Args:
        message_name: Name of the message to process
        output_dir: Directory to write output HTML files
        element_type: type of element to process
        endpoint_elt : XsdElement of the endpoint (typically collected in the full message table geenration)

    """
    # Initialize HTML structure
    html_header = f"<html><head>{HTML_STYLE}<title>{
        message_name}.{element_type}</title></head>"

    table_title = message_name + ("." + element_type)

    previous_html: BeautifulSoup = BeautifulSoup()
    v5_html: BeautifulSoup = BeautifulSoup()
    if (COMPARE_TO_PREVIOUS_VERSION):
        try:
            previous_html = load_previous_version_html(
                message_name, element_type)
        except Exception as preve:
            logger.error(f"Error finding previous version HTML for {
                element_type}: {preve}")

    if (SPECIAL_COMPARE_V5):
        try:
            v5_html = load_v5_version_html(
                message_name, element_type)
        except Exception as preve:
            logger.error(f"Error loading v5 version HTML for {
                element_type}: {preve}")

    # Generate table content
    html_table_head = generate_table_header(element_type)
    html_table_rows = process_endpoint_elements(
        endpoint_elt, 1, previous_html, v5_html)

    # Combine all HTML parts
    html_full = (
        html_header +
        HTML_BODY +
        html_table_head +
        html_table_rows +
        """
        </table>
        </body>
        </html>
        """
    )

    # Write output file
    output_filename = f"{
        element_type}.html"
    output_file = os.path.join(output_dir, output_filename)
    write_html(html_full, output_file)
    logger.info("-" * 16 + f"Endpoint file written: {output_file}")


def generate_message_table_from_schema(input_dir: str, xs: xmlschema.XMLSchema, output_dir: str) -> None:
    """
    Generate HTML table for a specific message or sub-element.
    Args:
        input_dir: Directory containing input schema files
        xs: XML Schema object
        output_dir: Directory to write output HTML files
    """
    # Initialize HTML structure
    html_header = f"<html><head>{HTML_STYLE}<title>{xs.name}</title></head>"

    # Process schema
    logger.info(f"Processing {xs.name}")
    previous_html: BeautifulSoup = BeautifulSoup()
    message_title = "_MESSAGE_TITLE_"

    # Check if 'Document' element exists
    if 'Document' in xs.elements:
        business_area = xs.name[0:4]  # type: ignore
        doc = xs.elements['Document']
        message_title = xs.name if xs.name is not None else message_title
        v5_html: BeautifulSoup = BeautifulSoup()

        try:
            for elt in doc.iterchildren():
                message_title = element_tags[elt.local_name] if (
                    elt.local_name in element_tags) else message_title
                break
        except Exception as ex:
            logger.info(f"Error while getting message title for {
                        elt.local_name}: {ex}")

        if (COMPARE_TO_PREVIOUS_VERSION):
            try:
                # remove version of the message for comparisons (StatusReportV07 => StatusReport)
                previous_html = load_previous_version_html(
                    re.sub(r'V[0-9]+$', '', message_title), "")  # type: ignore
            except Exception as preve:
                logger.error(f"Error loading previous version HTML for {
                    message_title}: {preve}")

        if (SPECIAL_COMPARE_V5):
            try:
                v5_html = load_v5_version_html(
                    re.sub(r'V[0-9]+$', '', message_title), "")
            except Exception as preve:
                logger.info(f"Error loading v5 version HTML for {
                    message_title}: {preve}")
        # Generate table content
        html_table_head = generate_table_header(
            re.sub(r'V[0-9]+$', '', message_title))  # type: ignore

        html_table_rows = process_schema_elements(message_title,
                                                  doc, level=1, previous_version=previous_html, v5_version=v5_html)

        # Combine all HTML parts
        html_full = (
            html_header +
            HTML_BODY +
            html_table_head +
            html_table_rows +
            "</table></body></html>"
        )

        # Write output file
        message_title = re.sub(r'V[0-9]+$', '', message_title)  # type: ignore

        output_filename = f"{message_title}.html"
        output_file = os.path.join(output_dir, output_filename)
        write_html(html_full, output_file)

    else:
        logger.error(f"No 'Document' element found in schema {xs.name}")


def find_schema_file(input_dir: str, message_name: str) -> str:
    """
    Find the schema file for a given message name.

    Args:
        input_dir: Directory to search in
        message_name: Name of the message to find ex: casp.002.001.06

    Returns:
        Full path to schema file or empty string if not found
    """
    for file in os.listdir(input_dir):
        if file.startswith(message_name):
            return os.path.join(input_dir, file)
    return ""


def generate_table_header(head_component: str) -> str:
    """
    Generate the HTML table header.

    Args:
        head_component: Document element from schema (Ex: SaleToPOIServiceResponseV06)

    Returns:
        HTML string containing table header
    """
    # remove Version StatusReportV07 => StatusReport
    return f'''
        <table class="fixed" cellpadding="7" cellspacing="0" id="{head_component}" title="{head_component}" style="1px solid #a6a6a6; border-collapse: collapse;width: 840px;">
            <thead>
                <tr style="background:#f2f2f2;font-size:8pt;font-style: italic;font-weight: bold;vertical-align: top;border: 1px solid #a6a6a6;border-collapse: collapse;">
                    <td style="width: 32px;font-size:10pt;border: 1px solid #a6a6a6;border-collapse: collapse;"><p lang="en-GB" class="western" style="text-align:center;color: #808080;">Lvl</p></td>
                    <td style="width:190px;font-size:10pt;border: 1px solid #a6a6a6;border-collapse: collapse;"><p lang="en-GB" class="western" style="text-align:left;color: #808080;">{head_component}</p></td>
                    <td style="width: 60px;font-size:10pt;border: 1px solid #a6a6a6;border-collapse: collapse;"><p lang="en-GB" class="western" style="text-align:center;color: #808080;">Mult</p></td>
                    <td style="width: 60px;font-size:10pt;border: 1px solid #a6a6a6;border-collapse: collapse;"><p lang="en-GB" class="western" style="text-align:center;color: #808080;">Rule</p></td>
                    <td style="width: 60px;font-size:10pt;border: 1px solid #a6a6a6;border-collapse: collapse;"><p lang="en-GB" class="western" style="text-align:center;color: #808080;">Cstr</p></td>
                    <td style="width:438px;font-size:10pt;border: 1px solid #a6a6a6;border-collapse: collapse;"><p lang="en-GB" class="western" style="text-align:left;color: #808080;">Usage</p></td>
                </tr>
            </thead>
    '''


def load_previous_version_html(message_name: str, element_type: str) -> BeautifulSoup:
    """
    Load and parse the HTML file from the previous version.
    Args:
        message_name: Name of the message to load
    Returns:
        BeautifulSoup object containing the parsed HTML
    """

    if (element_type == ''):
        with open(file=os.path.join(PREVIOUS_VERSION_DIR, message_name+".html"), mode='r', encoding="UTF-8") as file:
            soup = BeautifulSoup(markup=file, features='lxml')
    else:
        # Remove digits from the element type contentInformationType33 => contentInformationType
        # TODO : improve using previous version attribute in repository
        element_type_without_digits = re.sub(r'\d+$', '', element_type)
        if (element_type + ".html") in os.listdir(PREVIOUS_VERSION_DIR):
            logger.debug(
                f"Found same version in {os.path.join(PREVIOUS_VERSION_DIR, element_type + ".html")} for {element_type}")
            with open(file=os.path.join(PREVIOUS_VERSION_DIR, element_type + ".html"), mode='r', encoding="UTF-8") as file:
                soup = BeautifulSoup(markup=file, features='lxml')
        else:
            # try to find anotther version of the element\_type
            for filename in os.listdir(PREVIOUS_VERSION_DIR):
                # Check if the filename (without extension) matches the element type without digits
                if filename.lower().startswith(element_type_without_digits.lower()) and filename.lower().endswith('.html'):
                    logger.debug("Found another version for " +
                                 element_type + " ; Using file " + filename)
                    with open(file=os.path.join(PREVIOUS_VERSION_DIR, filename), mode='r', encoding="UTF-8") as file:
                        soup = BeautifulSoup(markup=file, features='lxml')
                    break
            logger.info("No previous version found for " + element_type)

    return soup


def load_v5_version_html(message_name: str, element_type: str) -> BeautifulSoup:
    """
    Load and parse the HTML file from the v5 specific version.
    Args:
        message_name: Name of the message to load
    Returns:
        BeautifulSoup object containing the parsed HTML
    """

    if (element_type == ''):
        with open(file=os.path.join(V5_VERSION_DIR, message_name+".html"), mode='r', encoding="UTF-8") as file:
            soup = BeautifulSoup(markup=file, features='lxml')
    else:
        # Remove digits from the element type contentInformationType33 => contentInformationType
        # TODO : improve using previous version attribute in repository
        element_type_without_digits = re.sub(r'\d+$', '', element_type)
        if (element_type + ".html") in os.listdir(V5_VERSION_DIR):
            logger.debug("v5: Found same version in " +
                         V5_VERSION_DIR + " for " + element_type)
            with open(file=os.path.join(V5_VERSION_DIR, element_type + ".html"), mode='r', encoding="UTF-8") as file:
                soup = BeautifulSoup(markup=file, features='lxml')
        else:
            # try to find anotther version of the element\_type
            for filename in os.listdir(V5_VERSION_DIR):
                # Check if the filename (without extension) matches the element type without digits
                if filename.lower().startswith(element_type_without_digits.lower()) and filename.lower().endswith('.html'):
                    logger.debug("V5 : Found another version for " +
                                 element_type + " ; Using file " + V5_VERSION_DIR + filename)
                    with open(file=os.path.join(V5_VERSION_DIR, filename), mode='r', encoding="UTF-8") as file:
                        soup = BeautifulSoup(markup=file, features='lxml')
                    break
    return soup


def parse_repository(iso2002_repository_file: str) -> tuple[dict[str, str], dict[str, dict[str, str]]]:
    """
    use swift repository to associate message component names and xmlTags
    needed because XML schema 2023 does not contain Long name
    (not needed in XML Schema 2024 with annotations)
    Args:
        message_name: ISO20022 repository file

    Returns:
        Dictionary with xml_tags and name for elements, and message definitions
        Dictionary associating message name with message building blocks tag/names {'SaleToPOIServiceRequestV06',{'SctyTrlr','SecurityTrailer'}}

    """
    logger.info("Parsing repository for messageElement and messageDefinition")
    root = minidom.parse(file=iso2002_repository_file)

    elements = root.getElementsByTagName('messageElement')
    msg_defs = root.getElementsByTagName('messageDefinition')
    message_tags: dict[str, dict[str, str]] = {}

    for elt in elements:
        # logger.debug("EltName: "+elt.attributes['name'].value)
        if 'xmlTag' in elt.attributes and 'name' in elt.attributes:
            # logger.debug(elt.attributes['name'].value+"="+elt.attributes['xmlTag'].value)
            element_tags[elt.attributes['xmlTag'].value] = elt.attributes['name'].value
    for msg in msg_defs:
        # logger.debug("MessageName: "+elt.attributes['name'].value)
        if 'name' in msg.attributes and 'xmlTag' in msg.attributes:
            # logger.debug(msg.attributes['name'].value+"="+msg.attributes['xmlTag'].value)
            element_tags[msg.attributes['xmlTag'].value] = msg.attributes['name'].value
            message_blocks = msg.getElementsByTagName('messageBuildingBlock')
            mbbs: dict[str, str] = {}
            # for each message get message Building blocks tags and names
            for mbb in message_blocks:
                if 'name' in mbb.attributes and 'xmlTag' in mbb.attributes:
                    mbbs[mbb.attributes['xmlTag'].value] = mbb.attributes['name'].value
            message_tags[msg.attributes['name'].value] = mbbs

    # logger.debug(sizeof(xmlTags.values).)
    logger.info(
        "================================================================")
    # Read in the file where xmlTags must be replaced with the full name of the message component
    return element_tags, message_tags


def previous_version_lookup(previous_version: BeautifulSoup, elt_name: str, elt_type: str, elt_mult: str) -> tuple[int, str, str, str]:
    """
    Compare current version with previous version to determine if changes or new.
    Args:
        elt_name: Element name to look up
        elt_type: Element type
        elt_mult: Element multiplicity
    Returns:
        Tuple containing (status, previous_usage, rule, constraint)
    """
    status: int = STATUS_NOCHANGE
    found: bool = False
    prev_usage: str = ''  # '<b><font color="#d35400">TO VERIFY!!</font></b>'
    rule: str = ""
    constraint: str = ""

    if previous_version is not None:
        for row in previous_version.findAll(name="tr"):
            cells = row.findAll("td")
            level: str = cells[0].text.strip()
            name: str = cells[1].text.strip()
            mult: str = cells[2].text.strip()
            rule: str = cells[3].text.strip()
            constraint: str = cells[4].text.strip()
            usage = ""
            # usage may have html tags inside of it so we need to agregates all contents
            usage = cells[5].decode_contents().replace(
                "\n", "").replace("\t", "")

            usage: str = re.sub(
                r'<br/>$', ' ', usage)

            # not needed anymore
            # usage=re.sub(r"&nbsp([^;])", '\\1', usage)
            if (elt_type in usage) and (elt_name in name):
                # logger.info(f"Found {elt_name} - Usage {usage}")
                prev_usage = usage
                # Check if multiplicity has changed
                if elt_mult != mult:
                    logger.debug(f"Found {elt_name} - Usage {usage}")
                    status = STATUS_UPDATED
                found = True
                break
            # try to identify update of Elements (as GenericIdentificationXXX) and CodeSet (like CardPaymentServiceTypeXXCode )
            if ((re.sub('[0-9]+', '', elt_type) in usage) or (re.sub('[0-9]+Code', '', elt_type) in usage)) and (elt_name in name):
                logger.debug(f"!!!!!!!!!!!!!!!!!!Found UPDATE {elt_name} {
                             elt_type}- Previous Usage {usage}")
                # prev_usage = usage + f' TO VERIFY <br/> UPDATE TO {elt_type}  '
                status = STATUS_UPDATED
                found = True
                break
        if not (found):
            logger.debug(f"!!!!!!!!!!!!!!!!!!NEW {elt_name} {elt_type}")
            found = True
            status = STATUS_NEW

        # clean previous ref to endpoint
        prev_usage: str = re.sub(r'See(.*)$', '', prev_usage)

    return status, prev_usage, rule, constraint


def V5_special_lookups(v5_version: BeautifulSoup, elt_name: str, elt_type: str, elt_mult: str) -> int:
    """
    special compare with v5 to update status only

    Returns:
        status
    """
    status: int = STATUS_NOCHANGE
    found: bool = False

    if v5_version is not None:
        for row in v5_version.findAll(name="tr"):
            cells = row.findAll("td")
            level: str = cells[0].text.strip()
            name: str = cells[1].text.strip()
            mult: str = cells[2].text.strip()
            usage: str = cells[5].text.strip()

            if (elt_type in usage) and (elt_name in name):
                # logger.info(f"Found {elt_name} - Usage {usage}")
                # Check if multiplicity has changed
                if elt_mult != mult:
                    logger.debug(f"!!!!!!!!!!!!!!!!!!F V5 UPDATE Found {elt_name} {
                                 elt_mult} changed from {mult}- Usage {usage}")
                    status = STATUS_UPDATED
                found = True
                break
            # try to identify update of Elements (as GenericIdentificationXXX) and CodeSet (like CardPaymentServiceTypeXXCode )
            if ((re.sub('[0-9]+', '', elt_type) in usage) or (re.sub('[0-9]+Code', '', elt_type) in usage)) and (elt_name in name):
                logger.debug(f"!!!!!!!!!!!!!!!!!!Found UPDATE from V5 for {
                             elt_name} {elt_type}- Previous {usage}")
                # not needed anymore
                # prev_usage = usage + f' TO VERIFY <br/> UPDATE TO {elt_type}  '
                status = STATUS_UPDATED
                found = True
                break
        if not (found):
            logger.debug(f"!!!!!!!!!!!!!!!!!!NEW {elt_name} {
                         elt_type} NOT FOUND IN V5")
            found = True
            status = STATUS_NEW

    return status


def process_schema_elements(message_name: str, xsd_element, level: int, previous_version: BeautifulSoup, v5_version: BeautifulSoup) -> str:
    """
    Recursively process and format element children into HTML table rows.

    Args:
        xsd_element: Current element being processed
        level: Current nesting level
        previous_version: BeautifulSoup object containing the previous version HTML
        v5_version: BeautifulSoup object containing the v5 version HTML
    Returns:
        HTML string containing formatted table rows
    """
    html_table_rows = ""

    # Extract element metadata
    element_info = get_element_info(message_name, xsd_element)

    # Handle special case where name ends with a number or V+Number such as ReversalResponseV03 or ServiceResponse7
    element_info['name'] = re.sub(r'V[0-9]+$', '', element_info['name'])
    element_info['name'] = re.sub(r'[0-9]+$', '', element_info['name'])

    # Process element multiplicity
    mult_info = get_multiplicity_info(xsd_element)

    elt_status = STATUS_NOCHANGE
    elt_rule = ""
    elt_constraint = ""
    elt_name: str = element_info['name']
    elt_type = element_info['type']
    elt_mult = mult_info['multiplicity']
    elt_def = element_info['definition']
    elt_tag = element_info['tag']

    elt_usage = ""

    # Handle special cases and generate row HTML
    if level > 2:
        if (COMPARE_TO_PREVIOUS_VERSION):
            elt_status, prev_usage, elt_rule, elt_constraint = previous_version_lookup(previous_version,
                                                                                       elt_name, elt_type, elt_mult)
            elt_usage = elt_usage + \
                clean_previous_usage(prev_usage, elt_type)

        if is_endpoint(elt_type) and elt_type:
            linebreak: str = "<br/>" if elt_usage else ""
            elt_usage = f'{elt_usage}{linebreak}See MDR for sub elements and <a href="#{
                elt_type}">{elt_type}</a>'

        row_color = get_status_color(elt_status)

        if (SPECIAL_COMPARE_V5):
            elt_status = V5_special_lookups(
                v5_version, elt_name, elt_type, elt_mult)
            row_color = get_status_color(elt_status)

        html_table_rows += generate_table_row(
            level=level-2,
            element_info=element_info,
            mult_info=mult_info,
            prev_info={
                'usage': elt_usage,
                'rule': elt_rule,
                'constraint': elt_constraint
            },
            color=row_color,
            indent_level=level
        )

    # Recursively process children if not an endpoint
    if element_info['type']:
        for xsd_component in xsd_element.iterchildren():
            try:
                if (xsd_component.local_name is not None) and not (is_endpoint(element_info['type'])):
                    html_table_rows += process_schema_elements(message_name,
                                                               xsd_component, level + 1, previous_version, v5_version)
                else:
                    logger.debug(
                        msg=f"endpoint reached: {element_info['type']}")
            except TypeError as te:
                logger.error(f"TypeError: {te}")

    return html_table_rows


def process_endpoint_elements(xsd_element, level, previous_version, v5_version: BeautifulSoup) -> str:
    """
    Recursively process and format element children into HTML table rows.

    Args:
        elt: Current element being processed
        level: Current nesting level
        previous_version: BeautifulSoup object containing the previous version HTML
        v5_version: BeautifulSoup object containing the v5 version HTML
    Returns:
        HTML string containing formatted table rows
    """

    html_table_rows = ""

    # Extract element metadata
    # we are in a endpoint so metadat is not related to a message
    element_info = get_element_info("", xsd_element)

    # Handle special case where name ends with a number or V+Number such as ReversalResponseV03 or ServiceResponse7
    element_info['name'] = re.sub(r'V[0-9]+$', '', element_info['name'])
    element_info['name'] = re.sub(r'[0-9]+$', '', element_info['name'])

    # Process element multiplicity
    mult_info = get_multiplicity_info(xsd_element)

    elt_status = STATUS_NOCHANGE
    elt_rule = ""
    elt_constraint = ""
    elt_name: str = element_info['name']
    elt_type = element_info['type']
    elt_mult = mult_info['multiplicity']
    elt_def = element_info['definition']
    elt_tag = element_info['tag']

    # skip the 1st element which is the endpoint itself

    if (level > 1):
        elt_usage = ""
        if (COMPARE_TO_PREVIOUS_VERSION):
            elt_status, prev_usage, elt_rule, elt_constraint = previous_version_lookup(previous_version,
                                                                                       elt_name, elt_type, elt_mult)
            elt_usage = elt_usage + \
                clean_previous_usage(prev_usage, elt_type)

        if is_endpoint(elt_type) and elt_type and ENDPOINTS_IN_ENDPOINT:
            elt_usage = f'{elt_usage}<br>See MDR for sub elements and <a href="#{
                elt_type}">{elt_type}</a>'

        row_color = get_status_color(elt_status)

        if (SPECIAL_COMPARE_V5):
            elt_status = V5_special_lookups(
                v5_version, elt_name, elt_type, elt_mult)
            row_color = get_status_color(elt_status)

        html_table_rows += generate_table_row(
            level=level-1,
            element_info=element_info,
            mult_info=mult_info,
            prev_info={
                'usage': elt_usage,
                'rule': elt_rule,
                'constraint': elt_constraint
            },
            color=row_color,
            indent_level=level
        )

    # Recursively process children
    for xsd_component in xsd_element.iterchildren():
        try:
            if (xsd_component.type.local_name is not None) and not ((is_endpoint(element_info['type']) and ENDPOINTS_IN_ENDPOINT) and (level > 1)):
                html_table_rows += process_endpoint_elements(
                    xsd_component, level + 1, previous_version, v5_version)
            else:
                logger.debug(msg=f"endpoint reached: {element_info['type']}")
        except TypeError as te:
            logger.error(f"TypeError: {te}")

    return html_table_rows


def get_element_info_XML2024(elt) -> dict:
    """
    Extract basic information from an element.
    NEDS NEW XML SCHEMA 2024


    Args:
        elt: Element to process

    Returns:
        Dictionary containing element information
    """
    info = {
        'name': ' - ',
        'definition': ' - ',
        'tag': ' - ',
        'type': ' - '
    }

    if len(elt.annotations) > 0:
        info['name'] = elt.annotations[0].documentation[1].text
        info['definition'] = elt.annotations[0].documentation[0].text
        info['tag'] = elt.local_name

    if 'type' in elt.schema_elem.attrib:
        info['type'] = elt.elem.attrib['type']

    if info['type'].endswith("Code"):
        info['definition'] = (info['definition'] +
                              iso_repository_description[info['type']]['def'])

    return info


def get_element_info(message_name, elt) -> dict[str, str]:
    """
    Extract basic information from an element.

    Args:
        message_name : a message name like StatusReportV07
        elt: XML schema Element to process

    Returns:
        Dictionary containing element information
    """
    info = {
        'name': ' - ',
        'definition': ' - ',
        'tag': ' - ',
        'type': ' - '
    }
    if not (elt.type is None):
        info['type'] = getattr(elt.type, 'local_name')
        # Context: endpoint
        if (message_name == ""):
            info['name'] = element_tags[getattr(
                elt, 'local_name')] if getattr(elt, 'local_name') in element_tags else info['type']
        else:
            # Context : message
            info['name'] = message_tags[message_name][getattr(
                elt, 'local_name')] if getattr(elt, 'local_name') in message_tags[message_name] else element_tags[getattr(
                    elt, 'local_name')] if getattr(elt, 'local_name') in element_tags else info['type']

        info['definition'] = iso_repository_description[info['type']
                                                        ]['def'] if info['type'] in iso_repository_description else ' - '
        info['tag'] = getattr(elt, 'local_name')

    return info


def get_multiplicity_info(elt) -> dict:
    """
    Extract multiplicity information from an element and format it [min..max]

    Args:
        elt: XML schema Element to process

    Returns:
        Dictionary containing multiplicity information
    """
    max_occurs = '*' if elt.effective_max_occurs is None else elt.effective_max_occurs
    return {
        'min': elt.effective_min_occurs,
        'max': max_occurs,
        'multiplicity': f'[{elt.effective_min_occurs}..{max_occurs}]'
    }


def get_status_color(status: int) -> str:
    """
    Get the color code for a given status.

    Args:
        status: Status code (NOCHANGE, UPDATED, NEW, or DELETED)

    Returns:
        Hex color code string
    """
    status_colors = {
        STATUS_NOCHANGE: "#000000",
        STATUS_UPDATED: "#28b463",
        STATUS_DELETED: "#5d6d7e",
        STATUS_NEW: "#2874a6"
    }
    return status_colors.get(status, "#000000")


def clean_previous_usage(usage: str, elt_type: str) -> str:
    """
    Clean up the previous usage text by removing unnecessary elements.

    Args:
        usage: Original usage text
        elt_type: Element type

    Returns:
        Cleaned usage text
    """
    # Remove <tag>::type pattern
    usage = re.sub(r"<i>&lt;\w+&gt;::\w+<\/i>", '', usage)
    # Remove useless sentence when endpoint
    # not needed anymore
    # usage = re.sub(r"See MDR(.*)trouvée.", '', usage)

    # Remove Initial line break if any
    usage = re.sub(r"<br/>$", ' ', usage)
    # Remove ending line break if any
    # # not needed anymore
    # usage = re.sub(r"^^<br/>", ' ', usage)
    # sometimes we find non breaking spaces misssing the semi comma ;
    # not needed anymore
    # usage = re.sub(r"&nbsp([^;])", ' \\1', usage)
    return usage


def generate_table_row(level: int, element_info: dict, mult_info: dict,
                       prev_info: dict, color: str, indent_level: int) -> str:
    """
    Generate an HTML table row for an element.
    Note: Libreoffice does not recognize styling text at tr level, so we have to apply it to td level

    Args:
        level: Display level number
        element_info: Dictionary containing element information
        mult_info: Dictionary containing multiplicity information
        prev_info: Dictionary containing previous version information
        color: Color code for the row
        indent_level: Level of indentation

    Returns:
        HTML string for the table row
    """
    indent = multStr(ROW_LEVEL_INDENT, indent_level)
    if (prev_info['usage'] != ""):
        prev_info['usage'] = prev_info['usage']+"<br/>"
    else:
        prev_info['usage'] = "<!--ISODEF-->" + \
            iso_repository_description[element_info['type']
                                       ]['def'] + "<!--/ISODEF-->"

    # add ISO Definition for codeset if usage does not precise a single value allowed
    if re.match(r'(.*[0-9]+)Code', element_info['type']) and not ('value must' in (prev_info['usage']).lower()):
        prev_info['usage'] = prev_info['usage']+"<br/>" + \
            "<!--ISODEF-->" + \
            iso_repository_description[element_info['type']
                                       ]['def'] + "<!--/ISODEF-->"

    return f'''
    <tr id="{element_info['name']}.{element_info['type']}" class="" style="">
        <td style="width: 32px;color:{color};font-size:10pt;vertical-align:middle;text-align:left;border: 1px solid #a6a6a6;">{level}</font></td>
        <td style="width:190px;color:{color};font-size:10pt;vertical-align:middle;text-align:left;border: 1px solid #a6a6a6;">{indent}{element_info['name']}</td>
        <td style="width: 60px;color:{color};font-size:10pt;vertical-align:middle;text-align:center;border: 1px solid #a6a6a6;">{mult_info['multiplicity']}</td>
        <td style="width: 60px;color:{color};font-size:10pt;vertical-align:middle;text-align:center;border: 1px solid #a6a6a6;">{prev_info['rule']}</td>
        <td style="width: 60px;color:{color};font-size:10pt;vertical-align:middle;text-align:center;border: 1px solid #a6a6a6;">{prev_info['constraint']}</td>
        <td style="width:438px;color:{color};font-size:10pt;vertical-align:middle;text-align:left;border: 1px solid #a6a6a6;">{prev_info['usage']}<i>&lt;{element_info['tag']}&gt;::{element_info['type']}</i></td>
    </tr>'''


def multStr(char: str, n: int) -> str:
    """
    Create a string by repeating a character n times.

    Args:
        char: Character or string to repeat
        n: Number of times to repeat

    Returns:
        Repeated string
    """
    return char * n


def write_html(html_str: str, file_path: str) -> None:
    """
    Write HTML content to a file with proper encoding.

    Args:
        html_str: HTML content to write
        file_path: Path to output file

    Raises:
        IOError: If file cannot be written
    """
    try:
        with open(file_path, mode="w", encoding='utf-8') as html_file:
            html_file.write(html_str)
        # logger.info(f"Successfully wrote {file_path}")
    except IOError as ioe:
        logger.error(f"Error writing file {file_path}: {ioe}")


def load_json(file_path: str) -> dict:
    """
    Load and parse a JSON file.

    Args:
        file_path: Path to JSON file

    Returns:
        Dictionary containing parsed JSON data

    Raises:
        FileNotFoundError: If file doesn't exist
        json.JSONDecodeError: If JSON is invalid
    """
    try:
        with open(file_path, mode='r', encoding='utf-8') as file:
            return json.load(file)
    except FileNotFoundError:
        logger.error(f"Error: File not found: {file_path}")
        raise
    except json.JSONDecodeError as jsone:
        logger.error(f"Error: Invalid JSON in {file_path}: {jsone}")
        raise


def load_description() -> dict[str, dict[str, str]]:
    """
    Load ISO20022 repository description from JSON file.

    Returns:
        Dictionary containing repository description
    """
    logger.info("Loading repository description from JSON file")
    return load_json(REPO_DESC_FILE)


def validate_paths() -> bool:
    """
    Validate that all required paths and files exist.

    Returns:
        True if all paths are valid, False otherwise
    """
    required_paths = {
        'Schema Directory': SCHEMA_DIR,
        'Output Directory': OUTPUT_DIR,
        'Previous Version Directory': PREVIOUS_VERSION_DIR,
        'ISO20022 Model': ISO20022_MODEL,
        'Repository Description File': REPO_DESC_FILE
    }

    all_valid = True
    for name, path in required_paths.items():
        if not os.path.exists(path):
            logger.error(f"Error: {name} not found: {path}")
            all_valid = False

    return all_valid


def setup_output_directory() -> None:
    """
    Ensure output directory exists and is writable.

    Raises:
        OSError: If directory cannot be created or is not writable

    """
    try:
        os.makedirs(OUTPUT_DIR, exist_ok=True)
        # Test if directory is writable
        test_file = os.path.join(OUTPUT_DIR, '.test')
        try:
            with open(test_file, 'w', encoding='UTF-8') as f:
                f.write('test')
            os.remove(test_file)
        except IOError as ioe:
            logger.error(f"Error: Output directory is not writable: {ioe}")
            raise
    except OSError as ose:
        logger.critical(f"Error creating output directory: {ose}")
        raise


def process_schema(xs: xmlschema.XMLSchema, endpoint_elts: dict[str, xmlschema.XsdElement]):
    # Process main message
    global iso_repository_description

    generate_message_table_from_schema(
        SCHEMA_DIR, xs, OUTPUT_DIR)  # type: ignore

    if GENERATE_ENDPOINTS:
        for element_type, endpoint_elt in list(endpoint_elts.items()):
            logger.info("=" * 60)
            logger.info("-" * 16+f"Processing endpoint {element_type}")
            generate_message_table_xsd_endpoint(
                xs.name, OUTPUT_DIR, element_type, endpoint_elt)  # type: ignore
            logger.info("-" * 16+f"Processing endpoint {element_type} DONE")


def main() -> None:
    """
    Main execution function with proper error handling.
    """
    try:
        logger.info("=" * 132)
        logger.info(
            "Generate HTML message / components tables from ISO20022 repository")
        logger.info(
            "Needs ISO20022 repository downloadable from ISO20022 website and XML Schema folder to work with")
        logger.info("=" * 132)

        # Validate environment
        if not validate_paths():
            logger.critical(
                "Error: Invalid paths detected. Please check configuration.")
            return
        setup_output_directory()

        # Print configuration
        logger.info(f"SCHEMA_DIR: {SCHEMA_DIR}")
        logger.info(f"OUTPUT_DIR: {OUTPUT_DIR}")
        logger.info(f"ISO20022_MODEL: {ISO20022_MODEL}")

        # Initialize required data
        global endpoints, iso_repository_description, bs_previous_html, element_tags, message_tags
        # Load static information
        endpoints = load_endpoints()
        iso_repository_description = load_description()
        elements_tags, message_tags = parse_repository(ISO20022_MODEL)

        # Process whole directory

        for file in os.listdir(SCHEMA_DIR):
            if file.endswith(".xsd"):
                schema_name = file.split('.xsd')[0]
                logger.info("=" * 80)
                logger.info(f"Processing schema: {schema_name}...")
                # Prepare data from XMLSchema
                xs = xmlschema.XMLSchema(os.path.join(SCHEMA_DIR, file))
                doc = xs.elements['Document']
                endpoints_elts: dict[str,
                                     xmlschema.validators.elements.XsdElement] = {}
                if (doc is None):
                    logger.error(
                        f"Error: Document element not found in schema: {schema_name}... skipping.")
                else:
                    endpoints_elts = collect_all_endpoints_elements(
                        doc, endpoints_elts)
                    process_schema(xs, endpoints_elts)
                    logger.info(f"Processing schema: {schema_name}... DONE")
                    logger.info("=" * 80)
    except Exception as ge:
        logger.critical(f"An error occurred: {ge}")
        traceback.print_exc()


# Load the config file
with open(LOG_CONFIGURATION_FILE, 'rt') as f:
    config = yaml.safe_load(f.read())

# Configure the logging module with the config file
logging.config.dictConfig(config)
logger = logging.getLogger('development')

if __name__ == '__main__':
    main()
