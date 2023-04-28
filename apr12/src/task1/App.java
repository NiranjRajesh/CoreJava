package task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1=new Product(1,"Cheese",34.5,"Food");
		Product p2=new Product(5,"Laptop",44634.5,"Electronics");
		Product p3=new Product(4,"Orange",60.0,"Food");
		Product p4=new Product(2,"Saree",34.5,"Clothes");
		List<Product> productList =new ArrayList<Product>();
		productList.add(p1);
		productList.add(p2);
		productList.add(p3);
		productList.add(p4);
		Collections.sort(productList);
		for(Product p:productList) {
			System.out.println(p.toString());
		}
	

	}

}
