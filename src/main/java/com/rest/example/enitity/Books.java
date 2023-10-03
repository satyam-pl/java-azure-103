package com.rest.example.enitity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rest.example.service.BookService;


public class Books {
	

	
private int id;
private String name;
private String Author;



public Books(int id, String name, String author) {
	super();
	this.id = id;
	this.name = name;
	Author = author;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAuthor() {
	return Author;
}
public void setAuthor(String author) {
	Author = author;
}
public Books() {
	super();
	// TODO Auto-generated constructor stub
}



	

}
