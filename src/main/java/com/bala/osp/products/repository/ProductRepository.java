package com.bala.osp.products.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bala.osp.products.domain.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

	List<Product> findByCategoryId(String categoryId);
}
