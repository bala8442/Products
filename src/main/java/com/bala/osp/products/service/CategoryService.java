package com.bala.osp.products.service;

import java.util.List;

import com.bala.osp.products.domain.Category;

public interface CategoryService {

	List<Category> getAllCategories();
	
	Category createCategory(Category category);
}
