package com.capgemini.fooddeliveryapplication.cart.service;

import com.capgemini.fooddeliveryapplication.entity.Cart;

public interface CartService {

	public Cart findCartByEmail(String email);

	public Cart updateCart(Cart cart);

	public void deleteCartByEmail(String email);

}
