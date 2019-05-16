package com.capgemini.fooddeliveryapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.fooddeliveryapplication.entity.Restaurant;
import com.capgemini.fooddeliveryapplication.service.RestaurantService;

@RestController
@CrossOrigin("*")

public class RestaurantDetailsController {

	@Autowired
	private RestaurantService service;

	@GetMapping("/order")
	public ResponseEntity<List<Restaurant>> getAllRestaurants() {
		List<Restaurant> restaurant = service.getRestaurants();
		return new ResponseEntity<List<Restaurant>>(restaurant, HttpStatus.OK);
	}

	@PostMapping("/add")
	public Restaurant add(@RequestBody Restaurant resto) {
		return service.add(resto);

	}
}
