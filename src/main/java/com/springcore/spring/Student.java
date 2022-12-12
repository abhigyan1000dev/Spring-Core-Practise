package com.springcore.spring;

public class Student {
	String name;
	int rollnumber;
	int Id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollnumber() {
		return rollnumber;
	}
	public void setRollnumber(int rollnumber) {
		this.rollnumber = rollnumber;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollnumber=" + rollnumber + ", Id=" + Id + "]";
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, int rollnumber, int id) {
		super();
		this.name = name;
		this.rollnumber = rollnumber;
		Id = id;
	}
	
}
