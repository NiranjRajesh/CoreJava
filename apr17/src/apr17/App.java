package apr17;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first input");
		int x=sc.nextInt();
		System.out.println("Enter the second input");
		int y=sc.nextInt();
		
		try {
		calculatePercentage(x,y);
		}catch(DenominatorException de) {
			System.out.print(de.getMessage());
		}
		
		

	}
	
	public static void calculatePercentage(int x,int y) throws DenominatorException {
		if(x<y || y==8) {
			throw new DenominatorException("invalid denominator");
		}
		System.out.println(x/y);
	}

}
