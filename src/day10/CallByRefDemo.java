package day10;

public class CallByRefDemo {

	public static void main(String[] args) {
		int arr[]= {100,200,300};
		System.out.println("Array ARR 0 index Before : "+arr[0]);
		demo(arr);
		System.out.println("Array ARR 0 index After : "+arr[0]);
	}

	private static void demo(int brr[]) {
		System.out.println("Array BRR 0 index Before: "+brr[0]);
		brr[0]=99;
		System.out.println("Array BRR 0 index After: "+brr[0]);
	}

}
