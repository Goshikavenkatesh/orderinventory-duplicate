package com.orderInventory.entity;

import java.sql.Timestamp;

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
public class Orders {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    
	    @Column(name = "order_id" )
	    private Integer orderId;
	    
	    @ManyToOne
	    @JoinColumn(name = "customer_id")
	    private Customers customerid;
	    
	    @ManyToOne
	    @JoinColumn(name = "store_id")
	    private Store store;
	    

	    @Column(name = "order_tms" )
	    private Timestamp orderTms;
	    
	    @Column(name = "order_status" )
	    private String orderStatus;

}
