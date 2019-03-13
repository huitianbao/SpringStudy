package com.book;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

public class BookService {
	@Resource(name = "bookDao")
	private BookDao bookDao;

	@Resource(name = "ordersDao")
	private OrdersDao ordersDao;
	
	@Resource(name="bookService")
	private BookService bookService;

	public void getBookService() {
		System.out.println("this is bookService...............");
		bookDao.getBook();
		ordersDao.getOrdersDao();
	
	}

}
