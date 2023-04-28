package exceptioner;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class App2 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Date checker =new Date();
		SimpleDateFormat sdg=new SimpleDateFormat("dd-MM-yyyy");
		Date date =sdg.parse("22-04-2023");
		Employee emp1=new Employee();
		try {
			emp1.setDob(date);
		} catch (InvalidDateOfBirthException e) {
			// TODO Auto-generated catch block
			System.out.print(e.getMessage());
		}
	
	}

}
