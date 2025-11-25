package day33;

public class CatchBlockThrowsException {
	public static void main(String[] args) {
		methodB();
	}

		public static void methodB() {
			try {
				methodA();
			} catch (Exception e) {
				System.out.println("methodB: Caught exception: " + e.getLocalizedMessage());
			}
		}
		
	public static void methodA() throws Exception {
		try {
			int x = 10 / 0; 
		} catch (ArithmeticException e) {
			System.out.println("methodA: Caught ArithmeticException");
			throw new Exception("Exception thrown from methodA catch block");
		}
	}
}
