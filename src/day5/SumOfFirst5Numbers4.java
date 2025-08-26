package day5;

import java.util.Scanner;

public class SumOfFirst5Numbers4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choc;
		int sum=0;				//sum will play the role in chocolates in peon's pocket
		int i;
		int n;
		int target=30;
		
		System.out.println("Please enter strength of class");
		n=sc.nextInt();
		for(i=1; i<=n ; i++)   //i will play the role of rno
		{
			
			if(sum<=target)
			{
			System.out.println("Rno " + i + " how many chocolates have you bougth?");
			choc=sc.nextInt();	//15
			if(choc<10)
			{
				continue;
			}
			sum=sum+choc;
			}
			else
			{
				break;
			}
			
		}
		
		System.out.println("Total chocolates collected "+sum);
	}

}
