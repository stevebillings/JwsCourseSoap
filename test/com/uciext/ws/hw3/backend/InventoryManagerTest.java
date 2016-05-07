package com.uciext.ws.hw3.backend;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.uciext.ws.hw3.backend.impl.InventoryManagerImpl;
import com.uciext.ws.hw3.backend.model.CatalogDAO;
import com.uciext.ws.hw3.backend.model.OrderConfirmDAO;
import com.uciext.ws.hw3.backend.model.OrderDAO;
import com.uciext.ws.hw3.backend.model.ProductDAO;
import com.uciext.ws.hw3.backend.model.ProductOrderDAO;

public class InventoryManagerTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test() throws Exception {
		InventoryManager manager = new InventoryManagerImpl();

		CatalogDAO cat = manager.getCatalog();
		// System.out.println(cat);

		OrderDAO order = new OrderDAO();
		Long orderId = (new Date()).getTime();
		order.setOrderId(orderId);
		order.setOrderNumber("1");
		order.setVendorCode("123");
		order.setVendorName("Vendor123");
		List<ProductOrderDAO> productOrderList = new ArrayList<>();
		ProductOrderDAO productOrder = new ProductOrderDAO();
		productOrder.setOrderQuantity(1.23);
		ProductDAO product = new ProductDAO();
		product.setCategory(cat.getProductList().get(0).getCategory());
		product.setPrice(cat.getProductList().get(0).getPrice());
		product.setProductId(cat.getProductList().get(0).getProductId());
		product.setProductName(cat.getProductList().get(0).getProductName());
		product.setQuantity(3.33);
		product.setSku(cat.getProductList().get(0).getSku());
		productOrder.setProduct(product);
		productOrderList.add(productOrder);
		order.setProductOrderList(productOrderList);
		OrderConfirmDAO conf = manager.processOrder(order);
		System.out.println(conf);
	}

}
