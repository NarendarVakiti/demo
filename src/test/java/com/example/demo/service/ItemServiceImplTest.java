package com.example.demo.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.example.demo.beans.Items;


class ItemServiceImplTest {
	static ItemServiceImpl itemServiceImplMock;
	
	@BeforeAll
	public static void setUp() {
		 itemServiceImplMock = mock(ItemServiceImpl.class);
		
	}

	@Test
	void testGetItems() {
		when(itemServiceImplMock.getItems()).thenReturn(getItemsMock());
		List<Items> list = itemServiceImplMock.getItems();
		assertEquals(101, list.get(0).getId());

	}
	
	public List<Items> getItemsMock() {
		List<Items> itemList = new ArrayList<>();
		itemList.add(new Items(101,"Mouse",200));
		itemList.add(new Items(102,"Books",300));
		itemList.add(new Items(103,"Bags",100));
		itemList.add(new Items(104,"Computers",50));
		
		return itemList;
	}

}
