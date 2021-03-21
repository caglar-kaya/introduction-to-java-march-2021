package com.java.week07.b;

class Teacher1 {
	
	String name;
	int id;
	
	public Teacher1(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
}

class Student1 {
	
	String name;
	int id;
	
	public Student1(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
}

class ClassRoom1 {
	
	Teacher1 teacher1;
	Student1 student1;
	
	public ClassRoom1(Teacher1 teacher1, Student1 student1) {
		this.teacher1 = teacher1;
		this.student1 = student1;
	}
		
}

public class Composition3 {

	public static void main(String[] args) {

		ClassRoom1 obj = new ClassRoom1(new Teacher1("Caglar", 63), new Student1("Ali", 85));
		System.out.println(obj.teacher1.name);
		System.out.println(obj.teacher1.id);
		System.out.println(obj.student1.name);
		System.out.println(obj.student1.id);
		
	}

}
