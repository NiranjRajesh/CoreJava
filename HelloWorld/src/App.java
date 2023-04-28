import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws NumberFormatException, ParseException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter mobile 1 detail:");
		String detail1 = sc.nextLine();
		System.out.println("Enter mobile 2 detail:");
		String detail2 = sc.nextLine();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

		String[] arr = detail1.split(",");
		String[] arr1=detail2.split(",");
		Mobile mobile1=new Mobile(arr[0],arr[1],Double.valueOf(arr[2]),Double.valueOf(arr[3]),sdf.parse(arr[4]));
		
		Mobile mobile2 = new Mobile(arr1[0], arr1[1], Double.valueOf(arr1[2]), Double.valueOf(arr1[3]), sdf.parse(arr1[4]));

		System.out.println("Mobile 1:");
		System.out.println(mobile1);
		System.out.println();
		System.out.println("Mobile 2:");
		System.out.println(mobile2);
		System.out.println((mobile1.equals(mobile2))?"Mobile 1 is same as Mobile 2 ":"Mobile 1 and Mobile 2 are different");

	}

}
