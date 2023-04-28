package apr11;

public class app1 {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		int a=10;
		int b=20;
		swapper(a,b);
		System.out.println(a);
		System.out.println(b);
		

	}
	public static void swapper(int a, int b) {
		int temp;
		temp=a;
		a=b;
		b=temp;
	}
	

}
