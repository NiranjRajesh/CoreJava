package requirement4;

public class App3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static Integer nearlyLucky (Integer[] arr) {
		int count=0;
		int maxCount=0;
		for(Integer item:arr) {
			Integer k=item;
			while(k>0) {
				Integer check=k%10;
				if(check ==3 || check ==4 || check== 7) {
					count++;
					
				}
				k=k/10;
			}
			if(count==3 || count ==4 || count==7) {
				maxCount++;
			}
			
			
		}
		
		
		return maxCount;
	}

}
