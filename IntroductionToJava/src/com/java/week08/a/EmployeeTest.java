package com.java.week08.a;

import java.util.Arrays;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee employee = new Employee(), 
				employee2 = new Employee(),
				employee3 = new Employee();
		employee.setName("Ahmet");
		employee.setSalary(5000);
		employee2.setName("Talha");
		employee2.setSalary(3000);
		employee3.setName("Suzan");
		employee3.setSalary(7000);
		
		System.out.println(employee.getName());
		System.out.println(employee.getSalary());
		
		String [] nameOfEmp = {employee.getName(), 
				employee2.getName(), employee3.getName()};
		
		int [] salOfEmp = {employee.getSalary(),
				employee2.getSalary(), employee3.getSalary()};
		
		System.out.println(Arrays.toString(nameOfEmp));
		System.out.println(Arrays.toString(salOfEmp));
	}

}
