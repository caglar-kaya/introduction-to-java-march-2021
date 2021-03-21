package com.java.week06.b;

class JavaClassroom extends StaticConcept {
	String name;
	String lastName;
	// For common attributes for different objects, we use static keyword
	// static variables are class level variables and they have same value in all objects
	static String teacher;
	static String institution;
	
	public JavaClassroom(String name, String lastName) {
		this.name = name;
		this.lastName = lastName;
	}
}

public class StaticConcept {

	public static void main(String[] args) {

		JavaClassroom student1 = new JavaClassroom("Talha", "Komurcu");
		JavaClassroom student2 = new JavaClassroom("Ibrahim", "Savran");
		
		JavaClassroom.teacher = "Ahmet Can Turk";
		JavaClassroom.institution = "Silicone Labs";
		
		System.out.println(student1.name + "-" + student1.lastName 
				+ "-" + JavaClassroom.teacher + "-" + JavaClassroom.institution);
		
		System.out.println(student2.name + "-" + student2.lastName 
				+ "-" + JavaClassroom.teacher + "-" + JavaClassroom.institution);
		
		student1.teacher = "Professor Brown";
		student1.institution = "NJIT";
		
		System.out.println(student1.name + "-" + student1.lastName 
				+ "-" + JavaClassroom.teacher + "-" + JavaClassroom.institution);
		
		System.out.println(student2.name + "-" + student2.lastName 
				+ "-" + JavaClassroom.teacher + "-" + JavaClassroom.institution);
	}

}
