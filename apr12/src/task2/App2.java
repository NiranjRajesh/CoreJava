package task2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class App2 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		

		System.out.println("Enter number of College");
		int number=sc.nextInt();
		List<College> arrCollege=new ArrayList<College>();
		
	
		for(int i=0;i<number;i++) {
			String collegeString = sc.nextLine();
			if(collegeString.equals("")) {
				collegeString = sc.nextLine();
			}
			arrCollege.add(College.createCollege(collegeString));
			
		}
		int selection=4;
		
		do {
			System.out.println("Enter a type to sort:\r\n"
					+ "\r\n"
					+ "1.Sort by name\r\n"
					+ "\r\n"
					+ "2.Sort by number of departments\r\n"
					+ "\r\n"
					+ "3.Sort by starting date");
			selection=sc.nextInt();
			
			switch(selection) {
			case 1:
				Collections.sort(arrCollege);
				for(College clg:arrCollege) {
					System.out.println(clg);
				}
				
				 
				 break;
			case 2:
				 Collections.sort(arrCollege,new DepartmentComparator());
					for(College clg:arrCollege) {
						System.out.println(clg);
					}
				 break;
			case 3:
				 Collections.sort(arrCollege,new StartingDateComparator());
					for(College clg:arrCollege) {
						System.out.println(clg);
					}
				 break;
			case 4:
				System.exit(0);
		    default:
		    	System.out.println("Invalid");
				
			}
			
		}while(selection<4);

	}
	public static void displayColleges(List<College> collegeList) {
		if(collegeList.isEmpty()) {
			System.out.println("No colleges to show");
		}else {
		
		    SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		    
			System.out.format("%-15s%-20s%-15s%-15s%-15s%-15s%-15s\n", "Name","Website","Mobile","Founder","Number of Dept","Location","Starting Date");
			for(College clg:collegeList) {
				
				System.out.format("%-15s%-20s%-15s%-15s%-15d%-15s%-15s\n",clg.getName(),clg.getWebsite(),clg.getMobile(),clg.getFounder(),clg.getNumberOfDept(),clg.getLocation(),sdf.format( clg.getStartingDate()));
			}
		}
	}

}
