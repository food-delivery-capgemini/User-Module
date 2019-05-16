package com.capgemini.fooddeliveryapplication.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Dish {

	@Id
	private int dishId;
	private String dishName;
	private int dishPrice;
	private String imgUrl;

	public Dish() {
		super();
	}

	

	public Dish(int dishId, String dishName, int dishPrice, String imgUrl) {
		super();
		this.dishId = dishId;
		this.dishName = dishName;
		this.dishPrice = dishPrice;
		this.imgUrl = imgUrl;
	}



	public String getImgUrl() {
		return imgUrl;
	}



	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}



	public int getDishId() {
		return dishId;
	}

	public void setDishId(int dishId) {
		this.dishId = dishId;
	}

	public String getDishName() {
		return dishName;
	}

	public void setDishName(String dishName) {
		this.dishName = dishName;
	}

	public int getDishPrice() {
		return dishPrice;
	}

	public void setDishPrice(int dishPrice) {
		this.dishPrice = dishPrice;
	}

}
