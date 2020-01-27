package com.example.demo.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.beans.Items;
import com.example.demo.service.ItemsService;

@RestController
public class ItemsController {
	
	@Autowired
	ItemsService itemsService;
	
	@GetMapping("/getitems")
	public List<Items> getItems(){
		return itemsService.getItems();
		
	}

}
