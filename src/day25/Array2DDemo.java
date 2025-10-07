package day25;

import java.util.Scanner;

public class Array2DDemo {

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
				System.out.print(brr[i][j]+"\t");		//18    25    20    
			}											//63    25    10 
			System.out.println("");						//33    12    45   
		}

		
		int sum=0;										//sum
		for(int i=0;i<brr.length;i++)
		{
			for(int j=0;j<brr[i].length;j++)
			{											//63
				sum+=brr[i][j];		   					//126	
			}											//151
							 							//161
		}												//194
														//206
		System.out.println("Sum of All Elements " + sum);//251

	}

}
