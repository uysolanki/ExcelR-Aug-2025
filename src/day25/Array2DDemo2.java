/*display max number form entire array : 
output : max number from Array is 95

  display max number form each row 
   row 1 max number is 60
   row 2 max number is 90
   row 3 max number is 95
 */
package day25;

import java.util.Scanner;

public class Array2DDemo2 {

	public static void main(String[] args) {
		int brr[][]=new int[3][5];										//10 20 30 50 60
		Scanner sc=new Scanner(System.in);								//30 40 90 80 20
		for(int i=0;i<brr.length;i++)									//50 95 12 06 10
		{																
			for(int j=0;j<brr[i].length;j++)
			{
				System.out.println("Enter a Number");
				brr[i][j]=sc.nextInt();
			}
		}
		
		
		for(int i=0;i<brr.length;i++)
		{
			for(int j=0;j<brr[i].length;j++)
			{
				System.out.print(brr[i][j]+"\t");		  
			}											
			System.out.println("");						
		}

		int max=0;
		
		for(int i=0;i<brr.length;i++)
		{
			for(int j=0;j<brr[i].length;j++)
			{
				if(brr[i][j]>max)
				{
					max=brr[i][j];
				}
			}																
		}
		
		System.out.println("Maximum Number from Array is " +max);	
		
		
		
		
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

	}

}
