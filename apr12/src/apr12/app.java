package apr12;


import java.text.ParseException;
import java.util.Scanner;


public class app {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the name of the Mobile Brand");
		String mobileBrandName = sc.nextLine();
	    MobileBrand mobileBrand=new MobileBrand();
		mobileBrand.setName(mobileBrandName);
		
		int choice=4;
		do {
			
			System.out.println("1.Add Mobile\r\n"
					+ "\r\n"
					+ "2.Delete Mobile\r\n"
					+ "\r\n"
					+ "3.Display Mobiles\r\n"
					+ "\r\n"
					+ "4.Exit\r\n"
					+ "\r\n"
					+ "Enter your choice:");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
		
			
				String mobileString = sc.nextLine();
				if(mobileString.equals("")) {
					mobileString = sc.nextLine();
				}
				mobileBrand.addMobileToMobileBrand(Mobile.createMobile(mobileString));
	
				System.out.println("Mobile added");
				break;

			case 2:
				String mobileName = sc.nextLine();
				if(mobileName.equals("")) {
					mobileName=sc.nextLine();
				}
				Boolean status=mobileBrand.removeMobileFromMobileBrand(mobileName);
				if(status) {
					System.out.println("Mobile Succesfully deleted");
				}else {
					System.out.println("Unable to delete");
				}
				break;
			case 3:
				mobileBrand.displayMobiles();
				break;
			case 4:
				System.exit(0);
			default:
				System.out.println("Not valid Input");
			}
			
			
		}while(choice<4 && choice>0);
	}

}
