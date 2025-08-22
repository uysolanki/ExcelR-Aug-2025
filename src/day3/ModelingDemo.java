package day3;

import java.util.Scanner;

public class ModelingDemo {

	public static void main(String[] args) {

		int age;
		double height,weight;
		
		Scanner sc=new Scanner(System.in);  //ctrl shift o
		
		System.out.println("Please enter your age in years");
		age=sc.nextInt();
		
		System.out.println("Please enter your height in feet");
		height=sc.nextDouble();
		
		System.out.println("Please enter your weight in kg");
		weight=sc.nextDouble();
		//  T     &&     T       &&         T
		// 21<=23      6.2>=6.1        75<=70
		if(age<=23 && height>=6.1 && weight<=70)
		{
			System.out.println("Eligible for Modeling");
		}
		else
		{
			System.out.println("Not Eligible for Modeling");
		}

	}

}
