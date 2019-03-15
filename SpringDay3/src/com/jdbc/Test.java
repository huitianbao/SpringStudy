package com.jdbc;

import java.util.List;

import com.entity.User;
import com.util.PrintListOfReult;

public class Test {
	public static void main(String[] args){
		JDBCTemplateDemo1 jdbcTemplateDemo1=new JDBCTemplateDemo1();
//		jdbcTemplateDemo1.add();
//		jdbcTemplateDemo1.update();
//		jdbcTemplateDemo1.deleteById(4);
		
		
//		
//		System.out.println(jdbcTemplateDemo1.queryTotalCount());
//		System.out.println(jdbcTemplateDemo1.queryById(1));
//		System.out.println(jdbcTemplateDemo1.queryById(3));
//		System.out.println(jdbcTemplateDemo1.queryById(0));
		
		//测试数据库的全部结果的输出
		List<User> list=jdbcTemplateDemo1.getAll();
		System.out.println(list);
		PrintListOfReult printListOfReult=new PrintListOfReult();
		printListOfReult.printList(list);
		
	}

}
