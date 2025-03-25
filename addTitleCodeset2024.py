import os

import json
from lxml import etree

SHORT_NAMES_DIR = "C:/Users/romai/OneDrive/Documents/NEXO/api/casp_V6/json_from_altova/new/"
XML2024_DIR = "C:/Users/romai/OneDrive/Documents/NEXO/api/casp_V6/XML2024/"



def load_json(file_path: str) -> dict:
    """load json file and return content as dict"""
    with open(file_path, mode='r', encoding='utf-8') as file:
        return json.load(file)

def process_enumeration_documentation(restriction_elt, schema_property):
    """Extract and format documentation from enumeration restrictions"""
    value = restriction_elt.attrib.get('value')
    schema_property["description"] = f"{schema_property['description']}\\n\\n- ***{value}***"
    
    for annotation in restriction_elt.find('.//xs:annotation', namespaces={"xs": "http://www.w3.org/2001/XMLSchema"}):
        doc = annotation.find('.//xs:documentation', namespaces={"xs": "http://www.w3.org/2001/XMLSchema"})
        if doc is not None:
            definition = doc.text
            name = doc.getnext().text
            schema_property["description"] += f" : **{name}** Definition: {definition} \n"

def process_property(property_name, property_data, root, prefix_map):
    """Process individual property in the schema"""
    if not property_data.get("description"):
        property_data["description"] = ""

    # Add title from XML documentation
    xpath = f'.//xs:element[@name="{property_name}"]/xs:annotation/xs:documentation'
    for name_elt in root.findall(xpath, prefix_map):
        if name_elt.attrib.get('source') == 'name':
            property_data["title"] = name_elt.text

    # Process code enumerations
    if "$ref" in property_data and property_data["$ref"].endswith("Code"):
        code_name = property_data["$ref"][8:]
        xpath = f'.//xs:simpleType[@name="{code_name}"]/xs:restriction/xs:enumeration'
        for restriction_elt in root.findall(xpath, prefix_map):
            process_enumeration_documentation(restriction_elt, property_data)

def main():
    prefix_map = {"xs": "http://www.w3.org/2001/XMLSchema"}
    
    for filename in os.listdir(SHORT_NAMES_DIR):
        if not filename.endswith('json') or filename.startswith('desc'):
            continue
            
        print(f"Processing {filename}")
        json_schema_dict = load_json(os.path.join(SHORT_NAMES_DIR, filename))
        parser = etree.XMLParser(remove_blank_text=True)
        root = etree.parse(os.path.join(XML2024_DIR, "casp.002.001.06.xsd"), parser=parser)

        # Process definitions
        if "$defs" in json_schema_dict:
            for def_name, def_data in json_schema_dict["$defs"].items():
                # Add title to definition
                xpath = f'.//xs:element[@name="{def_name}"]/xs:annotation/xs:documentation'
                for name_elt in root.findall(xpath, prefix_map):
                    if name_elt.attrib.get('source') == 'name':
                        def_data["title"] = name_elt.text

                # Process properties in definition
                if "properties" in def_data:
                    for prop_name, prop_data in def_data["properties"].items():
                        process_property(prop_name, prop_data, root, prefix_map)

        # Write enhanced schema
        output_path = os.path.join(SHORT_NAMES_DIR, f"desc_{filename}")
        with open(output_path, mode="w+", encoding='utf-8') as result_file:
            json.dump(json_schema_dict, result_file, indent=4, ensure_ascii=False)
        print(f"Wrote {output_path}")

if __name__ == '__main__':
    print("=" * 90)
    print("Enhance JSON schema with name from XML2024")
    print("=" * 90)
    main()
    print("=" * 90)
