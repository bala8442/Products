package com.bala.osp.products.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bala.osp.products.domain.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer>{

	Category findByCategoryId(String categoryId);
}
