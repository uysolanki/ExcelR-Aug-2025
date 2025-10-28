package day28;

import java.util.Arrays;
import java.util.Scanner;

public class OfficeMonitoring2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of Security Gaurds");
		int n=sc.nextInt();
		int start[]= new int[n];
		int end[]= new int[n];
		for(int i=0;i<n;i++)												//i
		{
			System.out.println("Enter Start time of Security Gaurd " + (i+1));
			start[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++)												//i
		{
			System.out.println("Enter End time of Security Gaurd " + (i+1));
			end[i]=sc.nextInt();
		}
		
		
		
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
