/*display max number form entire array : 
output : max number from Array is 95

  display max number form each row 
   row 1 max number is 60
   row 2 max number is 90
   row 3 max number is 95
 */
package day25;

import java.util.Scanner;

public class Array2DDemoAscDesc {

	public static void main(String[] args) {
		int brr[][]=new int[3][5];										//10 70 30 50 60		10 30 50 60 70
		Scanner sc=new Scanner(System.in);								//30 40 90 80 20        90 80 40 30 20
		for(int i=0;i<brr.length;i++)									//50 95 12 06 10        06 10 12 50 95
		{																
			for(int j=0;j<brr[i].length;j++)
			{
				System.out.println("Enter a Number");
				brr[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Before Sorting");
		for(int i=0;i<brr.length;i++)
		{
			for(int j=0;j<brr[i].length;j++)
			{
				System.out.print(brr[i][j]+"\t");		  
			}											
			System.out.println("");						
		}

		
		
		for(int i=0;i<brr.length;i++)
		{
			if(i%2==0)
				insertionSortAsc(brr[i]);
			else
				insertionSortDesc(brr[i]);
				
		}
		
		
		for(int i=0;i<brr.length;i++)
		{
			int maxRow=0;
			for(int j=0;j<brr[i].length;j++)
			{
				if(brr[i][j]>maxRow)
				{
					maxRow=brr[i][j];
				}
			}
			System.out.println("row " + (i+1) + " max number is " +maxRow);
		}
		
		System.out.println("After Sorting");
		for(int i=0;i<brr.length;i++)
		{
			for(int j=0;j<brr[i].length;j++)
			{
				System.out.print(brr[i][j]+"\t");		  
			}											
			System.out.println("");						
		}

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
