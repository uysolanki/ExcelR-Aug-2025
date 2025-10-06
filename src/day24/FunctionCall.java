package day24;

public class FunctionCall {

	public static void main(String[] args) 
	{
		System.out.println("I am in Main");  //1
		brazil();								//caller : main()   callee : brazil()
		System.out.println("I am in Finally Back in Main");		//5								//main() is calling brazil()
	}

	private static void brazil() {
		System.out.println("I am in Brazil");//2
		brazil();							//caller : brazil()   callee : argentina()	
		System.out.println("I am in Back in Brazil");//4										//brazil() is calling argentina()
	}

	private static void argentina() {
		System.out.println("I am in Argentina");	//3
	}	

}
