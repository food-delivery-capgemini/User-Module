package com.capgemini.fooddeliveryapplication.dish.service;

import java.util.List;

import com.capgemini.fooddeliveryapplication.entity.Dish;

public interface DishService {

	public List<Dish> getDishes();

	public Dish getDishById(int dishId);

	public Dish add(Dish dishes);

}
