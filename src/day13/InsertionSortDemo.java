package day13;

import java.util.Arrays;

public class InsertionSortDemo {

	public static void main(String[] args) {
		int arr[]= {7,5,8,6,2};
		System.out.println("Before : "+Arrays.toString(arr));
		insertionSortAsc(arr);
		System.out.println("After : "+Arrays.toString(arr));

	}
	
	public static void insertionSortAsc(int arr[])
	{
		for(int k=1;k<arr.length;k++)
		{
			int temp = arr[k];
			int j=k-1;
			
			while(j>=0 && temp<=arr[j])
			{
				arr[j+1]=arr[j];
				j--;
			}
			
			arr[j+1]=temp;
		}
	}
	
	public static void insertionSortDesc(int arr[])
	{
		for(int k=1;k<arr.length;k++)
		{
			int temp = arr[k];
			int j=k-1;
			
			while(j>=0 && temp>=arr[j])
			{
				arr[j+1]=arr[j];
				j--;
			}
			
			arr[j+1]=temp;
		}
	}

}
