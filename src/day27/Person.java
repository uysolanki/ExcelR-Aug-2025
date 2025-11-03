package day27;

import java.util.Scanner;

public class Person {

	protected long adharNo;		//total Data members  = 3
	protected String name;
	protected int age;
	
	public Person()
	{
		this.adharNo=111222;
		this.name="Raj";
		this.age=18;
	}
	
	public Person(long a,String b,int c)
	{
		this.adharNo=a;
		this.name=b;
		this.age=c;
	}
	
	public void acceptPerson()			//total Methods  = 2
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter adhar Number");
		this.adharNo=sc.nextLong();
		
		System.out.println("Enter Name");
		this.name=sc.next();
		
		System.out.println("Enter Age");
		this.age=sc.nextInt();
	}
	
	
	public void displayPerson()
	{
		System.out.println("Adhar Number is "+ this.adharNo);
		System.out.println("Name is "+ this.name);
		System.out.println("Age is "+ this.age);
	}
}
