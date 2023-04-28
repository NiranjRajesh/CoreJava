package streamapi4;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class App2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		String [] arr=input.toLowerCase().split("");
		List<String> arrList=Arrays.asList(arr);
		Map<String,Long>result=arrList.stream().collect(Collectors.groupingBy(x->x,Collectors.counting()));
		for(Entry<String,Long> e:result.entrySet()) {
			System.out.println(e);
			
		}	
	

	}

}
