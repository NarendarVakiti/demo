package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.beans.Store;

@Service
public class StorServiceImpl implements StoreService{

	@Autowired
	BookService bookService;
	
	@Autowired
	ItemsService itemService;
	
	@Override
	public List<Store> getStoreData() {
		Store store = new Store();
		store.setBooks(bookService.getBookDetails());
		store.setItems(itemService.getItems());
		List<Store> storeList = new ArrayList<>();
		storeList.add(store);
		
		return storeList;
	}

}
