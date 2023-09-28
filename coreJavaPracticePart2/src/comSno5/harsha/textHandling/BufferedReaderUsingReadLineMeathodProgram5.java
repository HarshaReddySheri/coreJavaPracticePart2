package comSno5.harsha.textHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderUsingReadLineMeathodProgram5 {
	public static void main(String[] args) throws IOException {
		File file = new File("./sample.text");
		if(!file.exists())
				file.createNewFile();
		
		 FileReader fr = new FileReader(file);
		 BufferedReader br = new BufferedReader(fr);
		 
		 String text = new String();
		 String line = new String();
		 
		 while((line = br.readLine()) != null) {
			 text += line + "\n";
		 }
		 System.out.println(text);
			
		fr.close();
		br.close();
		
	}
}
