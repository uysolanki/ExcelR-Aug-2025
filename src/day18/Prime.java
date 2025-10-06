package day18;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		int i;
		int counter=0;
		System.out.println("Enter a Number");
		n=sc.nextInt();		//n=7
		int loopCounter=0;
		for(i=1;i<=n;i++)
		{
			loopCounter++;
			if(n%i==0)
			{
				counter++;
			}
		}
		
//		if(counter==2)
//			System.out.println(n + " is Prime Number");
//		else
//			System.out.println(n+ " is not a Prime Number");
//		
		
		System.out.println(counter==2 ? n + " is Prime Number" :  n + " is NOT Prime Number");
	
		
		System.out.println("Iteration Count "+loopCounter);
	}

}

//97 Iterations
