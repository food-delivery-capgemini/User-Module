package com.capgemini.fooddeliveryapplication.repository;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.capgemini.fooddeliveryapplication.entity.Restaurant;

public interface RestaurantRepository  extends MongoRepository<Restaurant, Integer>{

}
