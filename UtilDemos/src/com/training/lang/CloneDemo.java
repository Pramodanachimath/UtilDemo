package com.training.lang;

public class CloneDemo {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Student student=new Student("Pramod", 456);
         System.out.println(student);
         Student student1=null;
         try {
			student1=student.clone();
			
			System.out.println(student1);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
         
         System.out.println(student1);
         System.out.println(student1==student);
         System.out.println(student1.equals(student));
         System.out.println(student1.getClass()==student.getClass());
	}

}
