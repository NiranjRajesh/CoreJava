package task2;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		List<Mobile> mobileList=new ArrayList<>();
		for(int i=0;i<num;i++) {
			String details=sc.nextLine();
			if(details.equals("")) {
				details=sc.nextLine();
				
			}
		mobileList.add(Mobile.createMobile(details));
		}
		Map<Date,Integer> map=Mobile.yearWiseCount(mobileList);
		System.out.format("%-15s %s\n","Year","No. of Mobiles");
	    

	}

}
