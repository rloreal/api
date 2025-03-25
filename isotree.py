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
    tree = ET.parse(xml_file)
    root = tree.getroot()

    components = {}
    complen = 0

    for entry in root.findall(xpath_top_level_entries, namespaces):
        component_name = entry.get(
            '{http://www.w3.org/2001/XMLSchema-instance}type').split(':')[-1]
        
        component_id = entry.get('{http://www.omg.org/XMI}id')
        definition= ""
        name = ""
        if (entry.get('name')):
            name = entry.get('name')
        if (entry.get('definition')): 
            definition = entry.get('definition')
        previous_version_id = ""
        if (entry.get('previousVersion')):
            previous_version_id = entry.get('previousVersion')
        xpath_prev_tld = f'.//topLevelDictionaryEntry[@xmi:id="{
            previous_version_id}"]'
        previous_name = ''
        prev_tld_element = root.find(xpath_prev_tld, namespaces)
        if (prev_tld_element is not None):
            previous_name = prev_tld_element.get('name')


        components[component_id] = {
            'name': name,
            'definition': definition,
            'previousVersion': previous_version_id,
            'previous_name': previous_name,
            'elements': {}
        }
        print(f"TopLevel: {component_id} - {entry.get('name')} - {complen}")
        for element in entry.findall(xpath_message_elements, namespaces):
            element_id = "-"
            if (element.get('type')):
                element_id = element.get('type')
            else:
                if (element.get('simpleType')):
                    element_id = element.get('simpleType')
                else:
                    if (element.get('complexType')):
                        element_id = element.get('complexType')

            xpath_tld = f'.//topLevelDictionaryEntry[@xmi:id="{element_id}"]'
            tld=''
            tld_element = root.find(xpath_tld, namespaces)
            if (tld_element is not None):
                tld = tld_element.get('name')

            name = ""
            if (element.get('name')):
                name = element.get('name')

            previous_version_element_id=""
            prev_type = ""
            if (element.get('previousVersion')):
                previous_version_element_id = element.get('previousVersion')
                xpath_prev_tld = f'.//messageElement[@xmi:id="{
                    previous_version_element_id}"]'
                prev_tld_element = root.find(xpath_prev_tld, namespaces)    
                if (prev_tld_element is not None):
                    if (prev_tld_element.get('type')):
                        prev_type = prev_tld_element.get('type')
                    else:
                        if (prev_tld_element.get('simpleType')):
                            prev_type = prev_tld_element.get('simpleType')
                        else:
                            if (prev_tld_element.get('complexType')):
                                prev_type = prev_tld_element.get('complexType')
                    


            definition= ""
            if (element.get('definition')): 
                definition = element.get('definition')

            components[component_id]['elements'][element_id] = {
                'name': name,
                'tld': tld,
                'definition': definition,
                'previousVersion': previous_version_element_id,
                'type': element_id,
                'previous_type': prev_type

            }
            complen = complen+1
            print(f"|--Element: {tld}")

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
