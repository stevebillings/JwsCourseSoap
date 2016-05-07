package com.uciext.ws.hw3.service.impl;

import javax.jws.WebService;

import com.uciext.ws.hw3.backend.InventoryManager;
import com.uciext.ws.hw3.backend.impl.InventoryManagerImpl;
import com.uciext.ws.hw3.backend.model.CatalogDAO;
import com.uciext.ws.hw3.backend.model.ProductDAO;
import com.uciext.ws.hw3.service.InventoryWS;
import com.uciext.ws.hw3.service.model.catalog.Catalog;
import com.uciext.ws.hw3.service.model.catalog.Product;
import com.uciext.ws.hw3.util.Util;

@WebService(portName = "InventoryPort", serviceName = "InventoryService", targetNamespace = "http://uciext.ws.hw3/wsdl", endpointInterface = "com.uciext.ws.hw3.service.InventoryWS")
public class InventoryWSImpl implements InventoryWS {
	private InventoryManager manager = new InventoryManagerImpl();

	// Hello operation to test the SOAP web service
	@Override
	public String hello() {
		Util.log("entered StudentService Hello");

		return "Hello from Student Service [" + (new java.util.Date() + "]");
	}

	@Override
	public Catalog getCatalog() {
		Util.log("SOAP getCatalog request");

		// Get data
		CatalogDAO catalogDao = manager.getCatalog();

		// Create a response
		Catalog catalog = new Catalog();
		catalog.setLastModifiedDate(catalogDao.getLastModifiedDate().toString());
		catalog.setDescription(catalogDao.getDescription());
		for (ProductDAO productDao : catalogDao.getProductList()) {
			Product product = new Product();
			product.setName(productDao.getProductName());
			product.setPrice(productDao.getPrice());
			product.setQuantity(productDao.getQuantity());
			product.setSku(productDao.getSku());
			catalog.getProduct().add(product);
		}

		Util.log("SOAP getCatalog response [product count=" + catalog.getProduct().size());
		return catalog;
	}

}
