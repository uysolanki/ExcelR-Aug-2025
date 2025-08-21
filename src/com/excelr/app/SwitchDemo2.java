package com.excelr.app;

import java.util.Scanner;

public class SwitchDemo2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int day;
		
		System.out.println("Please enter Number between 1 to 7"); //80
		day=sc.nextInt();
		
		switch(day)
		{
		
		case 2 : 
		case 3 : 
		case 4 : 
		case 5 : 
		case 6 : System.out.println("Weekday"); break;
		
		case 1 : 
		case 7 : System.out.println("Weekend"); break;
		default : System.out.println("Invalid Input"); break;
		}

	}

}
