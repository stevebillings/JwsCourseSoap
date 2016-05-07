package com.uciext.ws.hw3.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(targetNamespace = "http://uciext.ws.class3/wsdl")
public interface InventoryWS {
	@WebMethod
	public String hello();
}
