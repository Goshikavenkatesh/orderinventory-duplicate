package com.orderInventory.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.orderInventory.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
	
	public List<Product> findByProductName(String productName);
	 List<Product> findByUnitPriceBetween(BigDecimal minUnitPrice, BigDecimal maxUnitPrice);

	    List<Product> findByUnitPriceGreaterThanEqual(BigDecimal minUnitPrice);

	    List<Product> findByUnitPriceLessThanEqual(BigDecimal maxUnitPrice);
		
	    
	}


