package com.uciext.ws.hw3.service.impl;

import javax.jws.WebService;

import com.uciext.ws.hw3.service.InventoryWS;
import com.uciext.ws.hw3.util.Util;

@WebService(portName = "InventoryPort", serviceName = "InventoryService", targetNamespace = "http://uciext.ws.hw3/wsdl", endpointInterface = "com.uciext.ws.hw3.service.InventoryWS")
public class InventoryWSImpl implements InventoryWS {

	// Hello operation to test the SOAP web service
	@Override
	public String hello() {
		Util.log("entered StudentService Hello");

		return "Hello from Student Service [" + (new java.util.Date() + "]");
	}

}
