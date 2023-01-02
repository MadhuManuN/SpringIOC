package com.jspiders.pkg1;

public class Person {
	private String name;
	private int id;
	private PersonAddress work;
	
	public String getName() {
		return name;
	}
	public PersonAddress getWork() {
		return work;
	}
	public void setWork(PersonAddress work) {
		this.work = work;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + ", work=" + work + "]";
	}
	
	
}
