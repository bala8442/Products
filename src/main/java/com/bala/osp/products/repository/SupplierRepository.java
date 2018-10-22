package com.bala.osp.products.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bala.osp.products.domain.Supplier;

public interface SupplierRepository extends JpaRepository<Supplier, Integer>{
	
	Supplier findBySupplierId(String supplierId);

}
