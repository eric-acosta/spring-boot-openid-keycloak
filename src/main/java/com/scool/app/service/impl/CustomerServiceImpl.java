package com.scool.app.service.impl;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

import com.scool.app.dao.ICustomerDAO;
import com.scool.app.model.Customer;
import com.scool.app.model.PersonalInfo;
import com.scool.app.model.SchoolData;
import com.scool.app.service.ICustomerService;


@Service
@Transactional
public class CustomerServiceImpl implements ICustomerService{
	
	@Autowired
	private ICustomerDAO dao;
	

	@Override
	public Customer getCustomer(String _id) {
		
		
		Customer cliente;
		
		
		Optional<Customer> optCliente = dao.findById(_id);
		if(optCliente.isPresent())
			cliente = optCliente.get();
		else 
			  throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "ID NO ENCONTRADO: "+_id, null);
	
		return cliente;
	}

}
