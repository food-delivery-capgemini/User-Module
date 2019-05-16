package com.capgemini.fooddeliveryapplication.cart.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.capgemini.fooddeliveryapplication.entity.Cart;

public interface CartRepository extends MongoRepository<Cart, Integer>  {

	public Cart findCartByEmail(String  email);
	
	public void deleteByEmail(String email);
}
