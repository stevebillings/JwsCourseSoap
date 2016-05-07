package com.uciext.ws.hw3.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.uciext.ws.hw3.service.model.catalog.Catalog;

@WebService(targetNamespace = "http://uciext.ws.class3/wsdl")
public interface InventoryWS {
	@WebMethod
	public String hello();

	public Catalog getCatalog();
}
