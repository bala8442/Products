package com.bala.osp.products.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bala.osp.products.domain.Supplier;
import com.bala.osp.products.service.SupplierService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api
@CrossOrigin
@RestController
public class SupplierResource {
	
	@Autowired
	private SupplierService supplierService;
	
	@ApiOperation("Cretate Supplier")
	@PostMapping("/suppliers")
	public Supplier createSupplier(@RequestBody Supplier supplier) {
		return supplierService.createSupplier(supplier);
	}
	
	@ApiOperation("List Suppliers")
	@GetMapping("/suppliers")
	public List<Supplier> getSuppliers() {
		return supplierService.getAllSuppliers();
	}


}
