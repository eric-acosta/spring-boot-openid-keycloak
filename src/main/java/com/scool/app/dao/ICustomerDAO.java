package com.scool.app.dao;

import com.scool.app.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

//@Repository
public interface ICustomerDAO extends MongoRepository<Customer, String>{

}
