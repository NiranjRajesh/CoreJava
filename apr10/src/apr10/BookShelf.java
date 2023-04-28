package apr10;

import java.util.Scanner;

public class BookShelf extends Furniture{
	private int noOfShelves;
	
	
	public BookShelf() {
		
	}
	
	

	public BookShelf(int noOfShelves) {
		super();
		this.noOfShelves = noOfShelves;
	}

	public int getNoOfShelves() {
		return noOfShelves;
	}

	public void setNoOfShelves(int noOfShelves) {
		this.noOfShelves = noOfShelves;
	}



	@Override
	public void acceptDetails() {
		// TODO Auto-generated method stub
		super.acceptDetails();
		Scanner sc= new Scanner(System.in);
		this.noOfShelves=sc.nextInt();
	}



	@Override
	public void displayDetails() {
		// TODO Auto-generated method stub
		super.displayDetails();
		System.out.println("No of Shelves: "+ this.noOfShelves);
	}
	
}
