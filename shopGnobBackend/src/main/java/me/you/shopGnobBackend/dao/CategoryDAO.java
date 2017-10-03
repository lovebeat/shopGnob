package me.you.shopGnobBackend.dao;

import java.util.List;

import me.you.shopGnobBackend.dto.Category;

public interface CategoryDAO {

	List<Category> list();
	Category get(int id);
	boolean add(Category category);
	boolean delete(Category category);
	boolean update(Category category);
}
