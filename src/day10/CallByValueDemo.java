package day10;

public class CallByValueDemo {

	public static void main(String[] args) {
		int a=100;
		System.out.println("A Before : "+a);
		demo(a);
		System.out.println("A After: "+a);
	}

	private static void demo(int z) {
		System.out.println("Z Before: "+z);
		z=99;
		System.out.println("Z After: "+z);
	}

}
