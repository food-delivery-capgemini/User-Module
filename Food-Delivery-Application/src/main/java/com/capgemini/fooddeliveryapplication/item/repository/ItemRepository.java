package com.capgemini.fooddeliveryapplication.item.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.capgemini.fooddeliveryapplication.entity.Item;

public interface ItemRepository extends MongoRepository<Item, Integer> {

}
