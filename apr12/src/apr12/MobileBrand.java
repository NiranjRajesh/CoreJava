package apr12;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class MobileBrand {
	private String name;
	private List<Mobile> mobileList;
	
	public MobileBrand() {
		this.mobileList=new ArrayList<Mobile>();
	}
	public MobileBrand(String name, List<Mobile> mobileList) {
		
		this.name = name;
		this.mobileList = mobileList;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Mobile> getMobileList() {
		return mobileList;
	}
	public void setMobileList(List<Mobile> mobileList) {
		this.mobileList = mobileList;
	}

	public void addMobileToMobileBrand(Mobile mobile) {
		this.mobileList.add(mobile);
	}
	public Boolean removeMobileFromMobileBrand(String referenceId) {
	 Mobile m=null;
	 for(Mobile mobile:mobileList) {
		 if(mobile.getReferenceId().equals(referenceId)) {
			 m=mobile;
			 break;
		 }
	 }
	 
	 return this.mobileList.remove(m);
	}
	
	public void displayMobiles() {
		if(this.mobileList.isEmpty()) {
			System.out.println("No mobiles to show");
		}else {
			String mobileName=String.format("Mobiles in %s",this.name );
			System.out.println(mobileName);
			System.out.format("%-15s %-15s %-12s %-8s %s\n","Reference Id","Model Name","Display Size", "Price","Launched Date");
			SimpleDateFormat sdg= new SimpleDateFormat("dd-MM-yyyy");
			for(Mobile mobile:mobileList) {
				System.out.format("%-15s %-15s %-12.2f %-8.2f %s\n",mobile.getReferenceId(),mobile.getModelName(),mobile.getDisplaySize(), mobile.getPrice(),sdg.format(mobile.getLaunchedDate()));
			}
		}
	}

}
