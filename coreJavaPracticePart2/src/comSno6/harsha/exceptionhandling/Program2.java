package comSno6.harsha.exceptionhandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


public class Program2 {
	public static void main(String[] args) throws IOException  {
  		File file = new File("D:/retest.docx");
  		file.createNewFile();
		FileInputStream fis = new FileInputStream(file);
		System.out.println(fis);
	}
}
