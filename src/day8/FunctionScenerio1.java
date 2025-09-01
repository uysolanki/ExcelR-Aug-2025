package day8;

import java.util.Scanner;

public class FunctionScenerio1 {

	public static void main(String[] args)  //Ambani
	{
		areaOfRectangle();   //call   
	}
	
	public static void areaOfRectangle()   //Taj
	{
		int length;  //mutter
		int breadth; //paneer
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Length of Rectangle");
		length=sc.nextInt();
		System.out.println("Enter Breadth of Rectangle");
		breadth=sc.nextInt();									//value accept --main / buy
		
		int result=length*breadth;								//formula      --main / cook
		
		System.out.println("Area of Rectangle is"+result);      //display result --main / serve
	}

}
