package com.example.demo.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.beans.Store;
import com.example.demo.service.StoreService;

@RestController
public class StoreController {
	
	@Autowired
	StoreService storeService;
	
	public List<Store> geStoreDetails(){
		
		return storeService.getStoreData();
	}

}
