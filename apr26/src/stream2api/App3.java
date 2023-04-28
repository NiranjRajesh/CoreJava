package stream2api;

import java.util.ArrayList;
import java.util.List;

public class App3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> employees=new ArrayList<>();
		 employees.add(new Employee(1,"James","Charles",70292.0));
		 employees.add(new Employee(2,"Karl","Mann",9130.0));
		 employees.add(new Employee(4,"Wayne","Rooney",70000.0));
		 employees.add(new Employee(5,"Paul","Scholes",12500.0));
		 employees.add(new Employee(3,"Anthony","Elanga",25000.0));
		 
		 employees.stream().filter(x-> x.getSalary() >20000).sorted((a,b)->b.getSalary().compareTo(a.getSalary())).forEach(System.out::println);

	}

}
