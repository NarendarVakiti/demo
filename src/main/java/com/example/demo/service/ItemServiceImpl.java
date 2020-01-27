package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.beans.Items;

@Service
public class ItemServiceImpl implements ItemsService{

	

	@Override
	public List<Items> getItems() {
		List<Items> itemList = new ArrayList<>();
		itemList.add(new Items(101,"Mouse",200));
		itemList.add(new Items(102,"Books",300));
		itemList.add(new Items(103,"Bags",100));
		itemList.add(new Items(104,"Computers",50));
		
		return itemList;
	}
	
	

}
