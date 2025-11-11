package day36;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;



public class HashSetDemo {

	public static void main(String[] args) {
		Set<String> names=new HashSet();
		
		names.add("Alice");
		names.add("Ben");
		names.add("Chris");
		
		System.out.println(names);
		names.add("Chris");
		names.add(null);
		
		System.out.println(names);
		names.add(null);
		names.add(null);
		
		System.out.println(names);
		
		List<String> names1=new ArrayList(Arrays.asList("Alice","Ben","Chris","Alice","Tom"));
		
		System.out.println(names1);
		 
		Set<String> names2=new HashSet(names1);
		System.out.println(names2);
		
		
		Set<String> names3=new LinkedHashSet<String>(Arrays.asList("Tom","King","Smith","Alice","Ben","Chris","David","Elcid"));
		System.out.println(names3);
		
		Set<String> names4=new TreeSet<String>(Arrays.asList("Tom","King","Smith","Alice","Ben","Chris","David","Elcid"));
		System.out.println(names4);
		
		Set<Integer> names5=new TreeSet<Integer>(Arrays.asList(5,3,1,9,6,8,4));
		System.out.println(names5);
		
		
		Student s1=new Student(18,"Virat",78.5);
		Student s2=new Student(1,"Rahul",87.5);
		Student s3=new Student(45,"Rohit",68.5);
		
		
		Set<Student> fyStudentsRollNumbers=new TreeSet<Student>(new RnoComparator());
		 fyStudentsRollNumbers.add(s1);
		 fyStudentsRollNumbers.add(s2);
		 fyStudentsRollNumbers.add(s3);
		
		System.out.println( fyStudentsRollNumbers);
		
		
		Set<Student> fyStudentsMarklist=new TreeSet<Student>(new PerComparator());
		fyStudentsMarklist.add(s1);
		fyStudentsMarklist.add(s2);
		fyStudentsMarklist.add(s3);
		
		System.out.println( fyStudentsMarklist);
		
		
		Set<Student> fyStudentsexamSeat=new TreeSet<Student>(new NameComparator());
		fyStudentsexamSeat.add(s1);
		fyStudentsexamSeat.add(s2);
		fyStudentsexamSeat.add(s3);
		
		
		
		

	}

}
