package task3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Mobile implements Comparable<Mobile> {
	private String referenceId;
	private String modelName;
	private Double displaySize;
	private Double price;
	private Date launchedDate;
	
	public Mobile() {
		
	}
	public Mobile(String referenceId, String modelName, Double displaySize, Double price, Date launchedDate) {
	
		this.referenceId = referenceId;
		this.modelName = modelName;
		this.displaySize = displaySize;
		this.price = price;
		this.launchedDate = launchedDate;
	}
	public String getReferenceId() {
		return referenceId;
	}
	public void setReferenceId(String referenceId) {
		this.referenceId = referenceId;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public Double getDisplaySize() {
		return displaySize;
	}
	public void setDisplaySize(Double displaySize) {
		this.displaySize = displaySize;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Date getLaunchedDate() {
		return launchedDate;
	}
	public void setLaunchedDate(Date launchedDate) {
		this.launchedDate = launchedDate;
	}
	
	public static Mobile createMobile(String detail) throws ParseException {
		String arr[]=detail.split(",");
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		Date launchDate=new Date();
		launchDate=sdf.parse(arr[4]);
		
		return new Mobile(arr[0],arr[1],Double.parseDouble(arr[2]),Double.parseDouble(arr[3]),launchDate);
	}
	@Override
	public int compareTo(Mobile o) {
		// TODO Auto-generated method stub
		return this.price.compareTo(o.price);
	}
	

}
