package org.student;

import org.department.Department;

public class Student extends Department {

	public void studentName() {
		System.out.println("Student name is David");
	}
	
	public void studentDept() {
		System.out.println("Student in IT department");
	}
	
	public void studentId() {
		System.out.println("Student ID is 356");
	}
	
	public static void main(String[] args) {
		
		Student s = new Student();
		s.collegeCode();
		s.collegeName();
		s.collegeRank();
		s.deptName();
		s.studentDept();
		s.studentId();
		s.studentName();

	}

}
