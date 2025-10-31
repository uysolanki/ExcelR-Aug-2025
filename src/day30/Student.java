package day30;

import java.util.Scanner;

public class Student {
	
	private int rno;
	private String sname;
	private double per;
	
	public void acceptStudent()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter Roll No");				//18
		rno=sc.nextInt(); 
		
		System.out.println("Please enter Student Name");        //Virat
		sname=sc.next();
		
		System.out.println("Please enter Student Percentage");  //78.5
		per=sc.nextDouble();
	}
	
	public Student()  //NoArgConstructor
	{
		this.rno=1;
		this.sname="Raj";
		this.per=40.0;
	}
	
	public Student(int a,String b, double c)  //Parameterised Constructor or AllArgsConstructor
	{
		this.rno=a;
		this.sname=b;
		this.per=c;
	}
	
	public void displayStudent()   //
	{
		System.out.println("Student Roll No is "+ rno);
		System.out.println("Student Name is "+ sname);
		System.out.println("Student Percentage is "+ per);
	}	
}
