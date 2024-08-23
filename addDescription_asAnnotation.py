import os
#import xml.etree.ElementTree as ET
from xml.dom import minidom
#import multiprocessing as mp
import json
import copy
from lxml import etree




def parse_repo(repo_dir: str) -> tuple[dict[str, str], dict[str, str]]:
    """use swift repository to enrich json with ISO definition in description"""
    # print("================================================================================================")
    print("Parsing repository for messageElement and messageDefinition and topLevelDictionaryEntry")
    root = minidom.parse(repo_dir)
    lroot = etree.parse(source=repo_dir)
    elements = root.getElementsByTagName('messageElement')
    msg_defs = root.getElementsByTagName('messageDefinition')
    top_level_dictionary_entry = root.getElementsByTagName('topLevelDictionaryEntry')
    #codesets= root.getElementsByTagName('codeSet')

    xml_tags: dict[str, str] = {}
    description: dict[str, str] = {}
    examples: dict[str, str] = {}
    codesets: dict[str, str] = {}
    trace: dict[str, str] = {}
    prefix_map = {"xmi": "http://www.omg.org/XMI"}
    for elt in elements:
        # print("EltName: "+elt.attributes['name'].value)
        if 'name' in elt.attributes and 'definition' in elt.attributes:
            if elt.attributes['name'].value  == "Acquirer10":
                print("found Acquirer 10 : "+elt.attributes['definition'].value)
            xml_tags[elt.attributes['name'].value] = elt.attributes['definition'].value
            description[elt.attributes['name'].value]= elt.attributes['definition'].value
    for msg in msg_defs:
        # print("MessageName: "+elt.attributes['name'].value)
        if 'name' in msg.attributes and 'definition' in msg.attributes:
            # print(msg.attributes['name'].value+"="+msg.attributes['xmlTag'].value)
            description[msg.attributes['name'].value] = msg.attributes['definition'].value
    for tl_dict in top_level_dictionary_entry:
        # print("MessageName: "+elt.attributes['name'].value)
        if 'name' in tl_dict.attributes and 'definition' in tl_dict.attributes:
            # print(msg.attributes['name'].value+"="+msg.attributes['xmlTag'].value)
            description[tl_dict.attributes['name'].value] = tl_dict.attributes['definition'].value
            if tl_dict.getElementsByTagName('example'):
                examples[tl_dict.attributes['name'].value] = tl_dict.getElementsByTagName('example')[0].childNodes[0].nodeValue
                #print(tl_dict.attributes['name'].value+" example: " + tl_dict.getElementsByTagName('example')[0].childNodes[0].nodeValue)
        if 'xsi:type' in tl_dict.attributes:
            if tl_dict.attributes['xsi:type'].value=="iso20022:CodeSet":
                tracefound=0
                for code in tl_dict.getElementsByTagName('code'):
                    if 'codeName' in code.attributes:
                        description[tl_dict.attributes['name'].value]=description[tl_dict.attributes['name'].value]+"\n"+code.attributes['codeName'].value+":\t"+code.attributes['name'].value
                        if 'definition' in code.attributes:
                            description[tl_dict.attributes['name'].value]=description[tl_dict.attributes['name'].value]+":\t"+code.attributes['definition'].value
                    else:
                        #find by trace....
                        if 'trace' in tl_dict.attributes:
                            xpath='.//topLevelDictionaryEntry[@xmi:id="'+tl_dict.attributes['trace'].value+'"]'
                            print(xpath)
                            trace_name=tl_dict.attributes['trace'].value
                            if trace_name in trace:
                                  print("trace already found " + trace_name)
                                  trace_description= trace[trace_name]
                                  if trace_description != '':
                                    description[tl_dict.attributes['name'].value]=trace_description
                            else:
                                for traceElt in lroot.findall(xpath,prefix_map):
                                    print("found trace " + tl_dict.attributes['trace'].value +" for "+tl_dict.attributes['name'].value)
                                    tracefound = 1
                                    for codetrace in traceElt.findall('code'):
                                        trace_code=''
                                        trace_description=''
                                        trace[traceElt.attrib['name']]=traceElt.attrib['name']
                                        if 'codeName' in codetrace.attrib:
                                            trace_code=codetrace.attrib['codeName']
                                            trace_description=description[tl_dict.attributes['name'].value]+"\nCode: "+codetrace.attrib['codeName']+":\t"+codetrace.attrib['name']
                                            description[tl_dict.attributes['name'].value]=trace_description
                                            if 'definition' in codetrace.attrib:
                                                trace_description=trace_description+":\tDefinition: "+codetrace.attrib['definition']
                                                description[tl_dict.attributes['name'].value]=trace_description
                                        trace[trace_name] = trace_description   

    print("================================================================================================")
    return (description,examples)


