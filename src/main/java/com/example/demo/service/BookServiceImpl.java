package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.beans.BookDetails;

@Service
public class BookServiceImpl implements BookService{

	List<BookDetails> bookList = new ArrayList<>();
	@Override
	public boolean saveBookDetails(BookDetails book) {
	Optional<String> checkId = Optional.ofNullable(book.getName());
		if(checkId.isPresent()) {
			bookList.add(book);
			return true;
		}
		else {
			return false;
		}
		
	}
	@Override
	public List<BookDetails> getBookDetails() {
		// TODO Auto-generated method stub
		return bookList;
	}

}
