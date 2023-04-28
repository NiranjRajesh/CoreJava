package agreggator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class App1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of items: ");
		List<Item> itemList=new ArrayList<>();
		int num=sc.nextInt();
		for(int i=0;i<num;i++) {
			String input=sc.nextLine();
			if(input.equals("")) {
				input=sc.nextLine();
			}
			itemList.add(Item.createItem(input));
	
			
		}
		System.out.println("Enter a type to sort: \r\n"
				+ "1.Sort by Name \r\n"
				+ "2.Sort by Price ");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			Collections.sort(itemList);
			System.out.format("%-20s %-10s %-12s\n","Name","Price","Type");
			for(Item item:itemList) {
				System.out.println(item);
			}
			break;
		case 2:
			Collections.sort(itemList,new PriceComparator());
			System.out.format("%-20s %-10s %-12s\n","Name","Price","Type");
			for(Item item:itemList) {
				System.out.println(item);
			}
			break;
		default:
			System.out.println("Invalid Choice");
			
			
		}
	}

}
