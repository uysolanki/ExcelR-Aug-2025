package day8;

import java.util.Scanner;

public class PrimeFunctionScenerio2 {
	static int number;
	
	public static void main(String[] args)  //Ambani
	{
		int ans=checkPrime();   //call   
		if(ans==2)
			System.out.println(number + " is Prime Number ");		//serve
			else
			System.out.println(number + " is Not Prime Number ");
	}
	
	public static int checkPrime()   //Taj
	{
		  
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		number=sc.nextInt();					//buy
		
		int counter=0;
		for(int i=1;i<=number;i++)
		{
			if(number%i==0)
				counter++;
		}
		
		return counter;
			
	}

}
