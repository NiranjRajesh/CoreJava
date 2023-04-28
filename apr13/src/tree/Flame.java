package tree;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public class Flame {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First Person Name");
		String person1=sc.nextLine().toLowerCase();
	    System.out.println("Enter the Second Person Name");
	    String person2=sc.nextLine().toLowerCase();
	    String total=person1+person2;
	    LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();
	    for(char x:total.toCharArray()) {
	    	Integer count = map.get(x);
	    	if(count==null)
				count=0;
			count++;
			map.put(x, count);
	    }
	    Collection<Integer>output=map.values();
	    int count=0;
	    for(Integer ch:output) {
	    	if(ch==1) {
	    		count++;
	    	}
	    	
	    }
	    
	    if(count==0) {
	    
	    	System.out.println("Your choice, perfect match");
	    	System.exit(0);
	    }
	   List<Character> flamer=new ArrayList<>();
	   flamer.add('F');
	   flamer.add('L');
	   flamer.add('A');
	   flamer.add('M');
	   flamer.add('E');
	   flamer.add('S');
	   
	   while(flamer.size()>1) {
		  
		   int sizer= flamer.size();
		   int moduler=count%sizer;
		   System.out.println(moduler);
		   if(moduler==0) {
			   flamer.remove(sizer-1);
			   
		   }else {
			   flamer.remove(moduler-1);
		   }
		   if(flamer.size()==1) {
			   break;
		   }
	
		  
		   
		   
	   }
	 
	   char choice=flamer.get(0);
	   switch(choice) {
	   case 'F':
		   System.out.println(person1+" is a Friend to "+person2);
		   break;
		
	   case 'L':
		     System.out.println(person1+" is a Lover to "+person2);
		     break;
	   case 'A':
		    System.out.println(person1+" is Affectionate towards "+person2);
		    break;
	   case 'M':
		    System.out.println(person1+" will Marry "+person2);
		    break;
	   case 'E':
	        System.out.println(person1+" is an Enemy to "+person2);
	        break;
	   case 'S':
		    System.out.println(person1+" is a Sibling to "+person2);
		    break;
		default:
			 System.out.println("You are alone");
	   }
	 
	 
	    
 
	}

}
