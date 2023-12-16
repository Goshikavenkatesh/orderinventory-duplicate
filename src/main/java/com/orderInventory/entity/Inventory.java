package com.orderInventory.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data

@Table(name="inventory")
public class Inventory {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    
	    @Column(name="inventory_id")
	    private int inventoryId;
	    
	    @ManyToOne
	    @JoinColumn(name = "store_id")
	    private Store storeId;
	    
	    @ManyToOne
	    @JoinColumn(name = "product_id")
	    private Product productId;
	    
	    @Column(name="product_inventory",nullable = false)
	    private int productInventory;

}
