package employeetest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class App2 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		List<Employee> empList=new ArrayList<Employee>();
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdg=new SimpleDateFormat("yyyy");
		int num=sc.nextInt();
		try {
		for(int i=0;i<num;i++) {
			String id=sc.next();
			String date=sc.next();
			Date dateValue=sdf.parse(date);
			empList.add(new Employee(id,dateValue));
			
		}
		Date current=sdf.parse("01/01/2019");
		String year= sdg.format(current);
		Integer yearCurrent= Integer.parseInt(year);
	
		
		List<Employee> completedList=new ArrayList<Employee>();
		for(Employee emp:empList) {
			String empYear=sdg.format(emp.getDateOfJoin());
			Integer empConverted=Integer.parseInt(empYear);
		
			if(Math.abs(empConverted-yearCurrent)>= 5) {
				completedList.add(emp);
				
			}
		}
		if(completedList.isEmpty()) {
			System.out.println("No one is eligible");
			System.exit(0);
		}
		
		for(Employee emp:completedList) {
			System.out.println(emp.getId());
		}
		}catch(ParseException e) {
			System.out.println("Invalid date format");
			System.exit(0);
		}

	}


}
