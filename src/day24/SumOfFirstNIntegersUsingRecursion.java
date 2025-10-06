package day24;

import java.util.Scanner;

public class SumOfFirstNIntegersUsingRecursion {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a nth Number");			//2
	int number=sc.nextInt();
	
	int result=sumOfNUmbers(number);
	System.out.println("Factotial of " + number + " is "+ result);
}

private static int sumOfNUmbers(int number) {
	if(number==1)
		return 1;
	else
		return number+sumOfNUmbers(number-1);
}

}
