package day24;

import java.util.Scanner;

public class SumOfFirstNIntegersUsingIteration {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a nth Number");			//5
	int number=sc.nextInt();
	
	int result=sumOfNUmbers(number);
	System.out.println("Factotial of " + number + " is "+ result);
}

private static int sumOfNUmbers(int number) {
	int sum=0;
	for(int i=1;i<=number;i++)
		sum+=i;
	
	return sum;
}

}
