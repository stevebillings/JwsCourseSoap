package com.uciext.ws.hw3.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebParam.Mode;
import javax.jws.WebService;

import com.uciext.ws.hw3.service.model.catalog.Catalog;
import com.uciext.ws.hw3.service.model.order.Order;
import com.uciext.ws.hw3.service.model.orderConfirm.OrderConfirm;

@WebService(targetNamespace = "http://uciext.ws.hw3/wsdl")
public interface InventoryWS {
	@WebMethod
	public String hello();

	public Catalog getCatalog();

	public OrderConfirm placeOrder(
			@WebParam(name = "order", mode = Mode.IN, targetNamespace = "http://uciext.ws.hw3/wsdl") Order order)
					throws Exception;
}
