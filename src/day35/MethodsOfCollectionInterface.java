package day35;

import java.util.ArrayList;

public class MethodsOfCollectionInterface {
public static void main(String[] args) {
	
	int n=10;
	ArrayList<String> a1=new ArrayList();
	
	a1.add("Alice");
	a1.add("Ben");
	a1.add("Chris");
	System.out.println(a1.size());
	System.out.println(a1);  //[Alice,Ben,Chris]
	
	a1.add(1,"David");
	
	System.out.println(a1);  //[Alice,David,Ben,Chris]
	System.out.println(a1.size());
	
	a1.remove("Chris");
	
	System.out.println(a1);  //[Alice,David,Ben]
	System.out.println(a1.size());
	
	a1.remove(1);
	System.out.println(a1);  //[Alice,Ben]
	
	System.out.println(a1.size());
	
	System.out.println(a1.isEmpty());
	
	a1.clear(); //[]
	System.out.println(a1.isEmpty());
	
}
}
