package task2;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class University {
	private String name;
	private List<College> collegeList;
	
	public University() {
		collegeList=new ArrayList<College>();
		
	}
	public University(String name, List<College> collegeList) {
		this();
		this.name = name;
		this.collegeList = collegeList;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<College> getCollegeList() {
		return collegeList;
	}
	public void setCollegeList(List<College> collegeList) {
		this.collegeList = collegeList;
	}
	
	public void addCollegeToUniversity(College college) {
		this.collegeList.add(college);
	}
	
	public Boolean removeCollege(String name) {
		College c=null;
		
		for(College clg:this.collegeList) {
			if(clg.getName().equals(name)) {
				c=clg;
				break;
			}
		}
		return this.collegeList.remove(c);
	}
	public void displayColleges() {
		if(this.collegeList.isEmpty()) {
			System.out.println("No colleges to show");
		}else {
			String universityName=String.format("Colleg in %s",this.name );
			System.out.println(universityName);
		    SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		    
			System.out.format("%-15s%-20s%-15s%-15s%-15s%-15s%-15s\n", "Name","Website","Mobile","Founder","Number of Dept","Location","Starting Date");
			for(College clg:this.collegeList) {
				
				System.out.format("%-15s%-20s%-15s%-15s%-15d%-15s%-15s\n",clg.getName(),clg.getWebsite(),clg.getMobile(),clg.getFounder(),clg.getNumberOfDept(),clg.getLocation(),sdf.format( clg.getStartingDate()));
			}
		}
	}

}
