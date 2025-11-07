package day35;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> a1=new ArrayList();
		
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add(50);
		
		System.out.println(a1);
		
		int sum=0;	//sum 0 ,10 ,30, 60 ,100,150
		for(int i=0;i<a1.size();i++)
		{
			sum+=a1.get(i);
		}
		
		System.out.println(sum);
		
		
		int search=40;	
//		int flag=0;
//		for(int i=0;i<a1.size();i++)
//		{
//			if(a1.get(i)==search)
//			{
//				flag=1;
//				break;
//			}
//		}
//		
//		if(flag==0)
//		System.out.println("Not Found");
//		else
//		System.out.println("Found");	
		
		    if(a1.contains(search))
			System.out.println("Found");
			else
			System.out.println("Not Found");
		    
		    
		    ArrayList<Integer> a2=new ArrayList(Arrays.asList(10,20,30,40,50,null,null,null));
			System.out.println(a2);
			
			
			ArrayList<String> a3=new ArrayList(Arrays.asList("Alice","Ben","Chris","David","Chris"));
			System.out.println(a3);
			
			
				if(a3.contains("Ben"))
				System.out.println("Found");
				else
				System.out.println("Not Found");
	}
	
	
	
	
	
	
	
	

}
