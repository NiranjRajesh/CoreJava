package testing;

public class TaskException {
	int no1;
	int no2;
	
	public TaskException() {
		
	}
	public TaskException(int no1, int no2) {
		super();
		this.no1 = no1;
		this.no2 = no2;
	}
	public int getNo1() {
		return no1;
	}
	public void setNo1(int no1) {
		this.no1 = no1;
	}
	public int getNo2() {
		return no2;
	}
	public void setNo2(int no2) {
		this.no2 = no2;
	}
	
	public int add() {
	return	this.no1+this.no2;
	}
	

}
