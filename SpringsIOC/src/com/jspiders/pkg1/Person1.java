package com.jspiders.pkg1;

public class Person1 {
	private String name;
	private int age;
	private PersonAddress work;
	//	public Person1(String name, int age) {
	//		super();
	//		this.name = name;
	//		this.age = age;
	//	}

	//	public PersonAddress getWork() {
	//		return work;
	//	}
	//
	//	public void setWork(PersonAddress work) {
	//		this.work = work;
	//	}

	
	public Person1(String name, int age, PersonAddress work) {
		super();
		this.name = name;
		this.age = age;
		this.work = work;
	}


	@Override
	public String toString() {
		return "Person1 [name=" + name + ", age=" + age + ", work=" + work + "]";
	}

}
