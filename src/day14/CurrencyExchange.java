package day14;

import java.util.Arrays;
import java.util.Scanner;

import day13.InsertionSortDemo;

public class CurrencyExchange {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Number of currency denominations in your country");
	int size=sc.nextInt();
	
	int currency[]=new int[size];
	int notes[]=new int[size];
	
	System.out.println("please enter the "+ size + " currency denomnations");
	
	for(int i=0;i<size;i++)
	{
		currency[i]=sc.nextInt();
	}
	System.out.println("Before :"+Arrays.toString(currency));
	InsertionSortDemo.insertionSortDesc(currency);
	System.out.println("After :"+Arrays.toString(currency));
	System.out.println("Please enter the amount to exchange");
	int exchangeAmount=sc.nextInt();
	
	for(int i=0;i<size;i++)
	{
		if(exchangeAmount>0)
		{
			notes[i]=exchangeAmount/currency[i];
			exchangeAmount=exchangeAmount%currency[i];
		}
	}
	int totalNotes=0;
	for(int i=0;i<size;i++)
	{
		if(notes[i]!=0)
		System.out.println(currency[i] + " x " + notes[i]);
		totalNotes+=notes[i];
	}
	
	
}
}
