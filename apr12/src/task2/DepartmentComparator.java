package task2;

import java.util.Comparator;

public class DepartmentComparator implements Comparator<College> {

	@Override
	public int compare(College o1, College o2) {
		// TODO Auto-generated method stub
		return o1.getNumberOfDept().compareTo(o2.getNumberOfDept());
	}

}
