package day3;

import java.util.Scanner;

	public class ModelingDemoNepo {

		public static void main(String[] args) {

			int age;
			double height,weight;
			int nepo;
			
			Scanner sc=new Scanner(System.in);  //ctrl shift o
			
			System.out.println("Please enter your age in years");
			age=sc.nextInt();
			
			System.out.println("Please enter your height in feet");
			height=sc.nextDouble();
			
			System.out.println("Please enter your weight in kg");
			weight=sc.nextDouble();
			
			System.out.println("Is your parent a Model? 1 - Yes , 0 - No");
			nepo=sc.nextInt();
			    //                T                    ||    F
				// T     &&     T       &&        T
				// 35<=23      4.5>=6.1        120<=70        T
			if( (age<=23 && height>=6.1 && weight<=70) ||  (nepo==1))
			{
				System.out.println("Eligible for Modeling");
			}
			else
			{
				System.out.println("Not Eligible for Modeling");
			}

		}

	}
