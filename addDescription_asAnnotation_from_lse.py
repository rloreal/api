import os
import xml.etree.ElementTree as ET
from xml.dom import minidom
import multiprocessing as mp
import json
from lxml import etree
from enum import Enum

from typing import Annotated

from pydantic import BaseModel, Field
from pydantic.config import ConfigDict


def parse_repo(repo_dir: str)  -> tuple[dict[str, str], dict[str, str]]:
    """use swift repository to enrich json with ISO definition in description"""
    # print("================================================================================================")
    print("Parsing resource.mx for messageComponents and elements and topLevelDictionaryEntry")
    root = minidom.parse(repo_dir)
    lroot = etree.parse(repo_dir)
    elements = root.getElementsByTagName('elements')
    msg_defs = root.getElementsByTagName('messageComponents')
    #topLevelDictionaryEntry = root.getElementsByTagName(
    #    'topLevelDictionaryEntry')
    # codesets= root.getElementsByTagName('codeSet')
    datatypes = root.getElementsByTagName('datatypes')

    xml_tags: dict[str, str] = {}
    description: dict[str, str] = {}
    examples: dict[str, str] = {}
    codesets: dict[str, str] = {}
    
    prefix_map = {"xmi": "http://www.omg.org/XMI"}
    for elt in elements:
        # print("EltName: "+elt.attributes['name'].value)
        if 'name' in elt.attributes and 'definition' in elt.attributes:
            # print(elt.attributes['name'].value+"="+elt.attributes['xmlTag'].value)
            xml_tags[elt.attributes['name'].value] = elt.attributes['definition'].value
            description[elt.attributes['name'].value] = elt.attributes['definition'].value
    for msg in msg_defs:
        # print("MessageName: "+elt.attributes['name'].value)
        if 'name' in msg.attributes and 'definition' in msg.attributes:
            # print(msg.attributes['name'].value+"="+msg.attributes['xmlTag'].value)
            description[msg.attributes['name'].value] = msg.attributes['definition'].value
    for dt in datatypes:
        # print("MessageName: "+elt.attributes['name'].value)
        if 'name' in dt.attributes and 'definition' in dt.attributes:
            # print(msg.attributes['name'].value+"="+msg.attributes['xmlTag'].value)
            description[dt.attributes['name'].value] = dt.attributes['definition'].value
    
    #or tl_dict in topLevelDictionaryEntry:
    #   # print("MessageName: "+elt.attributes['name'].value)
    #   if 'name' in tl_dict.attributes and 'definition' in tl_dict.attributes:
    #       # print(msg.attributes['name'].value+"="+msg.attributes['xmlTag'].value)
    #       description[tl_dict.attributes['name'].value] = tl_dict.attributes['definition'].value
    #       if tl_dict.getElementsByTagName('example'):
    #           examples[tl_dict.attributes['name'].value] = tl_dict.getElementsByTagName(
    #               'example')[0].childNodes[0].nodeValue
    #           # print(tl_dict.attributes['name'].value+" example: " + tl_dict.getElementsByTagName('example')[0].childNodes[0].nodeValue)
    #   if 'xsi:type' in tl_dict.attributes:
    #       if tl_dict.attributes['xsi:type'].value == "iso20022:CodeSet":
    #           tracefound = 0
    #           for code in tl_dict.getElementsByTagName('code'):
    #               if 'codeName' in code.attributes:
    #                   description[tl_dict.attributes['name'].value] = description[tl_dict.attributes['name'].value] + \
    #                       "\n"+code.attributes['codeName'].value + \
    #                       ":\t"+code.attributes['name'].value
    #                   if 'definition' in code.attributes:
    #                       description[tl_dict.attributes['name'].value] = description[tl_dict.attributes['name'].value] + \
    #                           ":\t"+code.attributes['definition'].value
    #               else:
    #                   # find by trace....
    #                   if 'trace' in tl_dict.attributes and tracefound == 0:
    #                       xpath = './/topLevelDictionaryEntry[@xmi:id="' + \
    #                           tl_dict.attributes['trace'].value+'"]'
    #                       print(xpath)
    #                       for traceElt in lroot.findall(xpath, prefix_map):
    #                           print(
    #                               "found trace " + traceElt.attrib['name']+" for "+tl_dict.attributes['name'].value)
    #                           tracefound = 1
    #                           for codetrace in traceElt.findall('code'):
    #                               if 'codeName' in codetrace.attrib:
    #                                   description[tl_dict.attributes['name'].value] = description[tl_dict.attributes['name'].value] + \
    #                                       "\nCode: " + \
    #                                       codetrace.attrib['codeName'] + \
    #                                       ":\t"+codetrace.attrib['name']
    #                                   if 'definition' in codetrace.attrib:
    #                                       description[tl_dict.attributes['name'].value] = description[tl_dict.attributes[
    #                                           'name'].value]+":\tDefinition: "+codetrace.attrib['definition']

    print("================================================================================================")
    return (description, examples)


def load_json(file_path: str) -> dict:
    with open(file_path, 'r') as file:
        return json.load(file)


if __name__ == '__main__':
    print("===========================START================================================================")
    print("Enhance JSON schema with descriptions and examples from ISO20022 repository")
    print("needs ISO20022 repository downloadable from ISO20022 website and JSON Schema folder to work with")
    shortnamesDir = "C:/Users/romai/OneDrive/Documents/NEXO/api/casp_V6/json_fullname_altova/"
    # fullnamesDir="C:/Users/romai/OneDrive/Documents/NEXO/api/casp_V6/json_fullname/"
    ISO20022repo = 'C:/Users/romai/OneDrive/Documents/NEXO/ResourceContents.mx'
    # print("================================================================================================")
    # print("shortnamesDir: "+shortnamesDir)
    # print("fullnamesDir: "+fullnamesDir)
    # print("ISO20022repo: "+ISO20022repo)
    # print("")
    description, examples = parse_repo(ISO20022repo)

    # processes = []
    for f in os.listdir(shortnamesDir):
        nbdesc = 0
        nbnf = 0
        if f.endswith('json') and not f.startswith('desc'):
            print("processing "+f)
            json_schema_dict = load_json(shortnamesDir+f)
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
            with open(shortnamesDir+"desc_"+f, mode="w+", encoding='utf-8') as result_file:
                json.dump(json_schema_dict, result_file,
                          indent=4, ensure_ascii=False)
            print("end processing "+f+" with "+""+str(nbdesc) +
                  " desc added and "+str(nbnf) + " not found")
    print("===========================END==================================================================")
