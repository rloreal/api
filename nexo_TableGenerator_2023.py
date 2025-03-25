# Standard library imports
import csv
import json
from math import e
import os
import re
import traceback
import logging
from typing import List, Tuple
from xml.dom import minidom
import xmlschema

# Third-party imports
from bs4 import BeautifulSoup

# Constants and Configuration
ISO20022_MODEL = 'C:/Users/romai/OneDrive/Documents/NEXO/20240411_ISO20022_2013_eRepository.iso20022'
REPO_DESC_FILE = "C:/Users/romai/OneDrive/Documents/NEXO/api/" + \
    os.path.basename(ISO20022_MODEL) + ".description.json"
PREVIOUS_VERSION_NUMBER = "02"
ROW_LEVEL_INDENT = "&nbsp;&nbsp;"

OUTPUT_DIR = "C:/Users/romai/OneDrive/Documents/NEXO/api/casp_v5/NEW_HTML/ENDPOINTS/"
SCHEMA_DIR = "C:/Users/romai/OneDrive/Documents/NEXO/api/casp_v5/"
PREVIOUS_VERSION_DIR = "C:/Users/romai/OneDrive/Documents/NEXO/api/casp_v5/HTML/"
V5_VERSION_DIR = "C:/Users/romai/OneDrive/Documents/NEXO/api/casp_v2/NEW_HTML/"
# Set this to False if you don't want to generate endpoint tables
GENERATE_ENDPOINTS = True
COMPARE_TO_PREVIOUS_VERSION = True
ENDPOINT_COMPARE_TO_PREVIOUS_VERSION = True
SPECIAL_COMPARE_V5= True
DO_NOT_STOP_AT_ENPOINT = True

#OUTPUT_DIR = "C:/Users/romai/OneDrive/Documents/NEXO/api/casp_v2/NEW_HTML/"
#SCHEMA_DIR = "C:/Users/romai/OneDrive/Documents/NEXO/api/casp_v2/"
#PREVIOUS_VERSION_DIR = "C:/Users/romai/OneDrive/Documents/NEXO/api/casp_v5/HTML/"
#V5_VERSION_DIR = "C:/Users/romai/OneDrive/Documents/NEXO/api/casp_v2/NEW_HTML/"
## Set this to False if you don't want to generate endpoint tables
#GENERATE_ENDPOINTS = True
#COMPARE_TO_PREVIOUS_VERSION = False
#ENDPOINT_COMPARE_TO_PREVIOUS_VERSION = False
#SPECIAL_COMPARE_V5 = False

# Status Constants
STATUS_NOCHANGE = 0
STATUS_UPDATED = 1
STATUS_NEW = 2
STATUS_DELETED = 4

# Global variables
logging.config.fileConfig('nexo_table_generator_logging.yaml')
logger = logging.getLogger(__name__)
endpoints: dict[str, str] = {}
business_area: str = ""
iso_repository_description: dict[str, dict[str, str]] = {}
bs_previous_html: BeautifulSoup
xml_tags: dict[str, str] = {}
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
    }
    tr.updated {
        font-color: #28b463; 
    }
    tr.new {
        font-color: #2874a6; 
    }
    tr.deleted {
        font-color: #666666; 
        text-decoration: line-through;
    }

    table.fixed td { word-wrap: break-word; }
    table.fixed td:nth-of-type(1) { width: 32px; }
    table.fixed td:nth-of-type(2) { width: 190px; }
    table.fixed td:nth-of-type(3) { width: 48px; }
    table.fixed td:nth-of-type(4) { width: 48px; }
    table.fixed td:nth-of-type(5) { width: 48px; }
    table.fixed td:nth-of-type(6) { width: 474px; }
