package com.capgemini.fooddeliveryapplication.dish.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.capgemini.fooddeliveryapplication.entity.Dish;

public interface DishRepository extends MongoRepository<Dish, Integer> {

}
