package day37;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		
		
		
		List<String> cities=new ArrayList(Arrays.asList("Pune","Mumbai","Delhi","Jaipur"));
		
		ListIterator<String> litr=cities.listIterator();
		while(litr.hasNext())
		{
			if(litr.next().length()>=6)
				litr.remove();
		}
		
		System.out.println(cities);
		
		while(litr.hasPrevious())
		{
			System.out.println(litr.previous());
		}

	}

}
