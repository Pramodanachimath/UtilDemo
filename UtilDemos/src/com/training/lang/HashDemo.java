package com.training.lang;

public class HashDemo {

	public static void main(String[] args) {
		Vehicle vehicle1 =new Vehicle("Civic","Honda","black");
		Vehicle vehicle2 =new Vehicle("Civic","Honda","white");
		Vehicle vehicle3 =new Vehicle("City","Honda","white");
		Vehicle vehicle4 =new Vehicle("A123","Audi","Red");
		
		System.out.println("V1 & V2 "+(vehicle1.equals(vehicle2)));
		System.out.println("V2 & V3 "+(vehicle2.equals(vehicle2)));
		System.out.println("V1 & V4 "+(vehicle1.equals(vehicle2)));
		System.out.println();
		
		System.out.println("V1 "+vehicle1.hashCode());
		System.out.println("V2 "+vehicle2.hashCode());
		System.out.println("V3 "+vehicle3.hashCode());
		System.out.println("V4 "+vehicle4.hashCode());
	}
}
