package reflections;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method method[]=Planet.class.getDeclaredMethods();
		for(Method meth:method) {
			if(Modifier.isPublic(meth.getModifiers())) {
				System.out.println(meth.getName());
			}
		
		}
	}

}
