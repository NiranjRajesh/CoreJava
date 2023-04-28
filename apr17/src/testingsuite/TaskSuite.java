package testingsuite;

public class TaskSuite {
	int digit;
	int value;
	
	public TaskSuite() {
		
	}
	public TaskSuite(int digit, int value) {
		super();
		this.digit = digit;
		this.value = value;
	}
	public int getDigit() {
		return digit;
	}
	public void setDigit(int digit) {
		this.digit = digit;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
	public int maximise() {
		
		return Math.max(value, digit);
	}
	
	public float ValueToFloat() {
		return (float) value;
	}
	
	

}
