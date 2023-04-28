package task3;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

;

public class App {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
  Scanner sc=new Scanner(System.in);
		

		System.out.println("Enter number of Mobile");
		int number=sc.nextInt();
		List<Mobile> arrMobile=new ArrayList<Mobile>();
		
		
		for(int i=0;i<number;i++) {
			String mobileString = sc.nextLine();
			if(mobileString.equals("")) {
				mobileString = sc.nextLine();
			}
			arrMobile.add(Mobile.createMobile(mobileString));
			
		}
		
		
		System.out.println("Enter a type to sort: \r\n"
				+ "1.Sort by price \r\n"
				+ "2.Sort by launched date");
		
		int selection=3;
		
		selection=sc.nextInt();
		
		switch(selection) {
		case 1:
			Collections.sort(arrMobile); 
			 break;
		case 2:
			 Collections.sort(arrMobile,new LaunchedDateComparator());
			 break;
		
		case 3:
			System.exit(0);
	  
			
		}
		for(Mobile mb:arrMobile) {
			System.out.println(mb);
		}
		

	}

}
