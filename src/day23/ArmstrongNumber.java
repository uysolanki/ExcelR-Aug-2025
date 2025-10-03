package day23;

import java.util.Scanner;

public class ArmstrongNumber {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter a Number");
	int number=sc.nextInt();					//number                          rem			sum		bu
	int bu=number;
	int rem;									//153			is 153>0 True     3				0		153
	int sum=0;									//15			is 15>0 True	  5 			27
	while(number>0)								//1				is 1>0 True		  1				152
	{											//0												153
		rem=number%10;
		sum+=rem*rem*rem;
		number=number/10;
	}

	if(sum==bu)
	System.out.println("Armstrong");
	else
	System.out.println("Not Armstrong");

}												


}
