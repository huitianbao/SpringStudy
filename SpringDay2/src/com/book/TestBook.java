package com.book;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBook {
	public static void main(String[] args){
		ApplicationContext context=new ClassPathXmlApplicationContext("book.xml");
		BookService bookService=(BookService)context.getBean("bookService");
		bookService.getBookService();
	}

}
