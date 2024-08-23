import os
import multiprocessing as mp
import subprocess
from typing import Text
from subprocess import Popen, PIPE, STDOUT
from datetime import datetime


xsd_dir="C:\\Users\\romai\\OneDrive\\Documents\\NEXO\\api\\casp_v6\\"

def process_xsd_files(xsd_file):
        args=[f'xsd2json', xsd_dir+xsd_file]
        jsonOutputFile = xsd_dir+"json_from_xsd2json\\"+ xsd_file

        current_time = datetime.now().strftime("%H:%M:%S")
        print("Start processing "+xsd_file+"at " + current_time)
        print("Output to "  + jsonOutputFile)    
        with open(jsonOutputFile, "w+") as outfile:
            p=subprocess.Popen(args,shell=True,  stdout=outfile,creationflags=subprocess.CREATE_NEW_PROCESS_GROUP)
            p.communicate()
        #print(stderr.decode("utf-8"))
        print("end processing " + xsd_file + " at " + current_time)

def os_process_xsd_files(xsd_file):
        jsonOutputFile = xsd_dir+"json_from_xsd2json\\"+ xsd_file
        command=f'xsd2json {xsd_dir+xsd_file} > {jsonOutputFile}'
        print("Command: " + command)
        with open(xsd_file+"_xsd2.json.bat","w+") as bat_file:
             bat_file.write(command)
             

        #os.system(command)
        print(f"end processing " + xsd_file)

if __name__ == '__main__':
    print("===========================START================================")
    print("Conversion from XML to JSON schema")
    print("processing XSD in "+xsd_dir)
    processes = []
    for f in os.listdir(xsd_dir):
        if f.endswith('.xsd'):
            print("xsd2json processing "+f)
            p = mp.Process(target=process_xsd_files(f))
            p.start()
            processes.append(p)
    for p in processes:
        p.join()
    print("===========================END==================================")