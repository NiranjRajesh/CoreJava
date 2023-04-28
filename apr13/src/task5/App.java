package task5;

public class App {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread1 t1=new Thread1();
		Thread2 t2=new Thread2();
		Thread3 t3=new Thread3();
		Thread4 t4=new Thread4();
		Thread5 t5=new Thread5();
		
		t1.start();
		t2.start();
		t2.join();
		t3.start();
		t4.start();
		t5.start();
	
		
		

	}

}


class Thread1 extends Thread{
	
	
	public void run(){
		for(int i=0;i<10;i++) {
			System.out.println("In thread 1");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
class Thread2 extends Thread{
	
	
	public void run(){
		for(int i=0;i<10;i++) {
			System.out.println("In thread 2");
		}
		
	}
}
class Thread3 extends Thread{
	
	
	public void run(){
		for(int i=0;i<10;i++) {
			System.out.println("In thread 3");
		}
		
	}
}
class Thread4 extends Thread{
	
	
	public void run(){
		for(int i=0;i<10;i++) {
			System.out.println("In thread 4");
		}
		
	}
}
class Thread5 extends Thread{
	
	
	public void run(){
		for(int i=0;i<10;i++) {
			System.out.println("In thread 5");
		}
		
	}
}