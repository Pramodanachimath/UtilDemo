package com.training.customer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class EmployeeMain {

	public static void main(String[] args) {

		List<Employee> employeeList=new ArrayList<>();
		
		Employee employee1=new Employee("Pramod", 301, 22000, "Bijapur");
		Employee employee2=new Employee("Virat", 302, 25000, "Banglore");
		Employee employee3=new Employee("Rohit", 303, 42000, "Mysore");
		Employee employee4=new Employee("Rahul", 304, 32000, "Udupi");
		Employee employee5=new Employee("Pam", 305, 10000, "Banglore");
		
		employeeList.add(employee1);
		employeeList.add(employee2);
		employeeList.add(employee3);
		employeeList.add(employee4);
		employeeList.add(employee5);
		
		for(Employee employee:employeeList) {
			System.out.println("employee "+employee);
			
			
		}
		System.out.println();
		
		Collections.sort(employeeList);	
		for(Employee employee:employeeList) {
			System.out.println("Employee "+employee);
		}
		System.out.println();
		
		List<Employee> employeeByCity=new ArrayList<>();
		
		for (Employee employee : employeeList) {
			if(employee.getCity().equals("Banglore")) {
				employeeByCity.add(employee);
			}
		}
		for (Employee employee : employeeByCity) {
			System.out.println(employee);
		}
			
		
	}

}
