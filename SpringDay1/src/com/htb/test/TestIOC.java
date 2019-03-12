package com.htb.test;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Bean2;
import com.bean.Bean3;
import com.htb.User;

public class TestIOC {
	public static void testUser(){
		ApplicationContext context=
				new ClassPathXmlApplicationContext("Bean1.xml");
		
//		User user=(User)context.getBean("user");
//		System.out.println("1111"+user);
//		user.add();
		
		
		// test Bean2
//		Bean2 bean2=(Bean2)context.getBean("bean2");
//		System.out.println(bean2);
//		bean2.add();
		
		// test Bean3
		Bean3 bean3=(Bean3)context.getBean("bean3");
		System.out.println(bean3);
		bean3.add();
		
	}
	public static void main(String[] args) {
		testUser();
		
	}
	

}
