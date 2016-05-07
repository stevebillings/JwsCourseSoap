REM Generate WSDL and xsd

wsgen -verbose -extension -keep -cp ./classes -d ./classes -s ./src com.uciext.ws.hw3.service.impl.InventoryWSImpl
