package comSno5.harsha.textHandling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderProgram2 {
	public static void main(String[] args) throws IOException {
		File file = new File("./sample.text");
		if(!file.exists())
				file.createNewFile();
		
		Scanner scanner = new Scanner(file);
		while(scanner.hasNextLine()) {
			System.out.println(scanner.nextLine());
		}
		scanner.close();
}
}