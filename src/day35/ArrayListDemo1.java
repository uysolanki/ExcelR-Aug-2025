package day35;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		
		Student s1=new Student(18,"Virat",78.5);
		Student s2=new Student(1,"Rahul",87.5);
		Student s3=new Student(45,"Rohit",68.5);
		
		List<Student> fyStudents=new ArrayList();
		fyStudents.add(s1);
		fyStudents.add(s2);
		fyStudents.add(s3);
		
		System.out.println(fyStudents.get(0).getSname());
		System.out.println(fyStudents.get(1).getPer());
		
		double totalPer=0.0;
		for(int i=0;i<fyStudents.size();i++)
		{
			totalPer+=fyStudents.get(i).getPer();
		}
		
		double avgPer=totalPer/fyStudents.size();
		System.out.println("Sum of Percentage is " +totalPer);
		System.out.println(String.format("Avg of Percentage is  %.2f",avgPer));	
	}
}
