package day30;

public class DriverApp {

	public static void main(String[] args) {
		Student s1=new Student();
		s1.acceptStudent();
		Student s2=new Student();
		Student s3=new Student();
		s1.displayStudent();
		s2.displayStudent();
		s3.displayStudent();
		
		Student s4=new Student(18,"Anushka",78.5);
		s4.displayStudent();

	}

}
