var json2md = require("json2md");

const fs = require("fs");

fs.readFile("./casp_v6/json_from_xsd2json/desc_casp.001.001.06.json", "utf8", (error, data) => {
  if (error) {
    console.log(error);
    return;
  }
  //console.log(JSON.parse(data));
  console.log(json2md(data)) ;
});


