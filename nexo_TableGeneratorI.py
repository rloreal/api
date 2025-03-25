# Standard library imports
import csv
import html
import json
import os
import re
from pprint import pprint
from xml.dom import minidom
import xml.etree.ElementTree as ET

# Third-party imports
from numpy import true_divide
import xmlschema
from bs4 import BeautifulSoup

# Constants and Configuration
ISO20022_MODEL = 'C:/Users/romai/OneDrive/Documents/NEXO/20240411_ISO20022_2013_eRepository.iso20022'
REPO_DESC_FILE = "C:/Users/romai/OneDrive/Documents/NEXO/api/" + os.path.basename(ISO20022_MODEL) + ".description.json"
OUTPUT_DIR = "C:/Users/romai/OneDrive/Documents/NEXO/api/HTML/"
SCHEMA_DIR = "C:/Users/romai/OneDrive/Documents/NEXO/api/casp_v6/XML2024/"
PREVIOUS_VERSION_DIR = "C:/Users/romai/OneDrive/Documents/NEXO/api/casp_v5/HTML/"
ENDPOINT_FILE = "C:/Users/romai/OneDrive/Documents/NEXO/api/NEW_expandables_V10.csv"
INDENT = "&nbsp;&nbsp;"

# Status Constants
STATUS_NOCHANGE = 0
STATUS_UPDATED = 1
STATUS_NEW = 2
STATUS_DELETED = 4

# Global variables
endpoints: dict[str, str] = {}
business_area: str = ""
iso_repository_description: dict[str, dict[str, str]] = {}
bs_previous_html: BeautifulSoup

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
    table.fixed td { word-wrap: break-word; }
    table.fixed td:nth-of-type(1) { width: 32px; }
    table.fixed td:nth-of-type(2) { width: 190px; }
    table.fixed td:nth-of-type(3) { width: 48px; }
    table.fixed td:nth-of-type(4) { width: 48px; }
    table.fixed td:nth-of-type(5) { width: 48px; }
    table.fixed td:nth-of-type(6) { width: 474px; }
