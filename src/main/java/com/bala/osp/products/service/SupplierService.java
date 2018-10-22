package com.bala.osp.products.service;

import java.util.List;

import com.bala.osp.products.domain.Supplier;

public interface SupplierService {
	
	Supplier createSupplier(Supplier supplier);
	
	List<Supplier> getAllSuppliers();

}
