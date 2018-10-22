package com.bala.osp.products.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bala.osp.products.domain.Category;
import com.bala.osp.products.service.CategoryService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api
@CrossOrigin
@RestController
public class CategoryResource {
	
	@Autowired
	private CategoryService categoryService;
	
	@ApiOperation("Create Category")
	@PostMapping("/categories")
	public Category createCategory(@RequestBody Category category) {
		return this.categoryService.createCategory(category);
	}
	
	@ApiOperation("Create Category")
	@GetMapping("/categories")
	public List<Category> getCategories() {
		return this.categoryService.getAllCategories();
	}
}
