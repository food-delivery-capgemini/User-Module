package com.capgemini.fooddeliveryapplication.item.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.fooddeliveryapplication.entity.Item;
import com.capgemini.fooddeliveryapplication.item.service.ItemService;

@RestController
@CrossOrigin("*")

public class ItemController {

	@Autowired
	private ItemService itemService;

	@PostMapping("/items")
	public ResponseEntity<Item> add(@RequestBody Item item) {
		return new ResponseEntity<Item>(itemService.add(item), HttpStatus.OK);
	}
}
