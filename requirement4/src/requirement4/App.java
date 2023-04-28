package requirement4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		List<Mobile> mobileList=new ArrayList<>();
		
		int num=sc.nextInt();
		
		for(int i=0;i<num;i++) {
			String input=sc.nextLine();
			if(input.equals("")) {
				input=sc.nextLine();
			}
			String arr[]=input.split(",");
			Date dateValue=new Date();
		
			dateValue=sdf.parse(arr[4]);
			Mobile mb=new Mobile();
			mb.setReferenceId(arr[0]);
			mb.setModelName(arr[1]);
			mb.setDisplaySize(Double.parseDouble(arr[2]));
			mb.setPrice(Double.parseDouble(arr[3]));
			mb.setLaunchedDate(dateValue);
			mobileList.add(mb);
			
		}
		System.out.println("Enter a search type:\r\n"
				+ "1.By Model Name\r\n"
				+ "2.By Display Size");
		MobileBO mbo=new MobileBO();
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			String modelName=sc.nextLine();
			if(modelName.equals("")) {
				modelName=sc.nextLine();
			}
		
			List<Mobile> modelList=mbo.findMobile(mobileList, modelName);
			if(modelList.isEmpty()) {
				System.out.println("No such mobile is present");
			}else {
				System.out.format("%-15s %-15s %-12s %-8s %s\n","Reference Id","Model Name","Display Size", "Price",    "Launched Date");
				for(Mobile mobile:modelList) {
					System.out.println(mobile);
				}
			}
			break;
		case 2:
			Double displaySize=sc.nextDouble();
			
			List<Mobile> displayList=mbo.findMobile(mobileList, displaySize);
			if(displayList.isEmpty()) {
				System.out.println("No such mobile is present");
			}else {
				System.out.format("%-15s %-15s %-12s %-8s %s\n","Reference Id","Model Name","Display Size", "Price",    "Launched Date");
				for(Mobile mobile:displayList) {
					System.out.println(mobile);
				}
			}
			break;
	   default:
		   System.out.println("Invalid choice");
			
			
			
			
		
		}

	}

}
