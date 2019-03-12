package com.property;


import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Date {
	private String[] array;
	private List list;
	private Map<String,String> map;
	private Properties properties;
	public void setArray(String[] array) {
		this.array = array;
	}
	public void setList(List list) {
		this.list = list;
	}
	public void setMap(Map<String, String> map) {
		this.map = map;
	}
	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	
	public void testDate(){
		System.out.println("array  "+array);
		System.out.println("list  "+list);
		System.out.println("map  "+map);
		System.out.println("property  "+properties);
		
	}
	

}
