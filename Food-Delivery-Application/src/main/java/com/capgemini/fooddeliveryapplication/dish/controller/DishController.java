package com.capgemini.fooddeliveryapplication.dish.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.fooddeliveryapplication.dish.service.DishService;
import com.capgemini.fooddeliveryapplication.entity.Dish;

@RestController
@CrossOrigin("*")
public class DishController {

	@Autowired
	private DishService service;

	@GetMapping("/dish")
	public ResponseEntity<List<Dish>> getAllDishes() {
		List<Dish> dishes = service.getDishes();
		System.out.println(dishes);
		return new ResponseEntity<List<Dish>>(dishes, HttpStatus.OK);
	}

	@GetMapping("/dish/{id}")
	public ResponseEntity<Dish> getDishById(@PathVariable int id) {
		Dish dishes = service.getDishById(id);
		return new ResponseEntity<Dish>(dishes, HttpStatus.OK);
	}

	@PostMapping("/adddish")
	public Dish addDish(@RequestBody Dish dishes) {
		return service.add(dishes);

	}

}
