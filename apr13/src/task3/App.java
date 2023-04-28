package task3;

;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread thread1=new Thread(new Odd());

		Thread thread2=new Thread(new Even());
		thread1.start();
		thread2.start();

	}

}
class Odd implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<100;i+=2) {
			System.out.println("Odd: "+ i);
			
		}
		
	}
	
}
class Even implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=2;i<100;i+=2) {
			System.out.println("Even: "+i);
		}
	}
	
}