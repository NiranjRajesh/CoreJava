package task2;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class app {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the name of University");
		String uniName = sc.nextLine();
		University uni = new University();
		uni.setName(uniName);
		int choice=4;
		do {
			System.out.println("1.Add College\n2.Delete College\n3.Display Colleges\n4.Exit\nEnter your choice:");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
		
			
				String collegeString = sc.nextLine();
				if(collegeString.equals("")) {
					collegeString = sc.nextLine();
				}
				
				uni.addCollegeToUniversity(College.createCollege(collegeString));
				System.out.println("College added");
				break;

			case 2:
				String collegeName = sc.nextLine();
				if(collegeName.equals("")) {
					collegeName=sc.nextLine();
				}
				Boolean status=uni.removeCollege(collegeName);
				if(status) {
					System.out.println("Succesfully deleted");
				}else {
					System.out.println("Unable to delete");
				}
				break;
			case 3:
				uni.displayColleges();
				break;
			case 4:
				System.exit(0);
			default:
				System.out.println("Not valid Input");
			}
		} while (choice<4 && choice >0);

	}

}
