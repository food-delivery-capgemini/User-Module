package com.capgemini.fooddeliveryapplication.cart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.fooddeliveryapplication.cart.service.CartService;
import com.capgemini.fooddeliveryapplication.dish.service.DishService;
import com.capgemini.fooddeliveryapplication.entity.Cart;
import com.capgemini.fooddeliveryapplication.entity.Item;

@RestController
@CrossOrigin("*")
public class CartController {

	@Autowired
	private CartService cartService;
	

	@Autowired
	private DishService dishService;
	
	
	@GetMapping("/carts/{email}")
	public ResponseEntity<Cart> findCartByCustomerId(@PathVariable String email) {
		return new ResponseEntity<Cart>(cartService.findCartByEmail(email), HttpStatus.OK);
	}

	@PostMapping("/carts")
	public ResponseEntity<Cart> addNewCart(@RequestBody Cart cart) {
		
		
		Cart cart2=cartService.updateCart(cart);
		return new ResponseEntity<Cart>(cart2, HttpStatus.OK);
	}

//	@PutMapping("/carts")
//	public ResponseEntity<Cart> updateCart(@RequestBody Cart cart) {
//		return new ResponseEntity<Cart>(cartService.addOrUpdateCart(cart), HttpStatus.OK);
//	}

	@DeleteMapping("/carts/{email}")
	public ResponseEntity<Void> deleteCartById(@PathVariable String email) {
		cartService.deleteCartByEmail(email);;
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	

//	@GetMapping("cart/dishes")
//public ResponseEntity<List<Dish>> getDishes()
//	{
//		List<Dish> dishes = service.getDishInformation();
//		return new ResponseEntity<List<Dish>>(dishes, HttpStatus.OK);
//		
//
//	}
	
//	 public  ResponseEntity<Cart> add(@RequestBody Dish dishes) {
//		 Cart cart=service.add(dishes);
//	 cart=repo.save(new Dish(dishes.getDishId(),dishes.getDishName(),dishes.getDishPrice()));
//		Cart cart=  repo.saveAll(dishes);
//	 
//	    return new ResponseEntity<Cart>(cart, HttpStatus.OK);
//	  }
	
	
//	 
	 
//	@PostMapping("cart/dishes/add/{id}")
//
//	 public ResponseEntity<Cart> addNew(@PathVariable(value="id") Integer dishId) {
//		 Cart cart = service.add(dishService.getDishById(dishId));
//
//
//		 return new ResponseEntity<Cart>(cart, HttpStatus.OK);
//		}
	
	
	
//	@PostMapping("add/{id}")
//	public ResponseEntity<Cart> update(@PathVariable(value="id") Integer dishId,@RequestBody Dish dish){
		//List<Dish> dish=service.getDishInformation();
//	Cart cart=new Cart();	
//	Dish dish1=service.getDishById(dishId);
	//cart.setDishId(dish1.getDishId());
	//cart.setDishName(dish1.getDishName());
	//cart.setPrice(dish1.getDishPrice());
	
//if(dish1.getDishId()==dishId) {
		
//	cart.setQuantity(cart.getQuantity());
		
	//}
		
		
//		return ResponseEntity.ok(service.add(cart));
		
//	}
}
