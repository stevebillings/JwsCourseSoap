package com.uciext.ws.hw3.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.jws.WebService;

import com.uciext.ws.hw3.backend.InventoryManager;
import com.uciext.ws.hw3.backend.impl.InventoryManagerImpl;
import com.uciext.ws.hw3.backend.model.CatalogDAO;
import com.uciext.ws.hw3.backend.model.OrderConfirmDAO;
import com.uciext.ws.hw3.backend.model.OrderDAO;
import com.uciext.ws.hw3.backend.model.ProductDAO;
import com.uciext.ws.hw3.backend.model.ProductOrderDAO;
import com.uciext.ws.hw3.service.InventoryWS;
import com.uciext.ws.hw3.service.model.catalog.Catalog;
import com.uciext.ws.hw3.service.model.catalog.Product;
import com.uciext.ws.hw3.service.model.order.Order;
import com.uciext.ws.hw3.service.model.order.ProductOrder;
import com.uciext.ws.hw3.service.model.orderConfirm.OrderConfirm;
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

	@Override
	public OrderConfirm placeOrder(Order order) throws Exception {
		Util.log("SOAP placeOrder request order=" + order);

		// Prepare order
		OrderDAO orderDao = new OrderDAO();
		Long orderId = (new Date()).getTime();
		orderDao.setOrderId(orderId);
		Util.log("order.getOrderNumber(): " + order.getOrderNumber()); // TODO
		orderDao.setOrderNumber(order.getOrderNumber());
		orderDao.setVendorCode(order.getVendorCode());
		orderDao.setVendorName(order.getVendorName());

		// Product list
		List<ProductOrderDAO> productDaoList = new ArrayList<>();
		for (ProductOrder productOrder : order.getProductOrder()) {
			// Product fields
			ProductDAO productDao = new ProductDAO();
			productDao.setProductName(productOrder.getProductName());
			productDao.setSku(productOrder.getProductSku());

			// ProductOrder
			ProductOrderDAO productOrderDao = new ProductOrderDAO();
			productOrderDao.setOrderQuantity(productOrder.getOrderQuantity());
			productOrderDao.setProduct(productDao);

			productDaoList.add(productOrderDao);
		}
		orderDao.setProductOrderList(productDaoList);

		// Process order
		OrderConfirmDAO orderConfirmDao = manager.processOrder(orderDao);

		// Create a status response
		OrderConfirm orderConfirm = new OrderConfirm();
		orderConfirm.setConfirmNumber(String.valueOf(orderConfirmDao.getOrderConfirmId()));
		orderConfirm.setOrderNumber(orderConfirmDao.getOrderNumber());
		orderConfirm.setTotalOrderPrice(orderConfirmDao.getTotalOrderPrice());
		orderConfirm.setVendorCode(orderConfirmDao.getVendorCode());

		Util.log("SOAP orderConfirm response [confirmNumber=" + orderConfirm.getConfirmNumber() + "]");

		return orderConfirm;
	}

}
