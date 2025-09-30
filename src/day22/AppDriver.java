package day22;

import java.util.Arrays;

public class AppDriver {
public static void main(String[] args) {
	
	int arr[]= {8,2,3,7,4,9};
	
	System.out.println("Before Sorting "+Arrays.toString(arr));
	insertionSortAsc(arr);
	System.out.println("After Sorting in ASC Order"+Arrays.toString(arr));
	
	int mid=arr.length/2;
	
	rotateLeftMid(arr,mid);
	System.out.println("After Left Rotation on Mid"+Arrays.toString(arr));
	
	int search=13;
//	int index=linearSearch(arr,search);
//	int index=binarySearch(arr,0,arr.length-1,search);
	int index=advancedBinarySearch(arr,search);
	
	
	if(index==-1)
		System.out.println("Number not found");
	else
		System.out.println("Found at Index "+ index + " Position "+ (index+1));
	
}


private static int advancedBinarySearch(int[] arr, int search) {
	  int mid=arr.length/2;				//mid = 3								
	  
	  //9>=7   true
	  if(search>=arr[0])
	   {
		  //search in red zone
		  return binarySearch(arr,0,mid-1,search);
	   }
	   else
	   {
		 //search in green zone
		  return binarySearch(arr,mid,arr.length-1,search);
	   }
}


private static void shortSearch(int[] arr, int mid, int i, int search) {
	// TODO Auto-generated method stub
	
}


private static int linearSearch(int[] arr, int search) {
	for(int i=0;i<arr.length;i++)
	{
		if(search==arr[i])
			return i;
	}
	return -1;
}


private static int binarySearch(int[] arr, int first, int last, int search) {
	
	while(first<=last)
	{
		int mid=(first+last)/2;
		if(search==arr[mid])
			return mid;
		else if(search>arr[mid])
			first=mid+1;
		else
			last=mid-1;
	}
	
	return -1;
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

public static void rotateLeftMid(int arr[],int mid)
{
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
}
}
