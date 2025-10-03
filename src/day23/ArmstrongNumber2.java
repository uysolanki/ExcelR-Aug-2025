package day23;

import java.util.Scanner;

public class ArmstrongNumber2 {
public static void main(String[] args) {
	
	for(int i=1;i<=1000;i++)
	{
		if(checkArmstrong(i))
			System.out.println(i);
	}

}												

public static boolean checkArmstrong(int number)
{
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
	return true;
	else
	return false;
}
}


//task 1 :  accept a number and check whether it is armstrong or not
//task 2 :  Display all armstrong numbers between 1 to 1000
//task 2 :  store 5 numbers in an Array and display only the Armtrong numbers 
