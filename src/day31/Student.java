package day31;

import java.util.Scanner;

public class Student {
	
	private int rno;
	private String sname;
	private double per;
	
	public Student() {}
	public Student(int rno, String sname, double per) {
		this.rno = rno;
		this.sname = sname;
		this.per = per;
	}

	public void acceptStudent()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter Roll No");				//18
		rno=sc.nextInt(); 
		
		System.out.println("Please enter Student Name");        //Virat
		sname=sc.next();
		
		System.out.println("Please enter Student Percentage");  //78.5
		per=sc.nextDouble();
		displayStudent();
	}
	
	public void displayStudent()
	{
		System.out.println("Student Roll No is "+ rno);
		System.out.println("Student Name is "+ sname);
		System.out.println("Student Percentage is "+ per);
	}
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public double getPer() {
		return per;
	}
	public void setPer(double per) {
		this.per = per;
	}
	
	

}
