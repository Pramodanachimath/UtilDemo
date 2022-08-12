package com.training.lang;

public class Student implements Cloneable{
  private String studentName;
  private int studentId;
public Student(String studentName, int studentId) {
	super();
	this.studentName = studentName;
	this.studentId = studentId;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public int getStudentId() {
	return studentId;
}
public void setStudentId(int studentId) {
	this.studentId = studentId;
}
@Override
public String toString() {
	return "Student [studentName=" + studentName + ", studentId=" + studentId + "]";
}
@Override
protected Student clone() throws CloneNotSupportedException {
	// TODO Auto-generated method stub
	return (Student) super.clone();
}
  
}
