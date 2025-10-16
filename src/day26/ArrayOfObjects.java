package day26;

import java.io.IOException;

public class ArrayOfObjects {

	public static void main(String[] args)throws IOException
	{
		Product p[]=new Product[3];    //new array 
		
		for(int i=0;i<p.length;i++)
		{
			p[i]=new Product();
			p[i].acceptProduct();
		}
		
		for(int i=0;i<p.length;i++)
		{
			p[i].displayProduct();
		}
		
		int searchId=298;
		boolean result=false;
		for(int i=0;i<p.length;i++)				//i   result
		{										//0   false
			result=p[i].search(searchId);		//1	  
			if(result==true)					//2
				break;
			
		}
		
		if(result==true)
			System.out.println("Found");
		else
			System.out.println("Not Found");

	}

}
