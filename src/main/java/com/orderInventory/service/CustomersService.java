package com.orderInventory.service;

import java.util.List;

import com.orderInventory.entity.Customers;

public interface CustomersService {
	
	public List<Customers> fetchAllCustomers();
	public Customers addCustomers(Customers customer);
}
