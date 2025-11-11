package day37;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {

	public static void main(String[] args) {
		ArrayList<Integer> a1=new ArrayList();
				   
		a1.add(10); 	
		a1.add(20);		//	<--
		a1.add(30);
		a1.add(40);
		a1.add(50);
		
		System.out.println(a1);
		
		Iterator<Integer> itr=a1.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());		//10
		}
		
		
		List<String> cities=new ArrayList(Arrays.asList("Pune","Mumbai","Delhi","Jaipur"));
		
		Iterator<String> itr1=cities.iterator();
		while(itr1.hasNext())
		{
			if(itr1.next().length()>=6)
				itr1.remove();
		}
		
		System.out.println(cities);

	}

}
