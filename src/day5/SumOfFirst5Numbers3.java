package day5;

import java.util.Scanner;

public class SumOfFirst5Numbers3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choc;
		int sum=0;				//sum will play the role in chocolates in peon's pocket
		int i;
		int n;
	
		
		System.out.println("Please enter strength of class");
		n=sc.nextInt();
		for(i=1; i<=n ; i++)   //i will play the role of rno
		{
			System.out.println("Rno " + i + " how many chocolates have you bougth?");
			choc=sc.nextInt();	//15
			sum=sum+choc;
		}
		
		System.out.println("Total chocolates collected "+sum);
	}

}
