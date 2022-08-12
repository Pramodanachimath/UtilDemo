package com.training.customer;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LamdaDemo {

	public static void main(String[] args) {

		List<Vehicle> vehicleList=Arrays.asList(new Vehicle("Mahindra", "XUV", 500000),
				new Vehicle("Hyundai", "i30", 300000),
				new Vehicle("Tata Motors", "Nexon", 100000));
		
		System.out.println("Sorting by model");
		Collections.sort(vehicleList,(v1,v2)-> v1.getModel().compareTo(v2.getModel())
		);
		for (Vehicle vehicle : vehicleList) {
			System.out.println(vehicle);
		}
		System.out.println();
		System.out.println("Sorting by price");
		
		Collections.sort(vehicleList, (v1,v2)->((Double)v1.getPrice()).compareTo(v2.getPrice()));
		for (Vehicle vehicle : vehicleList) {
			System.out.println(vehicle);
		}
		System.out.println();
		System.out.println("Sorting by brand");
		Collections.sort(vehicleList, (v1,v2)->v1.getBrand().compareTo(v2.getBrand()));
		for (Vehicle vehicle : vehicleList) {
			System.out.println(vehicle);
		}
	}

}
