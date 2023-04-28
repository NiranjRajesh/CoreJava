import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateDemo1 {

	public static void main(String[] args)   {
   Scanner sc =new Scanner(System.in);
   String input=sc.nextLine();
   String leap="29/02/"+input;

   Date dateOfJoining=new Date();
   SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
   sdf.setLenient(false);
  
   try {
   dateOfJoining=sdf.parse(leap);
   System.out.println("Leap year");
   }catch(ParseException e){
	   System.out.println("Not leap year");
   }
   
   

   System.out.println( );
	}

}
