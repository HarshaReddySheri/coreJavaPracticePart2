package comSnoA12.harsha.propertiesfileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Properties;

public class OutputStreamORWriterProppractice {

	public static void main(String[] args) throws Exception {
		File file = new File ("dbConfig.properties");
		if(!file.exists())
			file.createNewFile();
		//System.out.println(file.exists());
		//file .delete();
		//System.out.println(file.exists());
		//To create properties file
		
		/*
		 * 1. first create instance then if file not exist then create file.createNewFile(); 
		 * 2. To handle the properties file in java , java provide a class name is Properties
		 * 3. How to write data into prop file By using Writer or OutputStreams
		 * 4. # for comments in properties file
		 * 
		 */
		
		Properties prop = new Properties();
		FileOutputStream fos = new FileOutputStream(file);
		
		prop.setProperty("URL", "Localhost");
		prop.setProperty("userName", "hyrtutorials");
		prop.setProperty("passWord", "hyr123");
		
		prop.store(fos, "new propfile is created"); //comment
		
		
}
}
