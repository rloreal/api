import os
from xml.dom import minidom
import multiprocessing as mp

#use swift repository to associate message component names and xmlTags
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
        if 'xmlTag' in elt.attributes and 'name' in elt.attributes:
            # print(elt.attributes['name'].value+"="+elt.attributes['xmlTag'].value)
            xml_tags[elt.attributes['xmlTag'].value] = elt.attributes['name'].value
    for msg in msg_defs:
        # print("MessageName: "+elt.attributes['name'].value)
        if 'name' in msg.attributes and 'xmlTag' in msg.attributes:
            # print(msg.attributes['name'].value+"="+msg.attributes['xmlTag'].value)
            xml_tags[msg.attributes['xmlTag'].value] = msg.attributes['name'].value

    # print(sizeof(xmlTags.values).)
    print("================================================================")
    # Read in the file where xmlTags must be replaced with the full name of the message component
    return xml_tags


def short_to_full_func(short_json_schema_file: str, xml_tags: dict[str, str], full_json_schema_file: str) -> str:
    """replace shortnames with fullnames"""
    print("start processing "+short_json_schema_file+"...")
    with open(file=short_json_schema_file, mode='r', encoding="utf-8") as json_file:

        filedata: str = json_file.read()
        #print(filedata)
        replace_count: int = 0
        # Replace the target string
        for tag in xml_tags.keys():
           
            if tag=="RcptPty":
                print(tag+"=>"+  xml_tags[tag])
            filedata2: str = filedata.replace("/"+tag+"/", "/"+xml_tags[tag]+"/")
            filedata2 = filedata2.replace("/"+tag+'\n', "/"+xml_tags[tag]+'\n')
            if filedata2  != filedata:
                replace_count += 1
                print("replaced /"+tag+"/ with /" + xml_tags[tag])
                filedata=filedata2
            
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
    short_names_dir="C:/Users/romai/OneDrive/Documents/NEXO/api/csv/"
    full_names_dir="C:/Users/romai/OneDrive/Documents/NEXO/api/csv_full/"
    ISO20022repo='C:/Users/romai/OneDrive/Documents/NEXO/20240411_ISO20022_2013_eRepository.iso20022'
    print("================================================================")
    print("short_names_dir: "+short_names_dir)
    print("full_names_dir: "+full_names_dir)
    print("ISO20022repo: "+ISO20022repo)
    print("")
    xml_tags=parse_repo(ISO20022repo)
    processes = []
    for f in os.listdir(short_names_dir):
        if f.endswith('csv'):
            p = mp.Process(target=short_to_full_func, args=[short_names_dir+f,xml_tags,full_names_dir+f])
            p.start()
            processes.append(p)
    for p in processes:
        p.join()
    print("===========================END==================================")
