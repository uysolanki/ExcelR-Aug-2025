package day18;

import java.util.Scanner;

public class Prime3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		int i;
		int counter=0;
		System.out.println("Enter a Number");
		n=sc.nextInt();		//n=7
		int loopCounter=0;
		int flag=0;
		for(i=2;i<=Math.sqrt(n);i++)
		{
			loopCounter++;
			if(n%i==0)
			{
				flag=1;
				break;
			}
		}
		
		if(flag==0)
			System.out.println(n + " is Prime Number");
		else
			System.out.println(n+ " is not a Prime Number");
		
		System.out.println("Iteration Count "+loopCounter);
	}

}


//47 Iterations