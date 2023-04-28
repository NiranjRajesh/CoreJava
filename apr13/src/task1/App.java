package task1;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		List<College> collegeList=new ArrayList<>();
		for(int i=0;i<num;i++) {
			String details=sc.nextLine();
			if(details.equals("")) {
				details=sc.nextLine();
				
			}
			collegeList.add(College.createCollege(details));
		}
		Map<String,Integer> map=College.calculateLocationCount(collegeList);
		

	}

}
