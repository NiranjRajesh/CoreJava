package employeetest;

import java.util.Date;

public class Employee {
	private String id;
	private Date dateOfJoin;
	
	public Employee() {
		
	}
	public Employee(String id, Date dateOfJoin) {
		super();
		this.id = id;
		this.dateOfJoin = dateOfJoin;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Date getDateOfJoin() {
		return dateOfJoin;
	}
	public void setDateOfJoin(Date dateOfJoin) {
		this.dateOfJoin = dateOfJoin;
	}
	

}
