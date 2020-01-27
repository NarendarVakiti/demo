package com.example.demo.service;

import java.util.List;

import com.example.demo.beans.BookDetails;

public interface BookService {
	public boolean saveBookDetails(BookDetails book);

	public List<BookDetails> getBookDetails();

}
