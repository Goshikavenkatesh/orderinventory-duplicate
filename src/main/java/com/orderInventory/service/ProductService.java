package com.orderInventory.service;

import java.math.BigDecimal;
import java.util.List;

import org.springdoc.core.converters.models.Sort;

import com.orderInventory.entity.Inventory;
import com.orderInventory.entity.Product;


public interface ProductService {
	
	public List<Product> fetchAllProducts();
    Product addProduct(Product product);
	public void deleteProductById(int productId);
	public List<Product> findByName(String productName);
    List<Product> getProductsByUnitPriceRange(BigDecimal minUnitPrice, BigDecimal maxUnitPrice);
  
	
}
