package test3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int lower=sc.nextInt();
		int higher=sc.nextInt();
	
		List<Integer> arr=new ArrayList<>();
		for(int i=lower;i<higher;i++) {
			if(isPrime(i)) {
				 String lengther=String.valueOf(i);
				 if(lengther.length()==1) {
					
					
						arr.add(i);
										
				
					 }
					else {
						 int k=i;
						 boolean flag=true;
						 while(k>0) {
							 int digit=k%10;
							 if(!isPrime(digit)) {
								 flag=false;
								 break;
							 }
							 
						 k=k/10;		 
						 }
						 if(flag) {
							arr.add(i);
							
						 }
					 }
			}
	


		}
		if(arr.size()==0) {
			System.out.println(-1);
		}else {
			boolean first=true;
			for(Integer value:arr) {
				if(first) {
					System.out.print(value);
					first=false;
				}else {
					System.out.print(","+value);
				}
				
				
			}
		}

	}
	public static boolean isPrime(int num) {
		if(num<2) {
			return false;
		}
		for(int i=2;i<=num/2;i++) {
			if(num%i==0)
			{
				return false;
			}
		}
		return true;
	}

}
