package com.capgemini.fooddeliveryapplication.entity;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Cart {

	private List<Item> item;
	private String email;
	private int totalAmount;


	public Cart() {
		super();
	}

	public Cart(List<Item> item, String email, int totalAmount) {
		super();
		this.item = item;
		this.email = email;
		this.totalAmount = totalAmount;
	}

	public List<Item> getItem() {
		return item;
	}

	public void setItem(List<Item> item) {
		this.item = item;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}

	

}
