package com.excelr.app;

import java.util.Scanner;

public class Test2 {
	
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
		
		if(avgMarks >=70)
		{
			System.out.println("DIST");
		}
		else if(avgMarks >=60)
		{
			System.out.println("FC");
		}
		else if(avgMarks >=50)
		{
			System.out.println("SC");
		}
		else if(avgMarks >=40)
		{
			System.out.println("PC");
		}
		else
		{
			System.out.println("Not Pass");
		}
		
	}
}
//avgMarks > 70   DIST
//avgMarks > 60   FC
//avgMarks > 50   SC
//avgMarks > 40   PC
//  			  Not Pass


//monthlyIncome  > 100000   Excellent
//monthlyIncome  > 75000    V Good
//monthlyIncome  > 50000    Good
//monthlyIncome  > 25000    OK
//			  		        Pls try hard
