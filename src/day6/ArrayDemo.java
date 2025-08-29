package day6;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		int arr[]=new int[5];
	
		int i;
//		for(i=0;i<arr.length;i++)
//		{
//			System.out.println(arr[i]);
//		}
		
		arr[0]=10;
		arr[1]=20;
		arr[2]=31;
		arr[3]=43;
		arr[4]=50;

		
		System.out.println(Arrays.toString(arr));
		int sum=0;
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]%2==1)
			sum=sum+arr[i];
	      }
		System.out.println("Sum of Array is " +sum);

	}

}
