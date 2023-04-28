package apr10;

import java.util.Scanner;

public class Chair extends Furniture {
	private int noOfLegs;
	

	public Chair() {
		super();
		
	}


	public Chair(int noOfLegs) {
		super();
		this.noOfLegs = noOfLegs;
	}


	public Chair(String name, String color,int noOfLegs) {
		super(name, color);
		
		this.noOfLegs=noOfLegs;
	}

	public int getNoOfLegs() {
		return noOfLegs;
	}

	public void setNoOfLegs(int noOfLegs) {
		this.noOfLegs = noOfLegs;
	}

	@Override
	public void acceptDetails() {
		Scanner sc2=new Scanner(System.in);
		super.acceptDetails();
		this.noOfLegs=sc2.nextInt();
		
	}

	@Override
	public void displayDetails() {
		
		super.displayDetails();
		System.out.println("No of Legs: "+noOfLegs);
	}
	
	
	
	

}
