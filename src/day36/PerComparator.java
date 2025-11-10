package day36;

import java.util.Comparator;

public class PerComparator implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.getPer()>o2.getPer())
			return -1;
		else if(o1.getPer()<o2.getPer())
			return 1;
		else
			return 0;
	}

}
