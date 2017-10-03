package me.you.shopGnobBackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import me.you.shopGnobBackend.dao.CategoryDAO;
import me.you.shopGnobBackend.dto.Category;

public class CategoryTestCase {
	
	private static AnnotationConfigApplicationContext context;
	private static CategoryDAO categoryDAO;
	private static Category category;

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("me.you.shopGnobBackend");
		context.refresh();
		categoryDAO = (CategoryDAO)context.getBean("categoryDAO");
		
	}
	
	/*@Test
	public void testAddCategory() {
		category = new Category();
		category.setName("Cactus");
		category.setDescription("This is some description for Cactus");
		category.setImageURL("CAT_1.jpg");
		assertEquals("Successfully added a category inside the table !",true, categoryDAO.add(category));

	}*/
	
	/*@Test
	public void testGetCategory() {
		category = categoryDAO.get(1);
		assertEquals("Successfully fetched a single category from the table !","Cactus", category.getName());
	}*/
	
	
	/*@Test
	public void testUpdateCategory() {
		category = categoryDAO.get(1);
		category.setName("Succulent");
		assertEquals("Successfully update a single category in the table !",true, categoryDAO.update(category));
	}*/
	
	/*@Test
	public void testDeleteCategory() {
		category = categoryDAO.get(1);
		assertEquals("Successfully delete a single category in the table !",true, categoryDAO.delete(category));
	}*/
	
	/*@Test
	public void testListCategory() {
		
		assertEquals("Successfully fetch the list of categies from the table !",1, categoryDAO.list().size());
	}*/
	
	@Test
	public void testCRUDCategory() {
		
		//add operation
		category = new Category();
		category.setName("Cactus");
		category.setDescription("This is some description for Cactus");
		category.setImageURL("CAT_1.jpg");
		assertEquals("Successfully added a category inside the table !",true, categoryDAO.add(category));
		
		category = new Category();
		category.setName("Succulent");
		category.setDescription("This is some description for Succulent");
		category.setImageURL("CAT_2.jpg");
		assertEquals("Successfully added a category inside the table !",true, categoryDAO.add(category));
		
		//fetching and updating the category
		category = categoryDAO.get(2);
		category.setName("Succulentt");
		assertEquals("Successfully update a single category in the table !",true, categoryDAO.update(category));
		
		//delete category
		
		assertEquals("Successfully delete a single category in the table !",true, categoryDAO.delete(category));
		
		/*//fetching the list
		assertEquals("Successfully fetch the list of categies from the table !",1, categoryDAO.list().size());*/
	}
	
}
