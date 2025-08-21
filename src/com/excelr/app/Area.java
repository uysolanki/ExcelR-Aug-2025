//Program to calculate area of circle
package com.excelr.app;

import java.util.Scanner;

public class Area {

	public static void main(String args[])
	{
		double radius,result;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please enter radius"); //   5.5
		radius=sc.nextDouble();
		
		result=3.14*radius*radius;
		
		System.out.println("Area of Circle is "+result); //94.98
		
		if(result>=100)
		{
			System.out.println("Big Circle");
		}
		else
		{
			System.out.println("Small Circle");
		}
		
	}
}
