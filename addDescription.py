import os
import xml.etree.ElementTree as ET
from xml.dom import minidom
import multiprocessing as mp
import json
from enum import Enum

from typing import Annotated

from pydantic import BaseModel, Field
from pydantic.config import ConfigDict


def parse_repo(repo_dir: str) -> dict[str, str]:
    """use swift repository to associate message component names and xmlTags"""
    # print("================================================================")
    print("Parsing repository for messageElement and messageDefinition")
    root = minidom.parse(repo_dir)

    elements = root.getElementsByTagName('messageElement')
    msg_defs = root.getElementsByTagName('messageDefinition')

    xml_tags: dict[str, str] = {}

    for elt in elements:
        # print("EltName: "+elt.attributes['name'].value)
        if 'name' in elt.attributes and 'definition' in elt.attributes:
            # print(elt.attributes['name'].value+"="+elt.attributes['xmlTag'].value)
            xml_tags[elt.attributes['name'].value] = elt.attributes['definition'].value

    for msg in msg_defs:
        # print("MessageName: "+elt.attributes['name'].value)
        if 'name' in msg.attributes and 'xmlTag' in msg.attributes:
            # print(msg.attributes['name'].value+"="+msg.attributes['xmlTag'].value)
            xml_tags[msg.attributes['xmlTag'].value] = msg.attributes['name'].value

    # print(sizeof(xmlTags.values).)
    print("================================================================")
    # Read in the file where xmlTags must be replaced with the full name of the message component
    return xml_tags


def load_json(file_path: str) -> str:
     with open(file_path, 'r') as file:
        return json.load(file)

if __name__ == '__main__':
    print("===========================START================================")
    # print("Conversion from JSON schema with short names to fullnames")
    # shortnamesDir="C:/Users/romai/OneDrive/Documents/NEXO/api/casp_V6/json_from_idea/"
    # fullnamesDir="C:/Users/romai/OneDrive/Documents/NEXO/api/casp_V6/json_fullname/"
    ISO20022repo = 'C:/Users/romai/OneDrive/Documents/NEXO/20240411_ISO20022_2013_eRepository.iso20022'
    json_schema = ""
    # print("================================================================")
    # print("shortnamesDir: "+shortnamesDir)
    # print("fullnamesDir: "+fullnamesDir)
    # print("ISO20022repo: "+ISO20022repo)
    # print("")
    xmlTags = parse_repo(ISO20022repo)

    # processes = []
    # for f in os.listdir(shortnamesDir):
    #    if f.endswith('json'):
    #        p = mp.Process(target=shortToFullFunc, args=[shortnamesDir+f,xmlTags,fullnamesDir+f])
    #        p.start()
    #        processes.append(p)
    # for p in processes:
    #    p.join()
    print("===========================END==================================")
