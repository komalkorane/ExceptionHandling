package com.CustomExceptionHandling;

public class Voter {

	String name;
	int age;
	String country;
	int voterId;
	
	public Voter() {
		super();
	}

	Voter(String name, int age, String country, int voterId){
		this.name=name;
		this.age=age;
		this.country=country;
		this.voterId=voterId;
	}

	@Override
	public String toString() {
		return "Voter [name=" + name + ", age=" + age + ", country=" + country + ", voterId=" + voterId + "]";
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country=country;
	}

	public int getVoterId() {
		return voterId;
	}

	public void setVoterId(int voterId) {
		this.voterId = voterId;
	}
	
}
