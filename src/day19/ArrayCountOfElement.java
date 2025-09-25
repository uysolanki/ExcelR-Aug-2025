package day19;

import java.util.Arrays;

public class ArrayCountOfElement {

	public static void main(String[] args) {

		int arr[] = { 10, 20, 20, 10, 50 }; 
		int displayed[] = new int[arr.length]; // 10 20 0 0 0

		long start=System.currentTimeMillis();
		for (int i = 0; i < arr.length; i++) {							//i		num	 arr[i]		numcounter
			int num = arr[i];											//0		20	 20			2

			int numCounter = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] == num)
					numCounter++;
			}

			int flag = 0;
			for (int k = 0; k < displayed.length; k++) {
				if (num == displayed[k]) {
					flag = 1;
					break;
				}

			}

			if (flag == 0)
				System.out.println(num + " occurs " + numCounter + " times");

			displayed[i] = num;
		}
		
		long end=System.currentTimeMillis();
		System.out.println("Time taken " + (end-start));

	}

}
