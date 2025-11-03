package day27;

import java.util.Scanner;

public class Employee extends Person
{
	private int eno;						//total Data members  = 6
	private String designation;
	private double salary;
	
	public Employee()
	{
		super();
		this.eno=101;
		this.designation="Intern";
		this.salary=800;
	}
	
	public Employee(long a,String b,int c,int d,String e,double f)
	{
		super(a,b,c);
		this.eno=d;
		this.designation=e;
		this.salary=f;
	}
	
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
		super.displayPerson();
	}
}
