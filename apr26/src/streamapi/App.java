package streamapi;

import java.util.Arrays;
import java.util.List;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arr=Arrays.asList(1,82,55,90,24,65,91,59,97);
		arr.stream().sorted().filter(a-> a>80).forEach(System.out::println);

	}

}