def load_json(file_path: str) -> dict:
     with open(file_path, 'r',encoding= 'utf-8') as file:
        return json.load(file)

if __name__ == '__main__':
    print("===========================START================================================================")
    print("Enhance JSON schema with descriptions and examples from ISO20022 repository")
    print("needs ISO20022 repository downloadable from ISO20022 website and JSON Schema folder to work with")
    shortnamesDir="C:/Users/romai/OneDrive/Documents/NEXO/api/casp_V6/json_from_altova/"
    # fullnamesDir="C:/Users/romai/OneDrive/Documents/NEXO/api/casp_V6/json_fullname/"
    ISO20022repo = 'C:/Users/romai/OneDrive/Documents/NEXO/20240411_ISO20022_2013_eRepository.iso20022'
    # print("================================================================================================")
    # print("shortnamesDir: "+shortnamesDir)
    # print("fullnamesDir: "+fullnamesDir)
    # print("ISO20022repo: "+ISO20022repo)
    # print("")
    description,examples = parse_repo(ISO20022repo)

    # processes = []
    for f in os.listdir(shortnamesDir):
        nbdesc=0
        nbnf=0
        #lprocessing json schemas in folder shortnamesDir
        if f.endswith('json') and not(f.startswith('desc')):
            print("processing "+f)
            #load json in dictionary
            json_schema_dict = load_json(shortnamesDir+f)
            #copy original schema dict in new one which will be the resulting enhanced json schema dumped in a new file
            json_schema_dict_v2 = copy.deepcopy(json_schema_dict)
            #process all definitions in schema
            #json_schema_dict_v2 = { k.replace('n1:', ''): v for k, v in json_schema_dict.items() }
            for i in json_schema_dict:
                if i == "$defs":
                    for j in json_schema_dict[i]:
                        if  j.startswith(".n1:") and j in json_schema_dict_v2[i]:
                            json_schema_dict_v2[i][j[4:]]=json_schema_dict_v2[i].pop(j)
                        if  j.startswith("n1:") and j in json_schema_dict_v2[i]:
                            json_schema_dict_v2[i][j[3:]]=json_schema_dict_v2[i].pop(j)
                        
            for i in json_schema_dict_v2:
                if i == "$defs":
                    for j in json_schema_dict_v2[i]:
                        print(j)
                        #remove namespace if prefixed 
                        if j.startswith("n1:"):
                            print(j)
                            #json_schema_dict_v2[i][j[3:]]=json_schema_dict_v2[i].pop(j)
                        if not(j.endswith("CodeDEF")):
                            #add description
                            if j in description:
                                #print(j+ " Description: " + description[j])
                                #if j.startswith("n1:"):
                                #    json_schema_dict_v2[i][j[3:]]["description"]=description[j]
                                #else:    
                                json_schema_dict_v2[i][j]["description"]=description[j]
                                nbdesc+=1   
                            else:
                                print(j+  ": DEF NOT FOUND")
                                nbnf+=1
                            #add examples
                            if j in examples:
                                #if j.startswith("n1:"):
                                #    json_schema_dict_v2[i][j[3:]]["example"]=examples[j]
                                #else:
                                json_schema_dict_v2[i][j]["example"]=examples[j]

            with open(shortnamesDir+"desc_"+f,"w+",encoding='utf-8') as result_file:
                json.dump(json_schema_dict_v2, result_file,indent=4, ensure_ascii=False)
            print("end processing "+f+" with "+""+str(nbdesc)+" desc added and "+str(nbnf)+ " not found")    
    print("===========================END==================================================================")
