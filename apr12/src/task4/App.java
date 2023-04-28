package task4;

import java.util.HashSet;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		HashSet<String> simpleCountries= new HashSet<String>();
		int num=sc.nextInt();
		for(int i=0;i<num;i++) {
			String country=sc.nextLine();
			if(country.equals("")) {
				country=sc.nextLine();
			}
		   simpleCountries.add(country);
		}
		System.out.println(simpleCountries);
		


	}
	
	public static void addCountry(String country) {
		
		
		
	}

}
