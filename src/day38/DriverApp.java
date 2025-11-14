package day38;

public class DriverApp {

	public static void main(String[] args) {
		Sample sample=()->System.out.println("Welcome Alice to Pune");
		
		sample.greet();
		
//		Sample2 sample2=(name)->System.out.println("Welcome, "+name);
//		sample2.greet("Alice");
		
//		Sample2 sample2=name->System.out.println("Welcome, "+name);
//		sample2.greet("Alice");
		
		Sample2 sample2=name->{System.out.println("Welcome, "+name);};
		sample2.greet("Alice");
		
		Sample3 sample3=(name,city)->System.out.println("Welcome, "+name + " to "+city);
		sample3.greet("Alice","Jaipur");
		
//		Sample4 sample4=(name,city)->{
//			System.out.println("Welcome, "+name + " to "+city);
//			return "FSD";
//		};
//		String course=sample4.greet("Alice","Jaipur");
//		System.out.println(course);
		
		
//		Sample4 sample4=(name,city)->"FSD Mango";
//		String course=sample4.greet("Alice","Jaipur");
//		System.out.println(course);

	}

}
