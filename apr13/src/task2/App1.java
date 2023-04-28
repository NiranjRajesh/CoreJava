package task2;

public class App1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Even t1=new Even();
		Odd t2=new Odd();
		t1.start();
		t2.start();

	}

}
class Even extends Thread{
	
	public void start() {
		while(true) {
			
			System.out.println("EVEN");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Odd extends Thread{
	
	public void start() {
		while(true) {
			System.out.println("ODD");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}