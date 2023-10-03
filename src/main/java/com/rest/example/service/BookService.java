package com.rest.example.service;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.rest.example.enitity.Books;

@Component
public class BookService {
	
	
private static List<Books> list = new ArrayList<>();


static
{
	list.add(new Books(11,"java","abc"));
			list.add(new Books(12,"c","richi"));
					list.add(new Books(13,"dsa","abc"));
					
					
				
}

public List<Books> getAllBooks()
{
	
	return list;
}

public Books getBookById(int id)
{
	Books b2 = null;
	b2=list.stream().filter(e->e.getId()==id).findFirst().get();
	return b2;
}


//this method will used to add a new book to the list;
public Books addBook(Books b)
{
	list.add(b);
	return b;
}

}
