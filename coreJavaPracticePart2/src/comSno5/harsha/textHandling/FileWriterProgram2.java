package comSno5.harsha.textHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterProgram2 {
	public static void main(String[] args) throws IOException {
		File file = new File("./sample.txt");
		if(file.exists())
			file.delete();
		file.createNewFile();
		
		String s = "hello world 963";
		FileWriter fw = new FileWriter(file);
		fw.write(s.toCharArray());
		
		fw.flush();
		fw.close();
	}
}
