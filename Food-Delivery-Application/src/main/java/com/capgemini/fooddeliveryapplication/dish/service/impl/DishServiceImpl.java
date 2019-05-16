package com.capgemini.fooddeliveryapplication.dish.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.fooddeliveryapplication.dish.repository.DishRepository;
import com.capgemini.fooddeliveryapplication.dish.service.DishService;
import com.capgemini.fooddeliveryapplication.entity.Dish;

@Service
public class DishServiceImpl implements DishService {

	@Autowired
	private DishRepository dishRepository;

	@Override
	public List<Dish> getDishes() {
		return dishRepository.findAll();
	}

	@Override
	public Dish getDishById(int dishId) {
		return dishRepository.findById(dishId).get();
	}

	@Override
	public Dish add(Dish dishes) {
		return dishRepository.save(dishes);
	}

}
