package day26;

import java.util.Scanner;

public class Student {
	
	private int rno;
	private String sname;
	private String city;
	private String email;
	private double per;
	
	
	public void acceptStudent()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter Roll No");
		rno=sc.nextInt();
		
		System.out.println("Please enter Student Name");
		sname=sc.next();
		
		System.out.println("Please enter City");
		city=sc.next();
		
		System.out.println("Please enter Student Email");
		email=sc.next();
		
		System.out.println("Please enter Student Percentage");
		per=sc.nextDouble();
	}
	
	public void displayStudent()
	{
		System.out.println("Student Roll No is "+ rno);
		System.out.println("Student Name is "+ sname);
		System.out.println("Student City is "+ city);
		System.out.println("Student Email is "+ email);
		System.out.println("Student Percentage is "+ per);
	}

}
