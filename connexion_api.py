import sys
print(sys.executable)

from connexion import AsyncApp

app = AsyncApp(__name__)


# Import the API definition from the YAML file

app.add_api('nexoRetailerAPI_retailerWG.yaml')
app.run()
