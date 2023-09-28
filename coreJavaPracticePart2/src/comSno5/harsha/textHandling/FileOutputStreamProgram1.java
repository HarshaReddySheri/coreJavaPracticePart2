package comSno5.harsha.textHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamProgram1 {
	public static void main(String [] args) throws IOException {
		File file = new File("./sample.txt");
		if(file.exists())
			file.delete();
		file.createNewFile();
		
//		FileOutputStream fos = new FileOutputStream(file);
//		fos.write(72);
//		fos.write(69);
//		fos.write(76);
//		fos.write(76);
//		fos.write(79);
//		
//		fos.flush();
//		fos.close();
		
		String s = "hello";
		FileOutputStream fos = new FileOutputStream(file);
		for(char ch: s.toCharArray()) {
			fos.write((int)ch);
		}
		
		fos.close();
		
		
	}
}
