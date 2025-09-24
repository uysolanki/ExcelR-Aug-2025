package day19;

import java.util.Arrays;

public class StringCountElements {

	public static void main(String[] args) {
		String name="apple"  ;  
		char arr[]= name.toCharArray();			//10,20
		char visited[]= new char[arr.length];
		
		for(int i=0;i<arr.length;i++)
		{
			char num=arr[i];
			
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
