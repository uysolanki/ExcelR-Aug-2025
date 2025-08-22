package day3;

import java.util.Scanner;

	public class ModelingDemoGender {

		public static void main(String[] args) {

			int age;
			double height,weight;
			char gender;
			
			Scanner sc=new Scanner(System.in);  //ctrl shift o
			
			System.out.println("Please enter your Gender m-Male f-female");
			gender=sc.next().charAt(0);
			
			System.out.println("Please enter your age in years");
			age=sc.nextInt();
			
			System.out.println("Please enter your height in feet");
			height=sc.nextDouble();
			
			System.out.println("Please enter your weight in kg");
			weight=sc.nextDouble();
			
			    //                     T                             ||   F
				// T     &&     T       &&        T           T
				// 'm'=='m'     21<=23      6.3>=6.1        65<=70        F
			if( (gender=='m'&& age<=23 && height>=6.1 && weight<=70) ||  (gender=='f'&& age<=19 && height>=5.6 && weight<=55))
			{
				System.out.println("Eligible for Modeling");
			}
			else
			{
				System.out.println("Not Eligible for Modeling");
			}

		}

	}