</style>"""


namespaces = {"xmi": "http://www.omg.org/XMI", "xs": "http://www.w3.org/2001/XMLSchema"}

def load_endpoints() -> dict[str, str]:
    """
    Load endpoints from CSV file.
    Returns a dictionary mapping element types to protocols.
    """
    mdr_endpoints: dict[str, str] = {}
    with open(ENDPOINT_FILE, 'r') as file:
        csv_reader = csv.reader(file, delimiter=";")
        for elt_type, protocol in csv_reader:
            mdr_endpoints[elt_type] = protocol
    return mdr_endpoints

def is_endpoint(elt_type: str = "") -> bool:
    """
    Check if the given element type is an endpoint for the current business area.
    """
    return elt_type in endpoints and business_area in endpoints[elt_type]


def generate_message_table(input_dir: str, message_name: str, output_dir: str) -> None:
    """
    Generate HTML table for a specific message.
    
    Args:
        input_dir: Directory containing input schema files
        message_name: Name of the message to process
        output_dir: Directory to write output HTML files
    """
    # Initialize HTML structure
    html_header = f"<html><head>{HTML_STYLE}<title>{message_name}</title></head>"
    html_body = '''
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

    # Find schema file
    schema_file = find_schema_file(input_dir, message_name)
    if not schema_file:
        print(f"XML Schema for {message_name} not found")
        return

    # Process schema
    print(f"Processing {schema_file}")
    business_area = message_name[0:4]
    xs = xmlschema.XMLSchema(schema_file)
    doc = xs.elements['Document']
    
    # Generate table content
    html_table_head = generate_table_header(doc.annotations[0].documentation[1].text)
    html_table_rows = processChildrenElements(doc, 1)
    
    # Combine all HTML parts
    html_full = (
        html_header +
        html_body +
        html_table_head +
        html_table_rows +
        "</table></body></html>"
    )
    
    # Write output file
    output_file = os.path.join(output_dir, f"{message_name}.html")
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

def generate_table_header(head_component:str) -> str:
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
                            <font color="#808080"><font size="1" style="font-size: 8pt">
                                <i><b>{head_component}</b></i>
                            </font></font>
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

def load_previous_version_html(message_name: str) -> BeautifulSoup:
    """
    Load and parse the HTML file from the previous version.
    Args:
        message_name: Name of the message to load
    Returns:
        BeautifulSoup object containing the parsed HTML
    """
    with open(file=PREVIOUS_VERSION_DIR + message_name + ".html", mode='r', encoding="UTF-8") as file:
        soup = BeautifulSoup(file, 'lxml')
    return soup

def previous_version_lookup(elt_name: str, elt_type: str, elt_mult: str) -> tuple[int, str, str, str]:
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
    prev_usage: str = '<b><font color="#d35400">TODO</font></b>'
    
    for row in bs_previous_html.findAll(name="tr"):
        cells=row.findAll("td")
        level:str=cells[0].text.strip()
        name:str=cells[1].text.strip()
        mult:str=cells[2].text.strip()
        rule:str=cells[3].text.strip()
        constraint:str=cells[4].text.strip()
        usage:str=cells[5].text

        if (elt_type in usage) and (elt_name in name):
            print(f"Found {elt_name} - Usage {usage}")
            prev_usage=usage
            #Check if multiplicity has changed
            if elt_mult != mult:
                status=STATUS_UPDATED
            found = True
            break
        #try to indentify update of Elements (as GenericIdentificationXXX) and CodeSet (like CardPaymentServiceTypeXXCode )
        if ( (re.sub('[0-9]+', '', elt_type) in usage) or (re.sub('[0-9]+Code', '', elt_type) in usage) ) and (elt_name in name):
            print(f"!!!!!!!!!!!!!!!!!!Found UPDATE {elt_name} {elt_type}- Previous Usage {usage}")
            prev_usage=usage+ f'  TODO UPDATE TO {elt_type}  '
            status=STATUS_UPDATED
            found=True
            break
    if not(found):
        print(f"!!!!!!!!!!!!!!!!!!NEW {elt_name} {elt_type}")
        found=True
        status=STATUS_NEW
        
    return status,prev_usage,rule,constraint

def processChildrenElements(elt, level: int = 1) -> str:
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
    element_info = get_element_info(elt)
    
    # Process element multiplicity
    mult_info = get_multiplicity_info(elt)
    
    # Handle special cases and generate row HTML
    if level > 2:
        status, prev_usage, prev_rule, prev_constraint = previous_version_lookup(
            element_info['name'],
            element_info['type'],
            mult_info['multiplicity']
        )
        
        row_color = get_status_color(status)
        html_table_rows += generate_table_row(
            level=level-2,
            element_info=element_info,
            mult_info=mult_info,
            prev_info={
                'usage': clean_previous_usage(prev_usage, element_info['type']),
                'rule': prev_rule,
                'constraint': prev_constraint
            },
            color=row_color,
            indent_level=level
        )

    # Recursively process children if not an endpoint
    if not is_endpoint(element_info['type']) and element_info['type']:
        for xsd_component in elt.iterchildren():
            html_table_rows += processChildrenElements(xsd_component, level + 1)

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

def get_multiplicity_info(elt) -> dict:
    """
    Extract multiplicity information from an element and format it [min..max]
    
    Args:
        elt: Element to process
    
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
    usage = re.sub(r"For sub elements see \w", '', usage)
    
    if is_endpoint(elt_type) and elt_type:
        usage = f'{usage}<br>See MDR for sub elements and <a href="#{elt_type}">{elt_type}</a>'
        
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
    indent = multStr(INDENT, indent_level)
    
    return f'''
    <tr id="{element_info['name']}.{element_info['type']}">
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
            <p lang="en-GB"><font color="{color}">{prev_info['usage']}<br/>
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
        print(f"Successfully wrote {file_path}")
    except IOError as e:
        print(f"Error writing file {file_path}: {e}")

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
        print(f"Error: File not found: {file_path}")
        raise
    except json.JSONDecodeError as e:
        print(f"Error: Invalid JSON in {file_path}: {e}")
        raise

def load_description() -> dict[str, dict[str, str]]:
    """
    Load ISO20022 repository description from JSON file.
    
    Returns:
        Dictionary containing repository description
    """
    print("Loading repository description from JSON file")
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
        'Endpoint File': ENDPOINT_FILE,
        'ISO20022 Model': ISO20022_MODEL,
        'Repository Description File': REPO_DESC_FILE
    }
    
    all_valid = True
    for name, path in required_paths.items():
        if not os.path.exists(path):
            print(f"Error: {name} not found: {path}")
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
            with open(test_file, 'w',encoding='UTF-8') as f:
                f.write('test')
            os.remove(test_file)
        except IOError as e:
            print(f"Error: Output directory is not writable: {e}")
            raise
    except OSError as e:
        print(f"Error creating output directory: {e}")
        raise

def main() -> None:
    """
    Main execution function with proper error handling.
    """
    try:
        print("=" * 132)
        print("Generate HTML message / components tables from ISO20022 repository")
        print("Needs ISO20022 repository downloadable from ISO20022 website and XML Schema folder to work with")
        print("=" * 132)
        
        # Validate environment
        if not validate_paths():
            print("Error: Invalid paths detected. Please check configuration.")
            return
            
        setup_output_directory()
        
        # Print configuration
        print(f"SCHEMA_DIR: {SCHEMA_DIR}")
        print(f"OUTPUT_DIR: {OUTPUT_DIR}")
        print(f"ISO20022_MODEL: {ISO20022_MODEL}")
        
        # Initialize required data
        global endpoints, iso_repository_description, bs_previous_html
        
        endpoints = load_endpoints()
        iso_repository_description = load_description()
        
        message_name = "casp.002.001.06"
        try:
            bs_previous_html = load_previous_version_html(message_name)
        except Exception as e:
            print(f"Error loading previous version HTML for {message_name}: {e}")
            return
            
        # Generate the table
        generate_message_table(SCHEMA_DIR, message_name, OUTPUT_DIR)
        
        print("=" * 91)
        print("Processing completed successfully")
        
    except Exception as e:
        print(f"Error during execution: {e}")
        raise

if __name__ == '__main__':
    main()