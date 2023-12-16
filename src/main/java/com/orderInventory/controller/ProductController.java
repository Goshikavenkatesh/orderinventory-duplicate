package com.orderInventory.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.orderInventory.entity.Product;
import com.orderInventory.service.ProductService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import jakarta.persistence.criteria.Order;
import jakarta.validation.Valid;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("/fetchAll")
	public  ResponseEntity<List<Product>> getAllProducts()
	{
		List<Product> productList=productService.fetchAllProducts();
		return new ResponseEntity<List<Product>>(productList,HttpStatus.OK);
	}
	
	
	 @PostMapping("/api/v1/product/post")
	    public Product addProduct(@RequestBody Product product) {
		 
	        Product addProduct = productService.addProduct(product);
	        return addProduct;
	        
	    }
	 
	 
	
	@DeleteMapping("/delete/{id}")
	public  ResponseEntity<String> deleteProductById(@PathVariable("id") int productId) {
		productService.deleteProductById(productId);
		return new ResponseEntity<String>("Product Deleted", HttpStatus.OK);
	}
	
	@GetMapping("/productname/{pn}")
	ResponseEntity<List<Product>> getProductByProductName(@PathVariable("pn") String productName) {
		List<Product> productList = productService.findByName(productName);
		return new ResponseEntity<List<Product>>(productList, HttpStatus.OK);
	}

	@GetMapping("/unitprice")
    public ResponseEntity<List<Product>> getProductsByUnitPriceRange(
            @RequestParam(name = "min", required = false) BigDecimal minUnitPrice,
            @RequestParam(name = "max", required = false) BigDecimal maxUnitPrice) {
        List<Product> products = productService.getProductsByUnitPriceRange(minUnitPrice, maxUnitPrice);
        return new ResponseEntity<>(products, HttpStatus.OK);
    }
	
	 
}