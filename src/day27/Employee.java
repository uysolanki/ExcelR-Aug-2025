package day27;

import java.util.Scanner;

public class Employee extends Person
{
	private int eno;						//total Data members  = 6
	private String designation;
	private double salary;
	
	public void acceptEmployee()			//total Methods  = 4
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee Number");
		this.eno=sc.nextInt();
		
		System.out.println("Enter Designation");
		this.designation=sc.next();
		
		System.out.println("Enter Salary");
		this.salary=sc.nextDouble();
	}
	
	public void displayEmployee()
	{
		System.out.println("Employee Number is "+ this.eno);
		System.out.println("Designation is "+ this.designation);
		System.out.println("Salary is "+ this.salary);
	}
}
