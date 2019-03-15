package com.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyBook {
	@Before(value="execution(* com.aop.Book.add(..))")
	public void before1(){
		System.out.println("before..................");
	}

}
