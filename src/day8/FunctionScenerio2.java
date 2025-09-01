package day8;

import java.util.Scanner;

public class FunctionScenerio2 {

	public static void main(String[] args)  //Ambani
	{
		int ans=areaOfRectangle();   //call 
		System.out.println("Area of Rectangle is"+ans);      //display result --main / serve
	}
	
	public static int areaOfRectangle()   //Taj
	{
		int length;  //mutter
		int breadth; //paneer
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Length of Rectangle");
		length=sc.nextInt();
		System.out.println("Enter Breadth of Rectangle");
		breadth=sc.nextInt();									//value accept --main / buy
		
		int result=length*breadth;								//formula      --main / cook
		
		return result;
	}

}
