package comSno4.harsha.fileHandling;

/*
 * Agenda
 * ******
 * 
 * 1.What is a file?
 * Ans:Inside the Operating System.
 * 
 * File is a some amount of information stored in a unit is Know as file.
 * 
 * Operating System
 * ->file & directory are different in file or folder
 * 
 * JAVA
 * ->FILE & DIRECTORY IS DEALS AS SAME FOR BOTH
 * 
 * PROCUDURE FOR fileHandling
 * **************************
 * 1.import java.io.file;
 * 2.Create object or file instance
 * 		File f=new file("path");
 * --> two widely used constructors
 *     1. String pathname
 *     2. URL url
 * 
 * 3. Two path
 * --> Absolute path(Full path)
 * -->Relative path(./to create in same directory)
 * 
 * separators	/ or \\
 * 
 * 
 */
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;

public class FileHandling{

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\sheri\\eclipse-workspace\\test demo\\");
		File f2 = new File(f.getParent() + "/resume.docx");
		f2.createNewFile();

//1.boolean True/False based operation on file Creation

		//		if(f.exists())
		//			f.delete();
		//		System.out.println(f.exists());

		//		if(f.exists())
		//			f.delete();
		//		System.out.println(f.createNewFile());
		//System.out.println(f.isHidden());
		//		System.out.println(f.canWrite());
		//		f.setWritable(true);
		//		System.out.println(f.canWrite());

		//System.out.println(f.exists());
		//System.out.println(f.delete());
		//System.out.println(f.createNewFile());


		/*2.
		 * On folder Creation 
		 * mk means main directory
		 * 2 methods --> f.mkdir(); -> one folder
		 * 			 --> f.mkdirs();-> more then one folder
		 * 
		 * Right hand --> / (back slash) & \\ (forward slash)
		 */
		//EX: C:/resumes/english/short/
		// |-->for creating only one -> use mkdir();
		//System.out.println(f.mkdir());
		//System.out.println(f.mkdirs());

//3.
		//entire path of each folder path
		System.out.println(Arrays.toString(f.listFiles()));

		//Only name of each folder name
		System.out.println(f.list());

		//full path of file
		//System.out.println(f.getAbsolutePath());

		//Only file name
		//System.out.println(f.getName());

		//file parent path only not file name to get use these method.
		//System.out.println(f.getParent());

		//To Know the Date of file created.
		System.out.println(new Date(f.lastModified()));


		//To find weather it a file or directory

		//System.out.println(f.isDirectory());
		//System.out.println(f.isFile());


	}


}
