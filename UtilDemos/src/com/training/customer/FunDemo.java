package com.training.customer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunDemo {

	public static void main(String[] args) {
//
//		Consumer<String> con = (str) -> System.out.println(str.toUpperCase());
//		con.accept("Hello");
//
//		Consumer<Integer> consumer = (num) -> System.out.println(num * 2);
//		consumer.accept(10);
//
//		BiConsumer<String, String> biconumer = (str1, str2) -> str1.equals(str2);
//		biconumer.accept("Hi", "Hello");
//
//		BiConsumer<Integer, Integer> bicon = (x, y) -> {
//			System.out.println("sum " + (x + y));
//			System.out.println("product " + (x * y));
//
//		};
//		bicon.accept(10, 20);
//
//		Predicate<String> pridicate = (str) -> str.equals("Hello");
//		System.out.println(pridicate.test("hello"));
//
//		Predicate<Integer> pridicate1 = (num) -> num > 10;
//		System.out.println(pridicate1.test(100));
//
//		BiPredicate<String, String> bipre = (str1, str2) -> str1.equals(str2);
//		System.out.println(bipre.test("Pam", "Pam"));
//
//		Supplier<String> sup = () -> "Great Day";
//		System.out.println(sup.get());
//
//		Predicate<String> pridicat = (str) -> str.equals("Hello");
//		System.out.println(pridicat.test("hello"));
//		System.out.println();
//
//		Predicate<Employee> pred = (Employee emp) -> {
//			if (emp.getCity().equals("Banglore"))
//				return true;
//
//			return false;
//		};
//		Employee emp1 = new Employee("Raj", 10, 1000, "Banglore");
//		System.out.println(pred.test(emp1));

		
		Function<String, String> fun=(str)->str.toUpperCase();
		System.out.println(fun.apply("Pramod"));
		System.out.println();
		
		Function<String, Integer> fun1=(str)->str.length();
		System.out.println(fun1.apply("Pramod"));
		System.out.println();
		
		Function<Integer, Integer> fun2=(num)->num*2;
		System.out.println(fun2.apply(10));
		System.out.println();
		
		Function<Employee, Integer> fun3=(employee)->employee.getEmployeeId();
		System.out.println(fun3.apply(new Employee("Pramod", 10, 22220, "Ban")));
		System.out.println();
		
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
		
		
		Function<List<Employee>, List<String>> fun4=(employList)->{
			for (Employee employee : employeeList) {
				  employee.getName();
			}
			return null;
			
		};
		System.out.println(fun4.apply(employeeList));
		System.out.println();
		
		Function<String, Employee> fun5=(str)->{
			Employee employee=new Employee();
			 employee.setName(str);;
			return employee;
		};
		System.out.println(fun5.apply("Pramod"));
		System.out.println();
		
	}

}
