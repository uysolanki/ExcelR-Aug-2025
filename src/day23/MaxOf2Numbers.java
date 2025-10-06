package day23;

public class MaxOf2Numbers {

	public static void main(String[] args) {
		int num1=100;
		int num2=200;
		int max;
		
//		max=getMaxOf2(num1,num2);
//		System.out.println(max);
		
		max =getMaxOf2(num1,num2);
		System.out.println(max);

	}
	
	public static int getMaxOf2(int num1,int num2)
	{
		 return num1>=num2 ? num1:num2;
	}

}
