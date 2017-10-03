package me.you.shopGnobBackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import me.you.shopGnobBackend.dao.ProductDAO;
import me.you.shopGnobBackend.dto.Product;

public class ProductTestCase {
	
	private static AnnotationConfigApplicationContext context;
	private static ProductDAO productDAO;
	private static Product product;

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("me.you.shopGnobBackend");
		context.refresh();
		productDAO = (ProductDAO)context.getBean("productDAO");
		
	}
	
	/*@Test
	public void testCRUDProduct() {
		
		//create operation
		product = new Product();
		product.setName("TestCase");
		product.setBrand("TestCase");
		product.setDescription("TestCase");
		product.setUnitPrice(0000.0);
		product.setActive(true);
		product.setCategoryId(2);
		product.setSupplierId(2);
		
		assertEquals("Something went wrong while insert a new product !",true, productDAO.add(product));
		
		//reading and updating the product
		product=productDAO.get(5);
		product.setName("change TestCase");
		assertEquals("Something went wrong while updating the existing record !",true, productDAO.update(product));
		assertEquals("Something went wrong while delete the existing record !",true, productDAO.delete(product));
		
		//list
		assertEquals("Something went wrong while fetching the list of products !",7, productDAO.list().size());
		
	}*/
	
/*	@Test
	public void testListActiveProducts() {
		assertEquals("Something were wrong while fetching the list of products !", 6,productDAO.listActiveProducts().size());
	}
	*/
	
	/*@Test
	public void testListActiveProductsByCategory() {
		assertEquals("Something were wrong while fetching the list of products !", 2,productDAO.listActiveProductsByCategory(1).size());
		assertEquals("Something were wrong while fetching the list of products !", 4,productDAO.listActiveProductsByCategory(2).size());
	}*/
	
	/*@Test
	public void testGetLatestActiveProducts() {
		assertEquals("Something were wrong while fetching the list of products !", 3,productDAO.getLatestActiveProducts(3).size());
		
	}*/

}
