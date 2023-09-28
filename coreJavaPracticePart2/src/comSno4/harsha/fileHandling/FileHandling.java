package comSno4.harsha.fileHandling;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;

public class FileHandling{
	
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\sheri\\eclipse-workspace\\test demo\\");
		File f2 = new File(f.getParent() + "/resume.docx");
		f2.createNewFile();
		
		//System.out.println(f.isDirectory());
		//System.out.println(f.isFile());
		
		System.out.println(new Date(f.lastModified()));
		
		
		//System.out.println(f.getParent());
		
		//System.out.println(f.getAbsolutePath());
		//System.out.println(f.getName());
		System.out.println(Arrays.toString(f.listFiles()));
		
		
		//System.out.println(f.mkdirs());
		
		
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
		
		
	}

	
	}
