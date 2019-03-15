package com.util;

import java.util.List;

import com.entity.User;

public class PrintListOfReult {
	User user_t=null;
	public void printList(List<User> list){
		for (int i = 0; i <list.size(); i++) {
			user_t=list.get(i);
			System.out.println("id      :"+user_t.getId());
			System.out.println("username:"+user_t.getUsername());
		}
	}

}
