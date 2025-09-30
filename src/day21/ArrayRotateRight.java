package day21;

import java.util.Arrays;

public class ArrayRotateRight {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50,60};
		System.out.println("Before Rotation "+Arrays.toString(arr));
		
		int mid=arr.length/2; //mid =3
		
		for(int i=0;i<mid;i++)				//temp 
		{									//10
			int temp=arr[arr.length-1];
			int j;
				for(j=arr.length-1;j>=1;j--)
				{
						arr[j]=arr[j-1];
				}
				
				arr[0]=temp;
		}
		
		System.out.println("After Right Rotation at Mid "+Arrays.toString(arr));
	}

}
