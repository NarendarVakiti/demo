package com.example.demo.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


class StorServiceImplTest {

	static StoreService storeServiceMock;
	@BeforeAll
	public void setupInit() {
		storeServiceMock = mock(StoreService.class);
	}
	@Test
	void testGetStoreData() {
		
	}

}
