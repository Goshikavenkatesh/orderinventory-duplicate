package com.orderInventory.entity;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
public class Product {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 
	@Column(name = "product_id" ) 
	private int productId;
	
	@Column(name = "product_name")
	private String productName;
	
	@Column(name = "unit_price")
    private BigDecimal unitPrice;
    
	@Column(name = "colour")
    private String colour;
    
	@Column(name = "brand")
    private String brand;
    
	@Column(name = "size")
    private String size;
    
	@Column(name = "rating")
    private int rating;
    
    
    
}
