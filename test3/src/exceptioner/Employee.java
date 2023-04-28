package exceptioner;

import java.util.Date;

public class Employee {
	private Integer id;
	private String name;
	private Date dob;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) throws InvalidDateOfBirthException {
		Date today=new Date();
		if(dob.after(today)) {
			
			throw new InvalidDateOfBirthException("Invalid Date");
			
		}else {
			
			this.dob = dob;
		}
		
	}
	
	

}
