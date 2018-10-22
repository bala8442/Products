package com.bala.osp.products.service;

import java.util.List;

import com.bala.osp.products.domain.Product;

public interface ProductService {

	List<Product> getAllProducts();
	
	List<Product> getProductsByCategory(String categoryId);
	
	Product getProductDetails(int productId);
	
	Product createProduct(Product product);
}
