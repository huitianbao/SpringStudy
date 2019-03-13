package com.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyBook {
	public void before1(){
		System.out.println("this is MyBook.before1()..................");
	}
	
	
	public void after1(){
		System.out.println("this is MyBook.after1()..................");
	}
	
	//环绕通知
	public void around1(ProceedingJoinPoint proceedingJoinPoint){
		System.out.println("之前");
		try {
			proceedingJoinPoint.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("之后");
	}

}
