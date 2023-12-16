package com.orderInventory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.orderInventory.entity.Customers;
import com.orderInventory.service.CustomersService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/customer")
public class CustomersController {
	
	@Autowired
	private CustomersService customerService;
	
	@GetMapping("/fetchAll")
	public ResponseEntity<List<Customers>> getAllCustomerDetails()
	{
		List<Customers> customerList=customerService.fetchAllCustomers();
		return new ResponseEntity<List<Customers>>(customerList,HttpStatus.OK);
	}
	
	@PostMapping("/post")
	public ResponseEntity<String> addCustomer(@Valid @RequestBody Customers customer) {
		customerService.addCustomers(customer);
		return new ResponseEntity<String>("Record Created successfully", HttpStatus.CREATED);
	}

}
