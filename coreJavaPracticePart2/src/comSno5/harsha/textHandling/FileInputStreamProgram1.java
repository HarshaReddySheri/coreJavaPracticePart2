package comSno5.harsha.textHandling;

import java.io.File;
import java.io.IOException;
import java.io.FileInputStream;
public class FileInputStreamProgram1{
		public static void main(String[] args) throws IOException {
		File file = new File("./sample.txt");
		if(!file.exists())
				file.createNewFile();
		
		 FileInputStream fis = new FileInputStream(file);
		 int asciicode;
			String text = new String();
			while((asciicode = fis.read()) != -1) { //-1 tell that text file nothing to read
				//character By character Reading
				//so that we place read method you get each character number in loop by using char String method you get every single character (by converting asciicode in alphabet) as by that you can read entire text file
				text += String.valueOf((char)asciicode); //previous char and next char will added in text variable and text variable placed in sysout for reading the text file
				//System.out.print((char)asciicode);
			}
			System.out.println();
			System.out.println(text);
			
			fis.close();
		
		
		
	}
}