package day37;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
	
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>(Collections.reverseOrder());
		
		pq.addAll(Arrays.asList(4,5,1,2,3));
		
		System.out.println(pq.size());		//5
		System.out.println(pq.remove());    //5
		System.out.println(pq.size());      //4
		
		System.out.println(pq.remove());    //4
		System.out.println(pq.size());      //3
		

	}

}
