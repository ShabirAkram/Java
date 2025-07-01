package com.collegeinfo.diffclass;

public class College {

	private void collegeName() {
		System.out.println("Cahcet");
	}
	private void collegeCode() {
		System.out.println("547");
	}
	private void collegeRank() {
		System.out.println("#72");
	}
	
	public static void main(String[] args) {
		College c=new College();
		c.collegeName();
		c.collegeCode();
		c.collegeRank();
		
		Student s=new Student();
		s.studentName();
		s.studentDept();
		s.studentId();
		
		Hostel h=new Hostel();
		h.hostelName();
		
		Dept d=new Dept();
		d.deptName();
	}
	
}
