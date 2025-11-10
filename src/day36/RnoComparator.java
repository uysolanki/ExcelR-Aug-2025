package day36;

import java.util.Comparator;

public class RnoComparator implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.getRno()>o2.getRno())
		return 1;
	else if(o1.getRno()<o2.getRno())
		return -1;
	else
		return 0;

	}

}
