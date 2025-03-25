from lxml import etree
import json
import xml.etree.ElementTree as ET

ISO20022_MODEL = 'C:/Users/romai/OneDrive/Documents/NEXO/20240411_ISO20022_2013_eRepository.iso20022'
# XML namespaces
namespaces = {
    "xmi": "http://www.omg.org/XMI",
    "xs": "http://www.w3.org/2001/XMLSchema",
    "iso20022": "urn:iso:std:iso:20022:2013:ecore"
}
# XPath to find all topLevelDictionaryEntry elements
xpath_top_level_entries = ".//topLevelDictionaryEntry"

# XPath to find all messageElement elements within a topLevelDictionaryEntry
xpath_message_elements = ".//messageElement"

def parse_iso20022(xml_file):
    tree = etree.parse(xml_file)
    root = tree.getroot()

    components = {}
    complen = 0

    for entry in root.findall(xpath_top_level_entries, namespaces): 
        component_id = entry.attrib['{http://www.omg.org/XMI}id']
        definition= ""
        name = ""
        if ('name' in entry.attrib):
            name = entry.attrib['name']
        if ('definition' in entry.attrib):
            definition = entry.attrib['definition']
        previous_version_id = ""
        if ('previousVersion' in entry.attrib):
            previous_version_id = entry.get('previousVersion')
        components[component_id] = {
            'name': name,
            'definition': definition,
            'previousVersion': previous_version_id,
            'elements': {}
        }
        complen=complen+1
        print(f"TopLevel: {component_id} - {name} - {complen}")
        for element in entry.findall(xpath_message_elements, namespaces):
            element_id = "-"
            if ('type' in element.attrib):
                element_id = element.attrib['type']
            else:
                if ('simpleType' in element.attrib):
                    element_id = element.attrib['simpleType']
                else:
                    if ('complexType' in element.attrib):
                        element_id = element.attrib['complexType']

            xpath_tld = './/topLevelDictionaryEntry[@xmi:id=$element_id]'
            tld=''
            tld_element = tree.xpath(xpath_tld, element_id=element_id, namespaces=namespaces)
            #tld_element = root.find(xpath_tld, namespaces)
            if (tld_element is not None):
                for elt in tld_element:
                    if 'name' in elt.attrib:
                        tld = elt.attrib['name']

            name = ""
            if ('name' in element.attrib):
                name = element.attrib['name']
            previous_version_element_id=""
            if ('previousVersion' in element.attrib):
                previous_version_element_id = element.attrib['previousVersion']
            definition= ""
            if ('definition' in element.attrib):
                definition = element.attrib['definition']

            components[component_id]['elements'][element_id] = {
                'name': name,
                'tld': tld,
                'definition': definition,
                'previousVersion': previous_version_element_id,
                'type': element_id
            }
            complen = complen+1
            print(f"Element: {component_id} - {name} - {complen}")

    print(f"Total components: {len(components)}")
    return components


def save_to_json(data, json_file):
    with open(json_file, 'w') as f:
        json.dump(data, f, indent=4)


# Example usage
xml_file = ISO20022_MODEL
json_file = 'iso20022_data.json'
components = parse_iso20022(xml_file)
print(f"Total components: {len(components)}")
save_to_json(components, json_file)
