package com.custom.exception;

public class Voter {

	
	String name;
	int age;
	public Voter(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Voter [name=" + name + ", age=" + age + "]";
	}
	
}
