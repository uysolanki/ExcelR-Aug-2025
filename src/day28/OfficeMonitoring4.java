package day28;

import java.util.Arrays;
import java.util.Scanner;

public class OfficeMonitoring4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=3;
		int start[]= {};
		int end[]= null;
		
		int hours = calculateUnmonitoredHours(n, start, end);
		if(hours==-1)
			System.out.println("Invalid Data");
		else
		System.out.println("Total Unmonitored hours " + hours);

	}

	private static int calculateUnmonitoredHours(int n, int[] start, int[] end) {
		if( start.length!=n || end.length!=n || start==null || end==null || start.length==0 ||end.length==0)
			return -1;
		
		boolean monitor[] = new boolean[end[end.length - 1] + 1]; // size =11;
																						// 0 10

		System.out.println(Arrays.toString(monitor)); // false x 11
		for (int i = 0; i < n; i++) // i
		{ // 0
			for (int j = start[i]; j <= end[i]; j++) {
				monitor[j] = true;
			}
		}

		System.out.println(Arrays.toString(monitor)); // false x 1 true x 6 false x1 true x 3
		int unMonitoredHours = 0;
		for (int i = 1; i < monitor.length; i++) // i
		{
			if (monitor[i] == false) {
				unMonitoredHours++;
			}
		}
		
		return unMonitoredHours;
	}
}

