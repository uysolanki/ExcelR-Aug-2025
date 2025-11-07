package day35;

public class AutoboxingDemo {

	public static void main(String[] args) {
		byte b=100;   //primitive
		
		Byte b1=new Byte(b);
		
		System.out.println("Primitive " +b);
		System.out.println("Non Primitive " +b1);
		
		byte b2=b1.byteValue();
	}

}
