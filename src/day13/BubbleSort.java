package day13;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[]= {7,5,8,6,2};
		
		System.out.println("Before : "+Arrays.toString(arr));
		
		bubbleSort(arr);
		
		System.out.println("After : "+Arrays.toString(arr));
	}

	private static void bubbleSort(int[] arr) {
		int temp;
		for(int i=1;i<=arr.length;i++)
		{
			for(int j=0;j<arr.length-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
	}

}
