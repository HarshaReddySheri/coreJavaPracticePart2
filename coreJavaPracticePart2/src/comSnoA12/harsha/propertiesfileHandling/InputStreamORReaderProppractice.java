package comSnoA12.harsha.propertiesfileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.util.Collection;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class InputStreamORReaderProppractice {

	public static void main(String[] args) throws Exception {
		File file = new File("dbConfig.properties");
		if (!file.exists())
			file.createNewFile();
		// To read or retrieve data of propFile
		// multiple method & ways to read
		// 1. to read properties names --> have a method
		// 2. to read properties values --> have a method
		// 3. to read properties names & if not specified then default name is settled
		// --> have a method
		Properties prop = new Properties();
		// To load the properties file
		// Reader or InputStream
		FileInputStream fis = new FileInputStream(file);
		prop.load(fis);

		// Key's Retrieve 1st way

		Set<String> keys = prop.stringPropertyNames();
		System.out.println(keys);
		System.out.println();
		// key's retrieve 2nd way

		Set<Object> c = prop.keySet();
		System.out.println(c);
		System.out.println();

		// value retrieve
		Collection<Object> c2 = prop.values();
		System.out.println(c2);
		System.out.println();
		// if we provide key how to get value?
		System.out.println(prop.getProperty("URL"));
		System.out.println(prop.getProperty("userName"));
		System.out.println();
		// if key property not in properties file
		// i assume it present in-it
		// you want to provide key & value
		System.out.println(prop.getProperty("machineName", "lenovo"));
		System.out.println();
		// if want key & value pair print in console
		// 1Way
		System.out.println(prop);
		System.out.println();
		// i want to iterate & print it
		// 2Way
		for (Object key : prop.keySet()) {
			System.out.println(key + ">>>" + prop.getProperty((String) key)); // cast from Object to String
		}
		System.out.println();
		// entrySet -> will give Key&Value print in console
		Set<Entry<Object, Object>> data = prop.entrySet();
		for (Entry<Object, Object> entry : data) {
			System.out.println(entry.getKey() + ">>>>>>" + entry.getValue());

		}
		System.out.println();

		/*
		 * //update the propertyFile
		 * 
		 * Here no method for updating 
		 * but Inside map what we do the operation 
		 * similarly
		 * concept i want to apply it
		 * 
		 * System.out.println(prop.setProperty("URL", "192.168.25.78"));
		 * 
		 * //Remove the properties file prop.remove("url");
		 */
		
		
	}

}
