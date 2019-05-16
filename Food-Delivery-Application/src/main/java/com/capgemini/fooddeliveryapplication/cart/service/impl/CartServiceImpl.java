package com.capgemini.fooddeliveryapplication.cart.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.fooddeliveryapplication.cart.repository.CartRepository;
import com.capgemini.fooddeliveryapplication.cart.service.CartService;
import com.capgemini.fooddeliveryapplication.dish.repository.DishRepository;
import com.capgemini.fooddeliveryapplication.entity.Cart;
import com.capgemini.fooddeliveryapplication.entity.Dish;

@Service
public class CartServiceImpl implements CartService {

	@Autowired
	private CartRepository cartRepo;

	@Autowired
	private DishRepository dishes;

	List<Dish> dish1;

	@Override
	public Cart findCartByEmail(String email) {
		return cartRepo.findCartByEmail(email);
	}

	@Override
	public Cart updateCart(Cart cart) {
		return cartRepo.save(cart);
	}

	@Override
	public void deleteCartByEmail(String email) {
		cartRepo.deleteByEmail(email);
	}

//	@Override
//	public List<Dish> getDishInformation() {
//		dish1= dishes.findAll() ;
//		return dish1;
//	}

//	@Override
//	public Cart add(int dishId) {
//		Cart carts=new Cart();
//		for(Dish d:dish1) {
//			
//			if(d.getDishId()==dishId) {
//				
//				dish1.add(d);				
//				
//			}
//		}
//		
//		 carts.setDish(dish1);
//		 return cart.save(carts);
//	}

//	@Override
//	public Cart add(Cart carts) {
//		
//		return cartRepo.save(carts);
//	}
//	

//	@Override
//	public Cart addToCart(Dish dishes) {
//		
//		return cart.saveAll(dishes);
//	}

//	@Override
//	public Dish getDishById(int dishId) {
//		return dishes.findById(dishId).get();
//	}

}
