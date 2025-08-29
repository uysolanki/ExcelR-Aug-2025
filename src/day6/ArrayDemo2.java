package day6;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo2 {

	public static void main(String[] args) {
		int arr[]=new int[5];
		Scanner sc=new Scanner(System.in);
		int i;
		//System.out.println("Enter 5 Numbers");
		for(i=0;i<arr.length;i++)
		{
			System.out.println("Enter a Number");//18 44 63 11 7
			arr[i]=sc.nextInt();
		}

		
		System.out.println(Arrays.toString(arr));
		int sum=0;
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]%2==1)
			sum=sum+arr[i];
	      }
		System.out.println("Sum of Odd Numbers in Array is " +sum);

	}

}
