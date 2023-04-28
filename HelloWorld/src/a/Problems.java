package a;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Problems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ticTac();
	}

	public static void problem1() {
		Scanner sc = new Scanner(System.in);
		double petrolPrice = sc.nextDouble();
		double kilometers = sc.nextDouble();
		int amount = sc.nextInt();
		double result = (petrolPrice * kilometers) / amount;
		String roundedResult = String.format("%.2f", result);
		System.out.println(roundedResult);
	}

	public static void era() {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		int century = year / 100;
		if (year % 100 != 0) {
			century++;
		}
		String result = "Modern Period";

		if (century < 0) {
			result = "Invalid";
		} else if (century >= 0 && century <= 2) {
			result = "Prehistorical period";

		} else if (century >= 3 && century <= 6) {
			result = "Vedic Period";
		} else if (century >= 7 && century <= 13) {
			result = "Second Urbanisation";

		} else if (century >= 14 && century <= 18) {
			result = "Early Modern Period";
		}

		System.out.println(century);
		System.out.println(result);

	}

	public static void lastChar() {
		Scanner s = new Scanner(System.in);

		System.out.println("input length:");

		int N = s.nextInt();

		s.nextLine();

		System.out.println("input");

		String input = s.nextLine();

		input = input.replaceAll("\\s", "");

		System.out.println(input);

		char arr1[] = new char[N];

		for (int i = 0; i < N; i++) {

			arr1[i] = input.charAt(i);

			System.out.println(arr1[i]);

		}

		System.out.println("number of occurance:");

		int n = s.nextInt();
	
		

		int count = 1;

		char result = ' ';

		for (int i = 0; i < N; i++) {

			for (int j = i; j < N; j++) {
				

				if (arr1[i] == arr1[j]) {
					count++;
					
					if (count == n) {

						result = arr1[i];
			
						break;

					}

				}

			
			} 
			count=1;

		}
		
		if(result==' ') {
			System.out.println(-1);
		}else {
		System.out.println(result);
		}

	}
	
	public static void maskedNumber() {
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
	
		int divider=sc.nextInt();
		String result="";
		boolean flag=false;
		
		for(int i=0;i<=9;i++) {
			
			char j=Character.forDigit(i, 10);
			String converterValue=input.replace('X',j );
			int converted=Integer.parseInt(converterValue);
		
			if(converted%divider==0) {
				if(flag) {
				result+=",";
				}
				result+=String.valueOf(converted);
				flag=true;
			}
		}
		if(result=="") {
			System.out.println(-1);
		}else {
			System.out.println(result);
		}
		
	}
	
	public static void ticTac() {
		
		char[][] ar=new char[3][3];

		 Scanner sc=new Scanner(System.in);

		 for(int i=0;i<3;i++)

		 {

		 for(int j=0;j<3;j++)

		 {

		 ar[i][j]=sc.next().charAt(0);

		 }

		 

		 }

		 System.out.println(Arrays.deepToString(ar));

		 System.out.println(diagonal(ar));

		 System.out.println(".........................................................");

		 System.out.println(opposite(ar));

		 

		 

		

		 
		
		
		
	}

public static int diagonal(char arr[][])

{

int count=0;

if(arr[0][0]==arr[1][1]&&arr[0][0]==arr[2][2])

{

count++;

if(arr[0][0]=='O')

{System.out.println("roshan");}

else

{System.out.println("meyyapan");}



}

if(arr[0][2]==arr[1][1]&&arr[0][2]==arr[2][0])

{

//System.out.println(arr[0][2]);

count++;

if(arr[0][2]=='O')

{System.out.println("roshan");}

else

{System.out.println("meyyapan");}

}

return count;





}
public static int opposite(char arr[][])

{

int count=0;

for(int i=0;i<3;i++)

{

if(arr[i][0]==arr[i][1]&&arr[i][0]==arr[i][2])

{

//System.out.println(arr[0][0]);

count++;

if(arr[i][0]=='O')

{System.out.println("roshan");}

else

{System.out.println("meyyapan");}

}

}

for(int j=0;j<3;j++)

{

if(arr[0][j]==arr[1][j]&&arr[0][j]==arr[2][j])

{



count++;

if(arr[0][j]=='O')

{System.out.println("roshan");}

else

{System.out.println("meyyapan");}

}

}



return count;

}

}
