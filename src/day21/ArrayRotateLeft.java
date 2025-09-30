package day21;

import java.util.Arrays;

public class ArrayRotateLeft {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50,60};
		System.out.println("Before Rotation "+Arrays.toString(arr));
		
		int mid=arr.length/2; //mid =3
		
		for(int i=0;i<mid;i++)				//temp 
		{									//10
			int temp=arr[0];
			int j;
				for(j=1;j<arr.length;j++)
				{
						arr[j-1]=arr[j];
				}
				
				arr[j-1]=temp;
		}
		
		System.out.println("After Left  Rotation at Mid "+Arrays.toString(arr));
	}

}
