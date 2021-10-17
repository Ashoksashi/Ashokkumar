package org.student;

import org.departmen.Department;
public class Student extends Department{
	
	public void studentName() {
		// TODO Auto-generated method stub
		System.out.println("studentName Arun");
	}
	public void studentDept() {
		// TODO Auto-generated method stub
		System.out.println("studentDept CSC");
	}
	public void studentId() {
		// TODO Auto-generated method stub
		System.out.println("studentId 120");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj= new Student();
		
		obj.collegeName();
		obj.collegeCode();
		obj.collegeRank();
		obj.deptName();
		obj.studentName();
		obj.studentId();
		obj.studentDept();
	}

}
