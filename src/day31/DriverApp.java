package day31;

public class DriverApp {

	public static void main(String[] args) {
		Abhishek a1=new Abhishek();  //C c = new C
		a1.home();  //Jalsa
		a1.car();   //Merc
	
		System.out.println(a1.qualification);		

		Shape shape=new Shape();
		System.out.println("Area of Circle is "+ shape.area(10));	//area of Circle
		System.out.println("Area of Rectangle is "+ shape.area(10,20));	//area of Rectangle
		
		
		Amitabh a2=new Amitabh();    // P p =new P()
		a2.car();		//BMW
		a2.home();      //Jalsa
		
		System.out.println(a2.qualification);
		
		Amitabh a3=new Abhishek();   //P p = new C()   ---> Upcasting
		a3.car();		//Merc
		a3.home();      //Jalsa
		
		System.out.println(a3.qualification);
		
	}

}
