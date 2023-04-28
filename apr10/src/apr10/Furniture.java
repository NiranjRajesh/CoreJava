package apr10;

import java.util.Scanner;

public class Furniture {
	private String name;
	private String color;
	
	public Furniture() {
		
	}
	public Furniture(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public void acceptDetails() {
		Scanner sc=new Scanner(System.in);
		this.name=sc.nextLine();
		this.color=sc.nextLine();
		
		
	}
	public void displayDetails() {
		System.out.println("Name: "+ name+"\nColor: "+color);
	}
	

}
