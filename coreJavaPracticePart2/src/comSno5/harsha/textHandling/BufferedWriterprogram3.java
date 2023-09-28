package comSno5.harsha.textHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterprogram3 {
	public static void main(String[] args) throws IOException {
		File file = new File("./sample.txt");
//		if(file.exists())
//			file.delete();
//		file.createNewFile();
		
		String existingText = new String();
		String line = "";
		BufferedReader br = new BufferedReader(new FileReader(file));
		while((line = br.readLine()) != null) {
			 existingText += line + "\n";
		}
		
		String s = "hello world 999666333";
		
		BufferedWriter bw = new BufferedWriter(new FileWriter(file));
		bw.write(existingText + s);
		
		
		bw.flush();
		bw.close();
		br.close();
		
	}
}
