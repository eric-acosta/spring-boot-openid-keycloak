package com.scool.app.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.scool.app.model.Customer;
import com.scool.app.service.ICustomerService;

@RestController
@RequestMapping("/customers")
public class GetCustomerController {
	
	@Autowired
	private ICustomerService service;
	
	
	
	@GetMapping(value = "/{id}")
	@PreAuthorize("hasAnyAuthority('ROLE_USER')")
	public ResponseEntity<Customer> listById(@PathVariable("id") String id) {
		
		Customer minicustom=service.getCustomer(id);
		return new ResponseEntity<Customer>(minicustom,HttpStatus.OK);
		
	}
	
	

}
