package task2;

import java.io.Serializable;

public class Employee implements Serializable {
	private Integer id;
	private String name;
	private String location;
	
	public Employee() {
		
	}
	
	public Employee(Integer id, String name, String location) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
	}
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
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", location=" + location + "]";
	}
	
	

}
