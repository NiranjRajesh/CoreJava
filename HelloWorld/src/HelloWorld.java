import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		String[] arr=input.split(",");
		Date startingDate=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		startingDate=sdf.parse(arr[6]);
		
		College college1=new College(arr[0],arr[1],arr[2],arr[3],Integer.parseInt(arr[4]),arr[5],startingDate);
	System.out.println(college1);

	}

	public static boolean isPrime(int num) {
		if(num<2) {
			return false;
		}
		
		for(int i=2;i<num/2;i++) {
			if(num%i==0) {
				return false;
			}
		}
		
		return true;

	}

}
