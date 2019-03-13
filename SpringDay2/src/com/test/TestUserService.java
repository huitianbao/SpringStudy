package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.anno.User;
import com.anno.UserService;

public class TestUserService {
	public static void main(String[] args){
		ApplicationContext context=new ClassPathXmlApplicationContext("Bean.xml");
		UserService userService=(UserService)context.getBean("userService");
		userService.getService();
		
	}

}
