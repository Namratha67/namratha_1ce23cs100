package com.abstraction;

class Student{
	public int id;
	public String name;
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public Student(int id) {
		super();
		this.id = id;
	}
	
}

public class ConstructorinJava {
	public static void main(String[]args) {
		Student s1= new Student(101,"Mohan");
		Student s2= new Student(102);
		System.out.println("First student:");
		System.out.println("Id: "+s1.id);
		System.out.println("Name: "+s1.name);
		System.out.println("Id: "+s2.id);
		System.out.println("Name: "+s2.name);
		
		
		
	}

}
