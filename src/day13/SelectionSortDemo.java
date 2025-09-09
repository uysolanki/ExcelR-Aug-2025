package day13;

import java.util.Arrays;

public class SelectionSortDemo {

	public static void main(String[] args) {
		
		int arr[]= {7,5,8,6,2};
		int temp;
		System.out.println("Before : "+Arrays.toString(arr));
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("After : "+Arrays.toString(arr));

	}

}
