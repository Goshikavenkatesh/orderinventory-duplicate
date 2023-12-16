package com.orderInventory.entity;

import java.math.BigDecimal;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class OrderItems {
	
	    @EmbeddedId
	    @Column(name = "order_id" )
        private OrderItemsId id;
	   
	    @Column(name = "line_item_id" )
	    private int lineItemId;
	    
	    @ManyToOne(cascade = CascadeType.PERSIST)
	    @JoinColumn(name = "product_id")
	    private Product productId;

	    @Column(name = "quantity" )
	    private int quantity;
	    
	    @Column(name = "unit_price" )
	    private BigDecimal unitPrice;
	    
	    @ManyToOne
	    @JoinColumn(name = "shipment_id")
	    private Shipments shipmentId;
	
	

}
