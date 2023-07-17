package com.wipro.dao;

import org.springframework.data.repository.CrudRepository;

import com.wipro.bean.Customer;

public interface CustomerDAO extends CrudRepository<Customer,Integer>{

}
