package com.mayur.telusko.SpringCore;

import org.springframework.stereotype.Component;

public class Alien1 {
	
	private int age;
	private Laptop laptop;
	
	
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	/*
	Alien()
	{
		System.out.println("alien object created"); 
	}
	*/
	
	public String code()
	{
		return "coding ....";
	}
	
	


	public Alien1(int age) {
		super();
		this.age = age;
	}
	public int getAge() {
		// TODO Auto-generated method stub
		return age;
	}

}
