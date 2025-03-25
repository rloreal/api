import os
from xml.dom import minidom
import multiprocessing as mp

#use swift repository to associate message component names and xmlTags
def parse_repo(repo_dir: str) -> dict[str, str]:
    """use swift repository to associate message component names and xmlTags"""
    # print("================================================================")
    print("Parsing repository for messageElement, messageDefinition, messageBuildingBlock")
    root = minidom.parse(repo_dir)

    elements = root.getElementsByTagName('messageElement')
    msg_defs = root.getElementsByTagName('messageDefinition')
    msg_bb = root.getElementsByTagName('messageBuildingBlock')
    xml_tags: dict[str, str] = {}

    for elt in elements:
        # print("EltName: "+elt.attributes['name'].value)
        #if 'name' in elt.attributes and 'definition' in elt.attributes:
            # print(elt.attributes['name'].value+"="+elt.attributes['xmlTag'].value)
            #if xml_tags[elt.attributes['name'].value] ='ParametersVersion'
            #xml_tags[elt.attributes['name'].value] = elt.attributes['definition'].value
        if 'name' in elt.attributes and 'xmlTag' in elt.attributes:
            # print(msg.attributes['name'].value+"="+msg.attributes['xmlTag'].value)
            xml_tags[elt.attributes['xmlTag'].value] = elt.attributes['name'].value
            if elt.attributes['xmlTag'].value == "ParamsVrsn":
                print(elt.attributes['name'].value)

    for msg in msg_defs:
        # print("MessageName: "+elt.attributes['name'].value)
        if 'name' in msg.attributes and 'xmlTag' in msg.attributes:
            # print(msg.attributes['name'].value+"="+msg.attributes['xmlTag'].value)
            xml_tags[msg.attributes['xmlTag'].value] = msg.attributes['name'].value

    for bb in msg_bb:
        # print("MessageName: "+elt.attributes['name'].value)
        if 'name' in bb.attributes and 'xmlTag' in bb.attributes:
            # print(msg.attributes['name'].value+"="+msg.attributes['xmlTag'].value)
            xml_tags[bb.attributes['xmlTag'].value] = bb.attributes['name'].value


    print("================================================================")
    # Read in the file where xmlTags must be replaced with the full name of the message component
    return xml_tags


def short_to_full_func(short_json_schema_file: str, xml_tags: dict[str, str], full_json_schema_file: str) -> str:
    """replace shortnames with fullnames"""
    print("start processing "+short_json_schema_file+"...")
    with open(file=short_json_schema_file, mode='r', encoding="utf-8") as json_file:

        filedata: str = json_file.read()
        replace_count = 0
        # Replace the target string
        for tag in xml_tags.keys():
            #print("replacing "+tag+" with " + xml_tags[tag])
            if tag == "ParamsVrsn":
                print(tag+"=>"+  xml_tags[tag])
            filedata = filedata.replace("\""+tag+"\"", "\""+xml_tags[tag]+"\"")
            filedata = filedata.replace(
                "\"iso20022:"+tag+"\"", "\"iso20022:"+xml_tags[tag]+"\"")
            replace_count += 1
        # remove all casp: string
        # filedata=filedata.replace("casp:","")
        print("replaced "+str(replace_count) +
              " tags in "+short_json_schema_file)

        # Write the new file out
        with open(full_json_schema_file, 'w+', encoding="utf-8") as fulljsonfile:
            fulljsonfile.write(filedata)
        print("end processing "+full_json_schema_file+"...")
        return short_json_schema_file+" processed"

if __name__ == '__main__':
    print("===========================START================================")
    print("Conversion from JSON schema with short names to fullnames")
    short_names_dir="C:/Users/romai/OneDrive/Documents/NEXO/api/casp_V6/json_from_altova/new/"
    full_names_dir="C:/Users/romai/OneDrive/Documents/NEXO/api/casp_V6/json_fullname_altova/"
    ISO20022repo='C:/Users/romai/OneDrive/Documents/NEXO/20240411_ISO20022_2013_eRepository.iso20022'
    print("================================================================")
    print("short_names_dir: "+short_names_dir)
    print("full_names_dir: "+full_names_dir)
    print("ISO20022repo: "+ISO20022repo)
    print("")
    xml_tags=parse_repo(ISO20022repo)
    processes = []
    for f in os.listdir(short_names_dir):
        if f.endswith('json'):
            print(f)
            p = mp.Process(target=short_to_full_func, args=[short_names_dir+f,xml_tags,full_names_dir+f])
            p.start()
            processes.append(p)
    for p in processes:
        p.join()
    print("===========================END==================================")
