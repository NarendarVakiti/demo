package com.example.demo.beans;

import java.util.List;

public class Store {
	
	private List<BookDetails> books;
	private List<Items> items;
	
	public Store() {
		
	}
	
	
	
	public Store(List<BookDetails> books, List<Items> items) {
		super();
		this.books = books;
		this.items = items;
	}



	public List<BookDetails> getBooks() {
		return books;
	}
	public void setBooks(List<BookDetails> books) {
		this.books = books;
	}
	public List<Items> getItems() {
		return items;
	}
	public void setItems(List<Items> items) {
		this.items = items;
	}
	
	
	

}
