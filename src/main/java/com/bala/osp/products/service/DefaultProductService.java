package com.bala.osp.products.service;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bala.osp.products.domain.Product;
import com.bala.osp.products.repository.CategoryRepository;
import com.bala.osp.products.repository.ProductRepository;

@Service
public class DefaultProductService implements ProductService {

	@Autowired
	private ProductRepository productRepository;

	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public List<Product> getAllProducts() {
		return this.productRepository.findAll();
	}

	@Override
	public List<Product> getProductsByCategory(String categoryId) {
		if (null != this.categoryRepository.findByCategoryId(categoryId)) {
			return this.productRepository.findByCategoryId(categoryId);
		}
		return Collections.emptyList();
	}

	@Override
	public Product getProductDetails(int productId) {
		return this.productRepository.findById(productId).get();
	}

	@Override
	public Product createProduct(Product product) {
		return this.productRepository.save(product);
	}

}
