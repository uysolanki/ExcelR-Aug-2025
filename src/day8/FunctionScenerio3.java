package day8;

import java.util.Scanner;

public class FunctionScenerio3 {

	public static void main(String[] args)  //Ambani
	{
		int length;  //mutter
		int breadth; //paneer
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Length of Rectangle");
		length=sc.nextInt();
		System.out.println("Enter Breadth of Rectangle");
		breadth=sc.nextInt();									//value accept --main / buy
		
		int ans=areaOfRectangle(length,breadth);   //call 
		System.out.println("Area of Rectangle is"+ans);      //display result --main / serve
	}
	
	public static int areaOfRectangle(int length,int breadth)   //Taj
	{
		
		int result=length*breadth;								//formula      --main / cook
		
		return result;
	}

}
