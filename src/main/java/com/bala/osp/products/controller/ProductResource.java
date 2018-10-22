package com.bala.osp.products.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bala.osp.products.domain.Product;
import com.bala.osp.products.service.ProductService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api
@CrossOrigin
@RestController
public class ProductResource {
	
	@Autowired
	private ProductService productService;

	@ApiOperation("Get All Products")
	@GetMapping("/products")
	public List<Product> listAllProducts(){
		return this.productService.getAllProducts();
	}
	
	@ApiOperation("Get All Products By Category")
	@GetMapping("/products/category/{categoryId}")
	public List<Product> listAllProductsByCategory(@PathVariable("categoryId") String categoryId){
		return this.productService.getProductsByCategory(categoryId);
	}
	
	@ApiOperation("Get Product Details")
	@GetMapping("/products/{productId}")
	public Product getProductDetails(@PathVariable("productId") int productId){
		return this.productService.getProductDetails(productId);
	}
	
	@ApiOperation("Create Product")
	@PostMapping("/products")
	public Product createProduct(@RequestBody Product product) {
		return this.productService.createProduct(product);
	}
	
}
