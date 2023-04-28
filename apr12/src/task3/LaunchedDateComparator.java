package task3;

import java.util.Comparator;

public class LaunchedDateComparator implements Comparator<Mobile> {

	@Override
	public int compare(Mobile o1, Mobile o2) {
		// TODO Auto-generated method stub
		return o1.getLaunchedDate().compareTo(o2.getLaunchedDate());
	}

}
