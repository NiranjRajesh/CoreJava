package task;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class App {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("C:\\Users\\248753\\Downloads\\karthi.txt");
		if(!f.exists()) {
			f.createNewFile();
		}
		
//		String text="this is a text to add";
//		FileWriter fw=new FileWriter("C:\\Users\\248753\\Downloads\\karthi.txt");
//		fw.write(text);
//		fw.close();
		FileReader fr=new FileReader(f);
		int i=-1;
		while((i=fr.read())!= -1) {
			System.out.print((char) i);
		}
	  fr.close();
		
		

	}

}
