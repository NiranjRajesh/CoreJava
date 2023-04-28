package stream3api;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> arr=new ArrayList<>();
		arr.add(new Student("Gary","ECE",1257.50));
		arr.add(new Student("Roy","CSE",17200.50));
		arr.add(new Student("Rooney","ECE",7000.0));
		arr.add(new Student("Vardy","EEE",5500.50));
		arr.add(new Student("Erikson","CSE",9000.00));
		arr.add(new Student("Toni","CSE",9500.0));
		Stream<Student> result=arr.stream();
		Map<String,Long> count=result.collect(Collectors.groupingBy(Student::getDepartment,Collectors.counting()));
		
				for(Entry<String,Long> e:count.entrySet()) {
					System.out.println(e);
					
				}	
				result.collect(Collectors.groupingBy(Student::getDepartment,Collectors.minBy(Comparator.comparing(Student::getSalary))));

	}

}
