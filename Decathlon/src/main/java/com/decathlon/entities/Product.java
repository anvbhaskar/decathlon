package com.decathlon.entities;

import javax.persistence.Entity;

@Entity
public class Product {
	
	private Integer productId;
	private String productName;
	
	private String productSport;
	
	private String productLevel;
	
	private String productDescription;
	
	public Store associatedStores;
	
	
}
