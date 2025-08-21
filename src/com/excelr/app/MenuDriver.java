package com.excelr.app;

import java.util.Scanner;

public class MenuDriver {

	public static void main(String[] args) {
		System.out.println("1. Area Of Circle");
		System.out.println("2. Area Of Rectangle");
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please enter your Choice"); 
		int choice=sc.nextInt();
		
		switch(choice)
		{
		case 1 : 
			double radius,result;
			
			System.out.println("Please enter radius of Cicle"); //   5.5
			radius=sc.nextDouble();
			
			result=3.14*radius*radius;
			
			System.out.println("Area of Circle is "+result); //94.98
			
		
		break;
		case 2 : 
			double length,width;
			
			System.out.println("Please enter length of Rectangle"); //   5.5
			length=sc.nextDouble();
			
			System.out.println("Please enter width of Rectangle"); //   5.5
			width=sc.nextDouble();
			
			result=length*width;
			
			System.out.println("Area of Rectangle is "+result); //94.98
		
			break;
		default : System.out.println("Invalid Input");
		}

	}

}
