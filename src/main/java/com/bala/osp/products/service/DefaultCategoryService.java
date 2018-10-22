package com.bala.osp.products.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bala.osp.products.domain.Category;
import com.bala.osp.products.repository.CategoryRepository;

@Service
public class DefaultCategoryService implements CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public List<Category> getAllCategories() {
		return this.categoryRepository.findAll();
	}

	@Override
	public Category createCategory(Category category) {
		if (null==this.categoryRepository.findByCategoryId(category.getCategoryId())) {
			return this.categoryRepository.save(category);
		}
		return null;
	}

}
