package com.excelr.app;

import java.util.Scanner;

public class MenuDriver {

	public static void main(String[] args) {
		System.out.println("1. Area Of Circle");
		System.out.println("2. Area Of Rectangle");
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please enter your Choice"); 
		int choice=sc.nextInt();
		
		switch(choice)
		{
		case 1 :  
		case 2 : 
		default : System.out.println("Invalid Input");
		}

	}

}
