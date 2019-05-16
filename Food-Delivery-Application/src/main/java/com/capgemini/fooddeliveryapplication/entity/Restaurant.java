package com.capgemini.fooddeliveryapplication.entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Restaurant {

	private int restaurantId;
	private String restaurantName;
	private String address;

	public Restaurant() {
		super();
	}

	public Restaurant(int restaurantId, String restaurantName, String address) {
		super();
		this.restaurantId = restaurantId;
		this.restaurantName = restaurantName;
		this.address = address;
	}

	public int getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}

	public String getRestaurantName() {
		return restaurantName;
	}

	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
