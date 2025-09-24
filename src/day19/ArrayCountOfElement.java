package day19;

import java.util.Arrays;

public class ArrayCountOfElement {

	public static void main(String[] args) {
		        
		int arr[]= {10,20,20,10,50};			//10,20
		int visited[]= new int[arr.length];
		
		for(int i=0;i<arr.length;i++)
		{
			int num=arr[i];
			
			int numCounter=0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[j]==num)
					numCounter++;
			}
			
			int flag=0;
			for(int k=0;k<visited.length;k++)
			{
				if(num==visited[k])
				{
					flag=1;
					break;
				}
				 
			}
			
			if(flag==0)
			System.out.println(num + " occurs "+ numCounter + " times");
			
			visited[i]=num;
		}
		

	}

}
