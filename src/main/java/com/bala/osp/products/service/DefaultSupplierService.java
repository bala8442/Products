package com.bala.osp.products.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bala.osp.products.domain.Supplier;
import com.bala.osp.products.repository.SupplierRepository;

@Service
public class DefaultSupplierService implements SupplierService {
	
	@Autowired
	private SupplierRepository supplierRepository;

	@Override
	public Supplier createSupplier(Supplier supplier) {
		if(null==this.supplierRepository.findBySupplierId(supplier.getSupplierId())) {
			return supplierRepository.save(supplier);
		}
		return null;
	}

	@Override
	public List<Supplier> getAllSuppliers() {
		return this.supplierRepository.findAll();
	}

}
