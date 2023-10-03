package com.rest.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.example.enitity.Books;
import com.rest.example.service.BookService;

@RestController
public class BookControl {

	
	
	
	@Autowired
	private BookService bookService;
	
	@GetMapping("/books")
	public List<Books>books()
	{
		
		
		return bookService.getAllBooks() ;
	}
	
	@GetMapping("/books/{id}")
	public Books getBook(@PathVariable("id") int id)
	{
		return bookService.getBookById(id);
	}
	
	
	// This is a post method where a json data is send from postman
	//Then the json data is converted to the object of Books type then added to the list by calling the method
	@PostMapping("/books")
	public Books addBook(@RequestBody Books book)
	{
	Books b4 = bookService.addBook(book);
	System.out.println("book added");
	return b4;
	}
}
