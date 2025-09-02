package day8;

import java.util.Scanner;

public class PrimeFunctionScenerio1 {

	public static void main(String[] args)  //Ambani
	{
		checkPrime();   //call   
	}
	
	public static void checkPrime()   //Taj
	{
		int number;  
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		number=sc.nextInt();					//buy
		
		int counter=0;
		for(int i=1;i<=number;i++)
		{
			if(number%i==0)
				counter++;
		}
		
		if(counter==2)							//cook
			System.out.println(number + " is Prime Number ");		//serve
		else
			System.out.println(number + " is Not Prime Number ");
			
	}

}
