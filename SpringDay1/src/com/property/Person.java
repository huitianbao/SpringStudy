package com.property;

public class Person {
	private String pname;

	public Person(String pname) {

		this.pname = pname;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public void testPserson() {
		System.out.println("this is class person  " + pname);
	}

}
