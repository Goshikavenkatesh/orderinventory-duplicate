package com.orderInventory.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Shipments {
	
	   @Id
	   @GeneratedValue(strategy = GenerationType.IDENTITY)
	   @Column(name = "shipment_id" )
	   private int shipmentId;
	    
	   @ManyToOne
	   @JoinColumn(name = "store_id")
	   private Store storeId;
	   
	   @ManyToOne
	   @JoinColumn(name = "customer_id")
	   private Customers customerId;
	    
	   @Column(name = "delivery_address" )
	   private String deliveryAddress;
	    
	   @Column(name = "shipment_status" )
	   private String shipmentStatus;

}
