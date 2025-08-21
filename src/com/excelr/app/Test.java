package com.excelr.app;

import java.util.Scanner;

public class Test {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int hindiMarks;
		int engMarks;
		int mathsMarks;
		int sumMarks;
		
		double avgMarks;
		
		System.out.println("Please enter Hindi Marks"); //80
		hindiMarks=sc.nextInt();
		System.out.println("Please enter English Marks"); //90
		engMarks=sc.nextInt();
		System.out.println("Please enter Maths Marks"); //90
		mathsMarks=sc.nextInt();
		sumMarks=hindiMarks+engMarks+mathsMarks;
		
		avgMarks=sumMarks/3;
		System.out.println("Total Marks "+sumMarks);
		System.out.println("Average Marks "+avgMarks);
		
		if(avgMarks >=40)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Not Pass");
		}
	}
}
//Alice Ben Chris