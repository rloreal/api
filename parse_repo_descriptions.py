import json
import os

def load_json_file(file_path):
    with open(file_path, 'r') as file:
        return json.load(file)

def save_json_file(data, file_path):
    with open(file_path, 'w') as file:
        json.dump(data, file, indent=2)

def process_json_schema(json_schema_dict, description, examples):
    nbdesc = 0
    nbnf = 0

    for i in json_schema_dict:
        for j in list(json_schema_dict[i]):
            if j.endswith("CodeDEF"):
                continue

            # Process top-level items
            j_key = j.replace("iso20022:", "")
            if j_key in description:
                json_schema_dict[i][j]["description"] = description[j_key]['def']
                nbdesc += 1
            else:
                print(f"{j}: DEF NOT FOUND")
                nbnf += 1

            if j_key in examples:
                json_schema_dict[i][j]["example"] = examples[j_key]

            # Process properties
            if "properties" in json_schema_dict[i][j]:
                process_properties(json_schema_dict[i][j], j_key, description)

    return nbdesc, nbnf

def process_properties(schema_item, parent_key, description):
    for l in list(schema_item["properties"]):
        l_key = l.replace("iso20022:", "")
        
        # Add description from the general description dictionary
        if l_key in description:
            schema_item["properties"][l]["description"] = description[l_key]['def']
        
        # Add description from the combined parent.child key
        combined_key = f"{parent_key}.{l_key}"
        if combined_key in description:
            schema_item["properties"][l]["description"] = description[combined_key]['def']
        
        # Process $ref
        if "$ref" in schema_item["properties"][l]:
            process_ref(schema_item, schema_item["properties"][l], parent_key, description)

def process_ref(parent_schema, item, parent_key, description):
    ref_key = item["$ref"].replace("#/$defs/", "").replace("iso20022:", "")
    if ref_key in description:
        if ref_key.endswith("Code"):
            parent_schema["description"] = parent_schema.get("description", "") + description[ref_key]['def']

def main():
    # Load input files
    json_schema_dict = load_json_file('path/to/json_schema.json')
    description = load_json_file('path/to/description.json')
    examples = load_json_file('path/to/examples.json')

    # Process the JSON schema
    nbdesc, nbnf = process_json_schema(json_schema_dict, description, examples)

    # Print results
    print(f"Number of descriptions added: {nbdesc}")
    print(f"Number of definitions not found: {nbnf}")

    # Save the updated JSON schema
    save_json_file(json_schema_dict, 'path/to/updated_json_schema.json')

if __name__ == "__main__":
    main()
