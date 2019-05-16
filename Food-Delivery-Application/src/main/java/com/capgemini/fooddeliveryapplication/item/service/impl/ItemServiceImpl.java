package com.capgemini.fooddeliveryapplication.item.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.fooddeliveryapplication.entity.Item;
import com.capgemini.fooddeliveryapplication.item.repository.ItemRepository;
import com.capgemini.fooddeliveryapplication.item.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	ItemRepository itemRepo;
	
	@Override
	public Item add(Item item) {
		return itemRepo.save(item);
	}

}
