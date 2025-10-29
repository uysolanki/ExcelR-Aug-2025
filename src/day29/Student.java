package day29;

import java.util.Scanner;

public class Student {
	
	private int rno;
	private String sname;
	private double per;
	private static String uniName;
	private static String principalName;
	
	static {
		uniName="Oxford University";
		principalName="Mr. Smith";
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
	
	public static void displayUniversityName()
	{
		int x;  //local scope
		System.out.println("University name is "+ Student.uniName);
		System.out.println("Principal name is "+ Student.principalName);
	}

}
