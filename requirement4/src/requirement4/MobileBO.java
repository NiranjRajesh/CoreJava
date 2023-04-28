package requirement4;

import java.util.ArrayList;
import java.util.List;

public class MobileBO {

	
	public List<Mobile> findMobile(List<Mobile> mobileList,String modelName){
		List<Mobile> modelList=new ArrayList<Mobile>();
		for(Mobile mb:mobileList) {
			if(mb.getModelName().equals(modelName)) {
				modelList.add(mb);
			}
			
		}
		return modelList;
		
	}
	public List<Mobile> findMobile(List<Mobile> mobileList,Double displaySize){
		List<Mobile> displayList=new ArrayList<Mobile>();
		for(Mobile mb:mobileList) {
			if(mb.getDisplaySize().equals(displaySize)) {
				displayList.add(mb);
			}
			
		}
		return displayList;
	}
}
