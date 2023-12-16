package com.orderInventory.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
public class Customers {
	
	
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    
	    @Column(name="customer_id", nullable=false , unique = true)
	    private int customerId;
	    
	    @Column(name="email_address", nullable=false , unique = true)
	    private String emailAddress;

	    @Column(name="full_name", nullable = false)
	    private String fullName;

}
