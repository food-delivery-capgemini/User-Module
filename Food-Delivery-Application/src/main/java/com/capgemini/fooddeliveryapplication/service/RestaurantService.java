package com.capgemini.fooddeliveryapplication.service;

import java.util.List;

import com.capgemini.fooddeliveryapplication.entity.Restaurant;

public interface RestaurantService {

	public List<Restaurant> getRestaurants();
	public Restaurant add(Restaurant resto);
}
