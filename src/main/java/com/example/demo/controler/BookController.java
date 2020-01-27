package com.example.demo.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.beans.BookDetails;
import com.example.demo.service.BookService;
import com.google.gson.Gson;

@RestController
public class BookController {
	
	@Autowired
	BookService bookService;

	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome to the party...";
	}
	
	@GetMapping("/getbookdetails")
	public String getBookDetails() {
		List<BookDetails> list = bookService.getBookDetails();
		if(list.isEmpty()) {
			return "no record found in list";
		}
		return new Gson().toJson(list);
	}
	
	@PostMapping("/savebookdetails")
	public String saveBookDetails(@RequestBody BookDetails book) {
		boolean status = bookService.saveBookDetails(book);
		if(status) {
			return "Book details saved successfully...";
		}
		else {
			return "please try again with correct details";
		}
	}
}
