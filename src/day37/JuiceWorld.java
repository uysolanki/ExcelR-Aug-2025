package day37;

import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class JuiceWorld {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of Apple Juice");
		int appleJuice=sc.nextInt();
		System.out.println("enter number of Mango Juice");
		int mangoJuice=sc.nextInt();
		System.out.println("enter number of Pineapple Juice");
		int pineAppleJuice=sc.nextInt();
		
		int time=prepareJuice(appleJuice,mangoJuice,pineAppleJuice);
		System.out.println("Minimum time taken "+time);
	}

	private static int prepareJuice(int appleJuice, int mangoJuice, int pineAppleJuice) {
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>(Collections.reverseOrder());
		pq.add(appleJuice);
		pq.add(mangoJuice);
		pq.add(pineAppleJuice);
		
		int seconds=0;
		
		Iterator<Integer> itr=pq.iterator();
		
		while(!pq.isEmpty())
		{
			int m1=0;
			int m2=0;
			
			m1=pq.remove();
			
			if(itr.hasNext())
			m2=pq.remove();
			
			if(m1>0 && m2==0)
			{
				seconds+=m1;
				break;
			}
			
			if(m1>0 && m2>0)
			{
				seconds++;
				m1--;
				m2--;
			}
			
			if(m1>0)
				pq.add(m1);
			
			if(m2>0)
				pq.add(m2);
		}
		return seconds;
	}

}
/*
5	4
4	3
4
*/