</style>"""

HTML_BODY = '''
    <body>
    <div title="header">
    <p lang="en-GB" class="western" align="center"
    style="line-height: 95%; margin-top: 0.21cm; margin-bottom: 0.5cm;
    border-top: none; border-bottom: 1px solid #a6a6a6; border-left: none;
    border-right: none; padding: 0cm 0.04cm;">
    <br>
    </p>
    </div>
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




def generate_message_table_xsd_endpoint(message_name: str, output_dir: str, element_type: str,endpoint_elt) -> None:
    """
    Generate HTML table for a endpoint.
    Args:
        input_dir: Directory containing input schema files
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
            logger.info(f"Error loading previous version HTML for {
                element_type}: {preve}")
    
    if (SPECIAL_COMPARE_V5):
        try:
            v5_html = load_v5_version_html(
                message_name, element_type)
        except Exception as preve:
            logger.info(f"Error loading v5 version HTML for {
                element_type}: {preve}")

    # Generate table content
    html_table_head = generate_table_header("Element name")
    html_table_rows = process_endpoint_elements(
        endpoint_elt, 1, previous_html)


    # Combine all HTML parts
    html_full = (
        html_header +
        HTML_BODY +
        html_table_head +
        html_table_rows +
        """"
        </table>
        <p lang="en-GB" class="western" style="line-height: 100%; margin-top: 0.21cm; margin-bottom: 0cm">
        <br/>
        </p>
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


def generate_message_table_from_schema(input_dir: str, message_name: str, output_dir: str) -> None:
    """
    Generate HTML table for a specific message or sub-element.
    Args:
        input_dir: Directory containing input schema files
        message_name: Name of the message to process
        output_dir: Directory to write output HTML files
        element_type: Optional type of sub-element to process
    """
    # Initialize HTML structure
    html_header = f"<html><head>{HTML_STYLE}<title>{message_name}</title></head>"
   

    # Find schema file
    schema_file = find_schema_file(input_dir, message_name)
    if not schema_file:
        logger.info(f"XML Schema for {message_name} not found")
        return

    # Process schema
    logger.info(f"Processing {schema_file}")
    global business_area
    previous_html:BeautifulSoup = BeautifulSoup()
    business_area = message_name[0:4]
    xs = xmlschema.XMLSchema(schema_file)
    doc = xs.elements['Document']
    #get message full name
    message_title=message_name
    v5_html: BeautifulSoup = BeautifulSoup()

    try:
        for elt in doc.iterchildren():
            message_title = xml_tags[elt.local_name][:-3]
            break
    except Exception as ex:
        logger.info(f"Error while getting message title : {ex}")   

    if (COMPARE_TO_PREVIOUS_VERSION):
        try:
            previous_html = load_previous_version_html(message_title, "")
        except Exception as preve:
            logger.info(f"Error loading previous version HTML for {
                message_title}: {preve}")

    if (SPECIAL_COMPARE_V5):
        try:
            v5_html = load_v5_version_html(
                message_title, "")
        except Exception as preve:
            logger.info(f"Error loading v5 version HTML for {
                message_title}: {preve}")
    # Generate table content
    html_table_head = generate_table_header(message_title)
    html_table_rows = process_schema_elements(doc, level=1, previous_version=previous_html, v5_version=v5_html)
    
    # Combine all HTML parts
    html_full = (
        html_header +
        HTML_BODY +
        html_table_head +
        html_table_rows +
        "</table></body></html>"
    )

    # Write output file
    output_filename = f"{message_title}.html"
    output_file = os.path.join(output_dir, output_filename)
    write_html(html_full, output_file)

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
    return f'''
        <table class="fixed" cellpadding="7" cellspacing="0" id="{head_component}">
            <thead>
                <tr>
                    <td bgcolor="#f2f2f2" style="background: #f2f2f2; border: 1px solid #a6a6a6; padding: 0cm 0.19cm">
                        <p lang="en-GB" class="western" align="center">
                            <font color="#808080"><font size="1" style="font-size: 8pt"><i><b>Lvl</b></i></font></font>
                        </p>
                    </td>
                    <td valign="top" bgcolor="#f2f2f2" style="background: #f2f2f2; border: 1px solid #a6a6a6; padding: 0cm 0.19cm">
                        <p lang="en-GB" class="western">
                            <font color="#808080" size="1" style="font-size: 8pt">
                                <i><b>{head_component}</b></i>
                            </font>
                        </p>
                    </td>
                    <td valign="top" bgcolor="#f2f2f2" style="background: #f2f2f2; border: 1px solid #a6a6a6; padding: 0cm 0.19cm">
                        <p lang="en-GB" class="western" align="center">
                            <font color="#808080"><font size="1" style="font-size: 8pt"><i>Mult</i></font></font>
                        </p>
                    </td>
                    <td valign="top" bgcolor="#f2f2f2" style="background: #f2f2f2; border: 1px solid #a6a6a6; padding: 0cm 0.19cm">
                        <p lang="en-GB" class="western" align="center">
                            <font color="#808080"><font size="1" style="font-size: 8pt"><i><b>Rule</b></i></font></font>
                        </p>
                    </td>
                    <td valign="top" bgcolor="#f2f2f2" style="background: #f2f2f2; border: 1px solid #a6a6a6; padding: 0cm 0.19cm">
                        <p lang="en-GB" class="western" align="center">
                            <font color="#808080"><font size="1" style="font-size: 8pt"><i><b>Cstr</b></i></font></font>
                        </p>
                    </td>
                    <td valign="top" bgcolor="#f2f2f2" style="background: #f2f2f2; border: 1px solid #a6a6a6; padding: 0cm 0.19cm">
                        <p lang="en-GB" class="western">
                            <font color="#808080"><font size="1" style="font-size: 8pt"><i><b>Usage</b></i></font></font>
                        </p>
                    </td>
                </tr>
            </thead>
    '''


def load_previous_version_html(message_name: str, element_type:str) -> BeautifulSoup:

    """
    Load and parse the HTML file from the previous version.
    Args:
        message_name: Name of the message to load
    Returns:
        BeautifulSoup object containing the parsed HTML
    """

    if (element_type==''):
        with open(file=os.path.join(PREVIOUS_VERSION_DIR, message_name+".html"), mode='r', encoding="UTF-8") as file:
            soup = BeautifulSoup(markup=file, features='lxml')
    else:
        # Remove digits from the element type
        element_type_without_digits = re.sub(r'\d+$', '', element_type)
        if (element_type + ".html") in os.listdir(PREVIOUS_VERSION_DIR):
            #logger.info("Found same version for " + element_type)
            with open(file=os.path.join(PREVIOUS_VERSION_DIR, element_type + ".html"), mode='r', encoding="UTF-8") as file:
                soup = BeautifulSoup(markup=file, features='lxml')
        else:
            #try to find anotther version of the element\_type
            for filename in os.listdir(PREVIOUS_VERSION_DIR):
                # Check if the filename (without extension) matches the element type without digits
                if filename.lower().startswith(element_type_without_digits.lower()) and filename.lower().endswith('.html'):
                    logger.info("Found another version for " + element_type + " ; Using file " + filename)
                    with open(file=os.path.join(PREVIOUS_VERSION_DIR, filename), mode='r', encoding="UTF-8") as file:
                        soup = BeautifulSoup(markup=file, features='lxml')
                    break
    return soup


def load_v5_version_html(message_name: str, element_type: str) -> BeautifulSoup:
    """
    Load and parse the HTML file from the previous version.
    Args:
        message_name: Name of the message to load
    Returns:
        BeautifulSoup object containing the parsed HTML
    """

    if (element_type == ''):
        with open(file=os.path.join(V5_VERSION_DIR, message_name+".html"), mode='r', encoding="UTF-8") as file:
            soup = BeautifulSoup(markup=file, features='lxml')
    else:
        # Remove digits from the element type
        element_type_without_digits = re.sub(r'\d+$', '', element_type)
        if (element_type + ".html") in os.listdir(PREVIOUS_VERSION_DIR):
            # logger.info("Found same version for " + element_type)
            with open(file=os.path.join(PREVIOUS_VERSION_DIR, element_type + ".html"), mode='r', encoding="UTF-8") as file:
                soup = BeautifulSoup(markup=file, features='lxml')
        else:
            # try to find anotther version of the element\_type
            for filename in os.listdir(PREVIOUS_VERSION_DIR):
                # Check if the filename (without extension) matches the element type without digits
                if filename.lower().startswith(element_type_without_digits.lower()) and filename.lower().endswith('.html'):
                    logger.info("Found another version for " +
                          element_type + " ; Using file " + filename)
                    with open(file=os.path.join(PREVIOUS_VERSION_DIR, filename), mode='r', encoding="UTF-8") as file:
                        soup = BeautifulSoup(markup=file, features='lxml')
                    break
    return soup


def parse_repository(iso2002_repository_file: str) -> dict[str, str]:
    
    """
    use swift repository to associate message component names and xmlTags
    needed because XML schema 2023 does not contain Long name
    (not needed in XML Schema 2024 with annotations)
    Args:
        message_name: ISO20022 repository file

    Returns:
        Dictionary with xml_tags and name
    """
    logger.info("Parsing repository for messageElement and messageDefinition")
    root = minidom.parse(file=iso2002_repository_file)

    elements = root.getElementsByTagName('messageElement')
    msg_defs = root.getElementsByTagName('messageDefinition')

    for elt in elements:
        # logger.info("EltName: "+elt.attributes['name'].value)
        if 'xmlTag' in elt.attributes and 'name' in elt.attributes:
            # logger.info(elt.attributes['name'].value+"="+elt.attributes['xmlTag'].value)
            xml_tags[elt.attributes['xmlTag'].value] = elt.attributes['name'].value
    for msg in msg_defs:
        # logger.info("MessageName: "+elt.attributes['name'].value)
        if 'name' in msg.attributes and 'xmlTag' in msg.attributes:
            # logger.info(msg.attributes['name'].value+"="+msg.attributes['xmlTag'].value)
            xml_tags[msg.attributes['xmlTag'].value] = msg.attributes['name'].value

    # logger.info(sizeof(xmlTags.values).)
    logger.info("================================================================")
    # Read in the file where xmlTags must be replaced with the full name of the message component
    return xml_tags


def previous_version_lookup(previous_version: BeautifulSoup,elt_name: str, elt_type: str, elt_mult: str) -> tuple[int, str, str, str]:
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
    prev_usage: str = '' #'<b><font color="#d35400">TO VERIFY!!</font></b>'
    rule:str=""
    constraint:str=""

    if previous_version is not None:
        for row in previous_version.findAll(name="tr"):
            cells = row.findAll("td")
            level: str = cells[0].text.strip()
            name: str = cells[1].text.strip()
            mult: str = cells[2].text.strip()
            rule: str = cells[3].text.strip()
            constraint: str = cells[4].text.strip()
            usage: str = re.sub('<br/>', ' ', cells[5].text.strip())

            if (elt_type in usage) and (elt_name in name):
                #logger.info(f"Found {elt_name} - Usage {usage}")
                prev_usage = usage
                # Check if multiplicity has changed
                if elt_mult != mult:
                    #logger.info(f"Found {elt_name} - Usage {usage}")
                    status = STATUS_UPDATED
                found = True
                break
            # try to indentify update of Elements (as GenericIdentificationXXX) and CodeSet (like CardPaymentServiceTypeXXCode )
            if ((re.sub('[0-9]+', '', elt_type) in usage) or (re.sub('[0-9]+Code', '', elt_type) in usage)) and (elt_name in name):
                #logger.info(f"!!!!!!!!!!!!!!!!!!Found UPDATE {elt_name} {elt_type}- Previous Usage {usage}")
                #prev_usage = usage + f' TO VERIFY <br/> UPDATE TO {elt_type}  '
                status = STATUS_UPDATED
                found = True
                break
        if not (found):
            #logger.info(f"!!!!!!!!!!!!!!!!!!NEW {elt_name} {elt_type}")
            found = True
            status = STATUS_NEW
        
        # cleen previous ref to endpoint
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
            usage: str = re.sub('<br/>', ' ', cells[5].text.strip())

            if (elt_type in usage) and (elt_name in name):
                #logger.info(f"Found {elt_name} - Usage {usage}")
                # Check if multiplicity has changed
                if elt_mult != mult:
                    logger.info(f"!!!!!!!!!!!!!!!!!!F V5 UPDATE Found {elt_name} {elt_mult} changed from {mult}- Usage {usage}")
                    status = STATUS_UPDATED
                found = True
                break
            # try to identify update of Elements (as GenericIdentificationXXX) and CodeSet (like CardPaymentServiceTypeXXCode )
            if ((re.sub('[0-9]+', '', elt_type) in usage) or (re.sub('[0-9]+Code', '', elt_type) in usage)) and (elt_name in name):
                logger.info(f"!!!!!!!!!!!!!!!!!!Found UPDATE from V5 for {elt_name} {elt_type}- Previous {usage}")
                #prev_usage = usage + f' TO VERIFY <br/> UPDATE TO {elt_type}  '
                status = STATUS_UPDATED
                found = True
                break
        if not (found):
            logger.info(f"!!!!!!!!!!!!!!!!!!NEW {elt_name} {elt_type} NOT FOUND IN V5")
            found = True
            status = STATUS_NEW

        # cleen previous ref to endpoint


    return status

def process_schema_elements(xsd_element, level, previous_version,v5_version) -> str:


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
    element_info = get_element_info2023(xsd_element)

    #Handle special case where name ends with a number or V+Number such as ReversalResponseV03 or ServiceResponse7
    element_info['name']=re.sub(r'V[0-9]+$', '', element_info['name'])
    element_info['name'] = re.sub(r'[0-9]+$', '', element_info['name'])
    # Process element multiplicity
    mult_info = get_multiplicity_info(xsd_element)

    elt_status = STATUS_NOCHANGE
    elt_rule = ""
    elt_constraint = ""
    elt_name:str = element_info['name']
    elt_type = element_info['type']
    elt_mult = mult_info['multiplicity']
    elt_def = element_info['definition']
    elt_tag = element_info['tag']

    elt_usage = ""

    # Handle special cases and generate row HTML
    if level > 2:
        if (COMPARE_TO_PREVIOUS_VERSION):
            elt_status, prev_usage, elt_rule, elt_constraint = previous_version_lookup(previous_version,
                elt_name,elt_type,elt_mult)
            elt_usage = elt_usage + \
                clean_previous_usage(prev_usage, elt_type)
        
        #if (elt_status == STATUS_NEW) and (elt_def != ""):
        #    elt_usage = f'Definition: {elt_def}<br>' + elt_usage

        if is_endpoint(elt_type) and elt_type:
            elt_usage = f'{elt_usage}<br>See MDR for sub elements and <a href="#{
                elt_type}">{elt_type}</a>'
        row_color = get_status_color(elt_status)

        if(SPECIAL_COMPARE_V5):
            elt_status = V5_special_lookups(v5_version, elt_name, elt_type, elt_mult)
            row_color = get_status_color(elt_status)

        elt_usage = re.sub(r'^<br/>', ' ', elt_usage)

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
    global endpoints_elements

    if is_endpoint(element_info['type']):
        endpoints_elements[element_info['type']] = xsd_element
        logger.debug("endpoint added " + element_info['type'])

    if element_info['type']:
        for xsd_component in xsd_element.iterchildren():
            try:
                if (xsd_component.local_name is not None) and not (is_endpoint(element_info['type'])):
                    html_table_rows += process_schema_elements(
                        xsd_component, level + 1, previous_version,v5_version)
            except TypeError as te:
                logger.info(f"TypeError: {te}")

        

    return html_table_rows


def process_endpoint_elements(xsd_element, level,previous_version) -> str:
    """
    Recursively process and format element children into HTML table rows.

    Args:
        elt: Current element being processed
        level: Current nesting level

    Returns:
        HTML string containing formatted table rows
    """
    html_table_rows = ""

    # Extract element metadata
    element_info = get_element_info2023(xsd_element)

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
    if (COMPARE_TO_PREVIOUS_VERSION):
        elt_status, prev_usage, elt_rule, elt_constraint = previous_version_lookup(previous_version,
            elt_name, elt_type, elt_mult)
        elt_usage = elt_usage + \
            clean_previous_usage(prev_usage, elt_type)
    elt_usage = re.sub(r'^<br/>', ' ', elt_usage)
    row_color = get_status_color(elt_status)
    html_table_rows += generate_table_row(
        level=level,
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
    global endpoints_elements

    if is_endpoint(element_info['type']):
        endpoints_elements[element_info['type']] = xsd_element
        logger.debug("endpoint in endpoint added " + element_info['type'])
    # Recursively process children
    for xsd_component in xsd_element.iterchildren():
        try:
            html_table_rows += process_endpoint_elements(
                xsd_component, level + 1, previous_version)
        except TypeError as te:
            logger.info(f"TypeError: {te}")

    return html_table_rows


def get_element_info(elt) -> dict:
    """
    Extract basic information from an element.

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


def get_element_info2023(elt) -> dict[str,str]:
    """
    Extract basic information from an element.

    Args:
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
    if not(elt.type is None):
        info['type'] = getattr(elt.type, 'local_name')
        info['name'] = xml_tags[getattr(
            elt, 'local_name')] if getattr(elt, 'local_name') in xml_tags else info['type']
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
    usage = re.sub(r"<\w+>::\w+", '', usage)
    # Remove useless sentence when endpoint
    usage = re.sub(r"See MDR(.*)trouvée.", '', usage)



    return usage


def generate_table_row(level: int, element_info: dict, mult_info: dict,
                       prev_info: dict, color: str, indent_level: int) -> str:
    """
    Generate an HTML table row for an element.

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

    return f'''
    <tr id="{element_info['name']}.{element_info['type']}" class="">
        <td style="background: transparent; border: 1px solid #a6a6a6; padding: 0cm 0.19cm">
            <p lang="en-GB" align="center"><font color="{color}">{level}</font></p>
        </td>
        <td valign="center" style="background: transparent; border: 1px solid #a6a6a6; padding: 0cm 0.19cm">
            <p lang="en-GB"><font color="{color}">{indent}{element_info['name']}</font></p>
        </td>
        <td valign="center" style="background: transparent; border: 1px solid #a6a6a6; padding: 0cm 0.19cm">
            <p lang="en-GB" align="center"><font color="{color}">{mult_info['multiplicity']}</font></p>
        </td>
        <td valign="center" style="background: transparent; border: 1px solid #a6a6a6; padding: 0cm 0.19cm">
            <p lang="en-GB" align="center"><font color="{color}">{prev_info['rule']}</font></p>
        </td>
        <td valign="center" style="background: transparent; border: 1px solid #a6a6a6; padding: 0cm 0.19cm">
            <p lang="en-GB" class="western" align="center"><font color="{color}">{prev_info['constraint']}</font></p>
        </td>
        <td valign="center" style="background: transparent; border: 1px solid #a6a6a6; padding: 0cm 0.19cm">
            <p lang="en-GB" align="left"><font color="{color}">{prev_info['usage']}
            <i>&lt;{element_info['tag']}&gt;::{element_info['type']}</i></font></p>
        </td>
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
        #logger.info(f"Successfully wrote {file_path}")
    except IOError as ioe:
        logger.info(f"Error writing file {file_path}: {ioe}")


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
        logger.info(f"Error: File not found: {file_path}")
        raise
    except json.JSONDecodeError as jsone:
        logger.info(f"Error: Invalid JSON in {file_path}: {jsone}")
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
            logger.info(f"Error: {name} not found: {path}")
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
            logger.info(f"Error: Output directory is not writable: {ioe}")
            raise
    except OSError as ose:
        logger.info(f"Error creating output directory: {ose}")
        raise




def process_schema(schema_name:str):
        # Process main message
    global endpoints, iso_repository_description, bs_previous_html

    #if (COMPARE_TO_PREVIOUS_VERSION):
    #    try:
    #        bs_previous_html = load_previous_version_html(schema_name, "")
    #    except Exception as e:
    #        logger.info(f"Error loading previous version HTML for {
    #            schema_name}: {e}")
    #        return

    # Generate the table for the main message
    generate_message_table_from_schema(SCHEMA_DIR, schema_name, OUTPUT_DIR)

    if GENERATE_ENDPOINTS:
        for element_type, endpoint_elt in list(endpoints_elements.items()):
            logger.info("=" * 60)
            logger.info("-" * 16+f"Processing endpoint {element_type}")
            try:
                if (ENDPOINT_COMPARE_TO_PREVIOUS_VERSION):
                    bs_previous_html = load_previous_version_html(
                        schema_name, element_type)
            except Exception as e:
                logger.info(f"Error loading previous version HTML for {
                        element_type}: {e}")
            generate_message_table_xsd_endpoint(
                schema_name, OUTPUT_DIR, element_type, endpoint_elt)


def main() -> None:
    """
    Main execution function with proper error handling.
    """
    try:
        logger.info("=" * 132)
        logger.info("Generate HTML message / components tables from ISO20022 repository")
        logger.info("Needs ISO20022 repository downloadable from ISO20022 website and XML Schema folder to work with")
        logger.info("=" * 132)

        # Validate environment
        if not validate_paths():
            logger.info("Error: Invalid paths detected. Please check configuration.")
            return
        setup_output_directory()

        # Print configuration
        logger.info(f"SCHEMA_DIR: {SCHEMA_DIR}")
        logger.info(f"OUTPUT_DIR: {OUTPUT_DIR}")
        logger.info(f"ISO20022_MODEL: {ISO20022_MODEL}")

        # Initialize required data
        global endpoints, iso_repository_description, bs_previous_html
        endpoints = load_endpoints()
        iso_repository_description = load_description()
        xml_tags = parse_repository(ISO20022_MODEL)

        # Process whole directory

        for file in os.listdir(SCHEMA_DIR):
            if file.endswith(".xsd"):
                schema_name = file.split('.xsd')[0]
                logger.info("=" * 80)
                process_schema(schema_name)
    except Exception as e:
        logger.info(f"An error occurred: {e}")        
        traceback.print_exc()

if __name__ == '__main__':
    main()
