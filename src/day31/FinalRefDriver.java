package day31;

public class FinalRefDriver {

	public static void main(String[] args) {
		final Student s1=new Student(18,"Virat",78.5);
		s1.displayStudent();
		s1.setRno(19);
		
		s1.displayStudent();
	
	}
}
