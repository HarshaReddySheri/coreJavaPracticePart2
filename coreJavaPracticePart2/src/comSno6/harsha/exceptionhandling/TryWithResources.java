package comSno6.harsha.exceptionhandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
/*
 * Important
 * *********
 * 
 * For your application specific you need some exception which are not developed by Oracle
 * 
 * but we can't ask to java Oracle company to create execution
 * 
 * When you want in application under process
 * 
 * you have a userdefined exception or custom exception are helpful 
 * 
 * it useful for java developer & AutoMachineTester
 * 
 * *try, catch ,finally --> developer terms to solve exception
 * *throw & throws -------> java terms to solve exception
 * 
 */
public class TryWithResources {

	public static void main(String[] args) throws IOException {
		File file = new File("./sample.txt");
		if(!file.exists())
			file.createNewFile();
		
		//Try with Resources will help to Autoclosable (must be a parent of it then you have keep it in try block)
		
		try(
				//try with resources is a concept of AutoCloseable the code
				
				//EX: When we create instance for reader & writer we have to close the reader & writer with close() KW
				
				//Try with resource will help to Automate close();
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
				//inside try block pass resources here the insilization, decilazation & semicolon separation
				//Try(), method().
				//as like inside method parameter's(no of value were given & we give comma for seperation & declarization) are passed
				
			){
			String text = new String();
			String line = new String();

			while((line = br.readLine()) != null) {
				text += line + "\n";
			}
			System.out.println(text);
			
		}
		catch(Exception ex) {
			ex.printStackTrace();
			
		}
	}
}


