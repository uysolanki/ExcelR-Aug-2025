package day28;

import java.util.Arrays;
import java.util.Scanner;

public class OfficeMonitoring {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=3;
		int start[]= {1,2,9};
		int end[]= {5,6,10};
		
		boolean monitor[]=new boolean[end[end.length-1]+1];  //size =11;
															// 0      10

		System.out.println(Arrays.toString(monitor));	//false x 11
		for(int i=0;i<n;i++)												//i
		{																	//0
			for(int j=start[i]; j<=end[i];j++)
			{
				monitor[j]=true;
			}
		}
		
		System.out.println(Arrays.toString(monitor));	//false x 1   true x 6 false x1 true x 3
		int unMonitoredHours=0;
		for(int i=1;i<monitor.length;i++)												//i
		{
			if(monitor[i]==false)
			{
				unMonitoredHours++;
			}
		}
		
		System.out.println("Total Unmonitored hours "+ unMonitoredHours);
	}
	
	

}
