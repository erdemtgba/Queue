package lab10;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student st0, Student st1) {
		if(st0.getCgpa()< st1.getCgpa())
			return 1;
		else if(st0.getCgpa()> st1.getCgpa())
			return -1;
		
		return 0;
	}
	
	
}
