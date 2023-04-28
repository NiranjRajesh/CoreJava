package requirement4;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Mobile {
	private String referenceId;
	private String modelName;
	private Double displaySize;
	private Double price;
	private Date launchedDate;
	
	public Mobile() {
		
	}
	public Mobile(String referenceId, String modelName, Double displaySize, Double price, Date launchedDate) {
		super();
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
	@Override
	public String toString() {
		
		SimpleDateFormat sd=new SimpleDateFormat("dd-MM-yyyy");
		String dateValue=sd.format(this.getLaunchedDate());
		return String.format("%-15s %-15s %-12.1f %-8.1f %s\n",this.getReferenceId(),this.getModelName(),this.getDisplaySize(), this.getPrice(),   dateValue);
	}
	
	

}
