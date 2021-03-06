package com.forest1.beans;

public class Person {
	private String name;
	private Car car;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(String name, Car car) {
		super();
		this.name = name;
		this.car = car;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", car=" + car + "]";
	}

}
