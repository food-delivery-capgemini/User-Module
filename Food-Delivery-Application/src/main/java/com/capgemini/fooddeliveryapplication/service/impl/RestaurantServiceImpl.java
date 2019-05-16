package com.capgemini.fooddeliveryapplication.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.fooddeliveryapplication.entity.Restaurant;
import com.capgemini.fooddeliveryapplication.repository.RestaurantRepository;
import com.capgemini.fooddeliveryapplication.service.RestaurantService;

@Service
public class RestaurantServiceImpl implements RestaurantService {

	@Autowired
	private RestaurantRepository restaurant;

	@Override
	public List<Restaurant> getRestaurants() {
		return restaurant.findAll();
	}

	@Override
	public Restaurant add(Restaurant resto) {
		return restaurant.save(resto);
	}

}
