import os
from xml.dom import minidom
import json
from lxml import etree

SHORT_NAMES_DIR = "C:/Users/romai/OneDrive/Documents/NEXO/api/casp_V6/json_fullname_altova/new/"
# fullnamesDir="C:/Users/romai/OneDrive/Documents/NEXO/api/casp_V6/json_fullname/"
ISO20022_MODEL = 'C:/Users/romai/OneDrive/Documents/NEXO/20240411_ISO20022_2013_eRepository.iso20022'

# read description from file or parse ISO20022 repo
OPT_CODESET_READ_FROM_REPO = True
CODESET_DESC_FILE = "C:/Users/romai/OneDrive/Documents/NEXO/api/casp_V6.codeset_description.json"

def parse_repo(repo_dir: str)  -> tuple[dict[str, str], dict[str, str]]:
    """use swift repository to enrich json with ISO definition in description"""
    # print("================================================================================================")
    print("Parsing repository for messageElement and messageDefinition and topLevelDictionaryEntry")
    root = minidom.parse(repo_dir)
    lroot = etree.parse(repo_dir)
    elements = root.getElementsByTagName('messageElement')
    msg_defs = root.getElementsByTagName('messageDefinition')
    topLevelDictionaryEntry = root.getElementsByTagName(
        'topLevelDictionaryEntry')
    # codesets= root.getElementsByTagName('codeSet')

    description: dict[str, str] = {}
    examples: dict[str, str] = {}
    prefix_map = {"xmi": "http://www.omg.org/XMI"}
    json_desc_read= False
    for elt in elements:
        # print("EltName: "+elt.attributes['name'].value)
        if 'name' in elt.attributes and 'definition' in elt.attributes:
            # print(elt.attributes['name'].value+"="+elt.attributes['xmlTag'].value)
            #prefix with componenet name (parent node) to get accurate description
            # xml_tags[elt.attributes['name'].value] = elt.attributes['definition'].value
            description[elt.parentNode.attributes['name'].value + "." +
                        elt.attributes['name'].value] = elt.attributes['definition'].value
    for msg in msg_defs:
        # print("MessageName: "+elt.attributes['name'].value)
        if 'name' in msg.attributes and 'definition' in msg.attributes:
            # print(msg.attributes['name'].value+"="+msg.attributes['xmlTag'].value)
            description[msg.attributes['name'].value] = msg.attributes['definition'].value
    for tl_dict in topLevelDictionaryEntry:
        # print("MessageName: "+elt.attributes['name'].value)
        if 'name' in tl_dict.attributes and 'definition' in tl_dict.attributes:
            # print(msg.attributes['name'].value+"="+msg.attributes['xmlTag'].value)
            description[tl_dict.attributes['name'].value] = tl_dict.attributes['definition'].value
            if tl_dict.getElementsByTagName('example'):
                examples[tl_dict.attributes['name'].value] = tl_dict.getElementsByTagName(
                    'example')[0].childNodes[0].nodeValue
                # print(tl_dict.attributes['name'].value+" example: " + tl_dict.getElementsByTagName('example')[0].childNodes[0].nodeValue)
        if 'xsi:type' in tl_dict.attributes:
            if tl_dict.attributes['xsi:type'].value == "iso20022:CodeSet":
                tracefound = 0
                if OPT_CODESET_READ_FROM_REPO:
                    for code in tl_dict.getElementsByTagName('code'):
                        if 'codeName' in code.attributes:
                            description[tl_dict.attributes['name'].value] = description[tl_dict.attributes['name'].value] + \
                                " \n"+code.attributes['codeName'].value + \
                                ": \t"+code.attributes['name'].value
                            if 'definition' in code.attributes:
                                description[tl_dict.attributes['name'].value] = description[tl_dict.attributes['name'].value] + \
                                    ": \t"+code.attributes['definition'].value
                        else:
                            # find by trace....
                            # if 'trace' in tl_dict.attributes and tracefound == 0:
                            if 'trace' in tl_dict.attributes:
                                xpath = './/topLevelDictionaryEntry[@xmi:id="' + \
                                    tl_dict.attributes['trace'].value+'"]'
                                print(xpath)
                                for traceElt in lroot.findall(xpath, prefix_map):
                                    print(
                                        "found trace " + traceElt.attrib['name']+" for "+tl_dict.attributes['name'].value)
                                    tracefound = 1
                                    for codetrace in traceElt.findall('code'):
                                        if 'codeName' in codetrace.attrib:
                                            #limit to codes subset used in this message def
                                            if codetrace.attrib['name'] == code.attributes['name'].value:
                                                description[tl_dict.attributes['name'].value] = description[tl_dict.attributes['name'].value] + \
                                                " \nCode: " + \
                                                codetrace.attrib['codeName'] + \
                                                ": \t "+codetrace.attrib['name']
                                                if 'definition' in codetrace.attrib:
                                                    description[tl_dict.attributes['name'].value] = description[tl_dict.attributes[
                                                        'name'].value]+": \tDefinition: "+codetrace.attrib['definition']
                    #save description in json file for reuse
                    with open(CODESET_DESC_FILE, mode="w+", encoding='utf-8') as desc_file:
                        json.dump(description, desc_file,
                          indent=4, ensure_ascii=False)               
                else:
                    if not json_desc_read:
                        print("reusing description in json file")
                        codeset_dict=load_json(CODESET_DESC_FILE)
                        description.update(codeset_dict)
                        json_desc_read = True
    print("================================================================================================")
    return (description, examples)


