package com.orderInventory.entity;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Store {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    
	    
	    @Column(name = "store_id" )
	    private int storeId;
	    
	    @Column(name = "store_name" )
	    private String storeName;
	    
	    @Column(name = "web_address" )
	    private String webAddress;
	    
	    @Column(name = "physical_address" )
	    private String physicalAddress;

	    @Column(name = "latitude", precision = 9, scale = 6)
	    private BigDecimal latitude;

	    @Column(name = "longitude", precision = 9, scale = 6)
	    private BigDecimal longitude;

	    @Column(name = "logo_mime_type" )
	    private String logoMimeType;
	    
	    @Column(name = "logo_file_name" )
	    private String logoFilename;

	    @Column(name = "logo_charset" )
	    private String logoCharset;

	    @Column(name = "logo_last_updated")
	    private LocalDate logoLastUpdated;

}
