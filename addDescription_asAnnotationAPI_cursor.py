import os
import json
import yaml
import logging
import logging.config
import xml
from xml.dom import minidom
from typing import Dict, Tuple
from lxml import etree


# Constants
WORK_DIR = 'C:/Users/romai/OneDrive/Documents/NEXO/api/'
ISO20022_MODEL = '20240729_ISO20022_2013_eRepository.iso20022'
REPO_DESC_FILE = f"{os.path.basename(ISO20022_MODEL)}.description.json"
REPO_EXAMPLE_FILE = f"{os.path.basename(ISO20022_MODEL)}.example.json"
LOG_CONFIGURATION_FILE = "nexo_table_generator_logging.yaml"

def parse_repo(iso_dictionary_file: str) -> Tuple[Dict[str, Dict[str, str]], Dict[str, str]]:
    """Use SWIFT repository to enrich JSON with ISO definition in description."""
    print("Parsing repository for messageElement, messageDefinition, and topLevelDictionaryEntry")
    root = minidom.parse(os.path.join(WORK_DIR,ISO20022_MODEL))
    lroot = etree.parse(iso_dictionary_file)  # type: ignore
    elements = root.getElementsByTagName('messageElement')
    msg_defs = root.getElementsByTagName('messageDefinition')
    topLevelDictionaryEntry = root.getElementsByTagName('topLevelDictionaryEntry')

    description: Dict[str, Dict[str, str]] = {}
    examples: Dict[str, str] = {}
    prefix_map = {"xmi": "http://www.omg.org/XMI"}

    for elt in elements:
        if 'name' in elt.attributes and 'definition' in elt.attributes:
            parent_name = elt.parentNode.attributes['name'].value
            elt_name = elt.attributes['name'].value
            elt_type = elt.attributes.get('simpleType', 'messageElement')
            elt_def = elt.attributes['definition'].value
            description[f"{parent_name}.{elt_name}"] = {'type': elt_type, 'def': elt_def}
            logger.debug(elt_name)
    for msg in msg_defs:
        if 'name' in msg.attributes and 'definition' in msg.attributes:        
            msg_name = msg.attributes['name'].value
            msg_def = msg.attributes['definition'].value
            description[msg_name] = {'type': "messageDefinition", 'def': msg_def}
            logger.debug(msg_name)

    for tl_dict in topLevelDictionaryEntry:
        if 'name' in tl_dict.attributes and 'definition' in tl_dict.attributes:
            tl_name = tl_dict.attributes['name'].value
            tl_def = tl_dict.attributes['definition'].value + "<br/>"
            description[tl_name] = {'type': "topLevelDictionaryEntry", 'def': tl_def}
            logger.debug(tl_name)
            if tl_dict.getElementsByTagName('example'):
                examples[tl_name] = tl_dict.getElementsByTagName('example')[0].childNodes[0].nodeValue

            if 'xsi:type' in tl_dict.attributes and tl_dict.attributes['xsi:type'].value == "iso20022:CodeSet":
                tracefound = 0
                for code in tl_dict.getElementsByTagName('code'):
                    if 'codeName' in code.attributes:
                        code_name = code.attributes['codeName'].value
                        code_def = code.attributes.get('definition', '')
                        description[tl_name]['def'] += f"<b>{code_name}: {code.attributes['name'].value}</b> ; <i>{code_def}</i>"
                    elif 'trace' in tl_dict.attributes:
                        xpath = f'.//topLevelDictionaryEntry[@xmi:id="{tl_dict.attributes["trace"].value}"]'
                        for traceElt in lroot.findall(xpath, prefix_map):
                            tracefound = 1
                            for codetrace in traceElt.findall('code'):
                                if 'codeName' in codetrace.attrib and codetrace.attrib['name'] == code.attributes['name'].value:
                                    codetrace_name = codetrace.attrib['codeName']
                                    codetrace_def = codetrace.attrib.get('definition', '')
                                    description[tl_name]['def'] += f"- <b>{codetrace_name}: {codetrace.attrib['name']}</b> : <i>{codetrace_def}</i><br/>"
    for k in list(description):
        if (isinstance(description[k]['type'],xml.dom.minidom.Attr)):
            del(description[k])
            logger.info("Removed " + k + " description - xml.dom.minidom.Attr type is not serializable")

    try:
        with open(REPO_DESC_FILE, mode="w+", encoding='utf-8') as desc_file:
            json.dump(description, desc_file, indent=4, ensure_ascii=False)
        with open(REPO_EXAMPLE_FILE, mode="w+", encoding='utf-8') as example_file:
            json.dump(examples, example_file, indent=4, ensure_ascii=False)
    except(json.JSONDecodeError) as jse:
        logger.critical(f"Error with serializing description or example dictionary {jse}")

    return description, examples



def main():
    logger.info("=" * 132)
    logger.info("build JSON file from usefuul information in ISO dictionary fo easier retrieval")
    logger.info("Needs ISO20022 repository downloadable from ISO20022 website")
    logger.info("=" * 132)
    logger.info(f"ISO20022repo: {ISO20022_MODEL}")

    parse_repo(ISO20022_MODEL)

    logger.info("=" * 132)

# Load the config file
with open(LOG_CONFIGURATION_FILE, 'rt') as f:
    config = yaml.safe_load(f.read())

# Configure the logging module with the config file
logging.config.dictConfig(config)
logger = logging.getLogger('development')


if __name__ == '__main__':
    main()