// Load JSON data (assuming it's included directly in the script for simplicity)
jsonData = {}

async function getISOData() {
    const response = await fetch('iso20022_data.json');
    jsonData = await response.json();
}

// Function to find an element by name
function findElementByName(name) {
    for (const key in jsonData) {
        if (jsonData[key].name === name) {
            return jsonData[key];
        }
    }
    return null;
}

// Function to find an element by name


// Function to compare an element with its ancestor
function compareElement() {
    const elementName = document.getElementById('elementName').value;
    const element = findElementByName(elementName);

    if (!element) {
        document.getElementById('result').innerText = 'Element not found';
        return;
    }

    if (!element.previousVersion) {
        document.getElementById('result').innerText = 'No previous version found';
        return;
    }

    const ancestor = jsonData[element.previousVersion];
    if (!ancestor) {
        document.getElementById('result').innerText = 'Ancestor not found';
        return;
    }

    const resultDiv = document.getElementById('result');
    resultDiv.innerHTML = '';

    // Compare properties
    compareProperties(element, ancestor, resultDiv);
}

// Function to compare properties of two elements
function compareProperties(element, ancestor, resultDiv) {
    const properties = new Set([...Object.keys(element), ...Object.keys(ancestor)]);

    properties.forEach(prop => {
        const elementValue = element[prop];
        const ancestorValue = ancestor[prop];

            if (elementValue === undefined) {
                resultDiv.innerHTML += `<div class="removal">${prop}: ${ancestorValue}</div>`;
            } else if (ancestorValue === undefined) {
                resultDiv.innerHTML += `<div class="addition">${prop}: ${elementValue}</div>`;
            } else if (elementValue !== ancestorValue) {
                resultDiv.innerHTML += `<div class="change">${prop}: ${elementValue} (was: ${ancestorValue})</div>`;
            } else {
                resultDiv.innerHTML += `<div>${prop}: ${elementValue}</div>`;
            }

    });

    // Compare elements
    if (element.elements && ancestor.elements) {
        const elementElements = new Set([...Object.keys(element.elements), ...Object.keys(ancestor.elements)]);

        elementElements.forEach(elementKey => {
            const elementElement = element.elements[elementKey];
            const ancestorElement = ancestor.elements[elementKey];

            if (elementElement === undefined) {
                resultDiv.innerHTML += `<div class="removal">${elementKey}: ${JSON.stringify(ancestorElement)}</div>`;
            } else if (ancestorElement === undefined) {
                resultDiv.innerHTML += `<div class="addition">${elementKey}: ${JSON.stringify(elementElement)}</div>`;
            } else {
                resultDiv.innerHTML += `<div>${elementKey}:</div>`;
                compareProperties(elementElement, ancestorElement, resultDiv);
            }
        });
    }
}
