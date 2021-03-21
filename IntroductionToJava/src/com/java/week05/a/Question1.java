package com.java.week05.a;
public class Question1 {
	public static void main(String[] args) {
		Person person1 = new Person();
		person1.name = "Caglar";
		person1.nickName = "No nickname";
		Person.teamNumber = 12345;
		person1.age = 32;
		person1.showName();
		person1.showAge();
		System.out.println(Person.showTeamNumber());
	}
}
class Person {
	String name;
	String nickName;
	static int teamNumber;
	int age;
	
	void showName() {
		System.out.println(name);
	}
	
	void showAge() {
		System.out.println(age);
	}
	
	static int showTeamNumber() {
		return teamNumber;
	}
}
