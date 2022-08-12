package com.training.customer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareDemo {

	public static void main(String[] args) {

		List<Vehicle> vehicleList=new ArrayList<>();
		
		vehicleList.add(new Vehicle("Tata Motors", "Nexon", 500000));
		vehicleList.add(new Vehicle("Mahindra", "XUV", 400000));
		vehicleList.add(new Vehicle("Maruti", "800", 400000));
		vehicleList.add(new Vehicle("Hyundai", "i20", 300000));
		vehicleList.add(new Vehicle("Maruti", "Nano", 700000));
		vehicleList.add(new Vehicle("Mahindra", "City", 100000));
		vehicleList.add(new Vehicle("Hyundai", "i30", 500000));
		
		for (Vehicle vehicle : vehicleList) {
			System.out.println(vehicle);
		}
		System.out.println();
		
		Collections.sort(vehicleList, new BrandSort());
		for (Vehicle vehicle : vehicleList) {
			System.out.println(vehicle);
		}
		System.out.println();
		
		for (Vehicle vehicle : vehicleList) {
			
		}
		
		List<Vehicle> vehicles=new ArrayList<>();
		for (Vehicle vehicle : vehicleList) {
			if(vehicle.getBrand().equalsIgnoreCase("Hyundai")) {
				vehicles.add(vehicle);
			}
		}
				
		for (Vehicle vehicle : vehicles) {
			System.out.println(vehicle);
		}
		System.out.println();
		
		List<Vehicle> vehiclesByModel=new ArrayList<>();
		for (Vehicle vehicle : vehicleList) {
			if(vehicle.getModel().equalsIgnoreCase("i20")) {
				vehicles.add(vehicle);
			}
		}
	
		for (Vehicle vehicle : vehiclesByModel) {
			System.out.println(vehicle);
		}
		System.out.println();
				
//		for (Vehicle vehicle : vehicleList) {
//			if(vehicle.getPrice()==price) {
//				
//			}
//		}
	}

}
