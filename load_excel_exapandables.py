from typing import IO, Iterator
import tablib
import os
import openpyxl

SCHEMA_DIR = "C:/SOFT/"


def iter_excel_tablib(file: IO[bytes]) -> Iterator[dict[str, object]]:
    yield from tablib.Dataset().load(file).dict


def iter_excel_openpyxl(file: IO[bytes]) -> Iterator[dict[str, object]]:
    workbook = openpyxl.load_workbook(file)
    rows = workbook.active.rows
    headers = [str(cell.value) for cell in next(rows)]
    for row in rows:
        yield dict(zip(headers, (cell.value for cell in row)))

data = tablib.Dataset()
for filename in os.listdir(SCHEMA_DIR):
    if filename.endswith(".xlsx") and (filename.upper().startswith("TEST_NEW_EXPANDABLES")):
        print(filename)
        with open(os.path.join(SCHEMA_DIR,filename), 'rb') as fh:
            imported_data = tablib.Dataset().load(in_stream=fh, headers=False)
            for i in range(len(imported_data)):
                if (i > 2) and (imported_data[i][4] is not None) and ("x" in imported_data[i][4]):
                    print(imported_data[i][1])


