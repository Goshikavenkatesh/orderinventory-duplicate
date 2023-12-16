package com.orderInventory.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orderInventory.entity.Customers;
import com.orderInventory.repository.CustomersRepository;

@Service
public class CustomersServiceImpl implements CustomersService {
@Autowired
private CustomersRepository customersRepository;

@Override
public List<Customers> fetchAllCustomers() {
	List<Customers> customerList=customersRepository.findAll();
	
	return customerList ;
}

@Override
public Customers addCustomers(Customers customer) {
	
	return customersRepository.save(customer);
}
}