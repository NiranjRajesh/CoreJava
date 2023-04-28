package task2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App1 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("employeelist.dat"));
		Scanner sc=new Scanner(System.in);
		List<Employee> employeeList=new ArrayList<>();
		int num=sc.nextInt();
		for(int i=0;i<num;i++) {
			String input=sc.nextLine();
			if(input.equals("")) {
				input=sc.nextLine();
				
			}
			String arr[]=input.split(",");
			Employee emp=new Employee(Integer.parseInt(arr[0]),arr[1],arr[2]);
			employeeList.add(emp);
			
		}
		oos.writeObject(employeeList);
		oos.flush();
		oos.close();
		
		
		
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("employeelist.dat"));
		List<Employee> readList=(List<Employee>) ois.readObject();
		for(Employee emp:readList) {
			System.out.print(emp);
		}
		
	
	}
	

}
