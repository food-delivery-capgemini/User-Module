package com.capgemini.fooddeliveryapplication.entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Item {

	private Dish dish;
	private int quantity;

	public Item() {
		super();
	}

	public Item(Dish dish, int quantity) {
		super();
		this.dish = dish;
		this.quantity = quantity;
	}

	public Dish getDish() {
		return dish;
	}

	public void setDish(Dish dish) {
		this.dish = dish;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