def load_json(file_path: str) -> dict:
    """load json file and return content as dict"""
    with open(file_path, mode='r',encoding='utf-8') as file:
        return json.load(file)


if __name__ == '__main__':
    print("===========================START================================================================")
    print("Enhance JSON schema with descriptions and examples from ISO20022 repository")
    print("needs ISO20022 repository downloadable from ISO20022 website and JSON Schema folder to work with")
    # print("================================================================================================")
    # print("shortnamesDir: "+SHORT_NAMES_DIR)
    # print("fullnamesDir: "+fullnamesDir)
    # print("ISO20022repo: "+ISO20022_MODEL)
    # print("")
 
    #parse ISO20022 model to get descriptions and examples
    description, examples = parse_repo(ISO20022_MODEL)

    # processes = []
    for f in os.listdir(SHORT_NAMES_DIR):
        #process all json files and add description and examples to json schema
        nbdesc = 0
        nbnf = 0
        #enhanced json files will be prefixed with desc
        if f.endswith('json') and not f.startswith('desc'):
            print("processing "+f)
            json_schema_dict = load_json(SHORT_NAMES_DIR+f)
            for i in json_schema_dict:
                if i == "$defs":
                    for j in json_schema_dict[i]:
                        if not j.endswith("CodeDEF"):
                            if j.replace("iso20022:","") in description:
                                # print(j+ " Description: " + description[j])
                                json_schema_dict[i][j]["description"] = description[j.replace(
                                    "iso20022:", "")]
                                nbdesc += 1
                            else:
                                print(j + ": DEF NOT FOUND")
                                nbnf += 1
                            if j in examples:
                                json_schema_dict[i][j]["example"] = examples[j]
                        for k in json_schema_dict[i][j]:
                            if k == "properties":
                                for l in json_schema_dict[i][j][k]:
                                    if l.replace("iso20022:", "") in description:
                                        # print(j+ " Description: " + description[j])
                                        json_schema_dict[i][j][k][l]["description"] = description[l.replace(
                                            "iso20022:", "")]
                                    if j.replace(
                                            "iso20022:", "")+"."+l.replace(
                                            "iso20022:", "") in description:
                                            json_schema_dict[i][j][k][l]["description"] = description[j.replace(
                                        "iso20022:", "")+"."+l.replace(
                                        "iso20022:", "")]
            with open(SHORT_NAMES_DIR+"desc_"+f, mode="w+", encoding='utf-8') as result_file:
                json.dump(json_schema_dict, result_file,
                          indent=4, ensure_ascii=False)
            print("end processing "+f+" with "+""+str(nbdesc) +
                  " desc added and "+str(nbnf) + " not found")
    print("===========================END==================================================================")
