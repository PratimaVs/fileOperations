package exampleFile;

import java.io.File;

public class Example3Read {

	public static void main(String[] args) {
			File obj = new File("C:\\Users\\Administrator\\Desktop\\Demo.txt");
			if(obj.exists())
			{
				System.out.println("File name: "+ obj.getName());
				System.out.println("Absolute path: "+obj.getAbsolutePath());
				System.out.println("Writeable: "+obj.canWrite());
				System.out.println("Readable: "+obj.canRead());
				System.out.println("object size: " + obj.length());
			}else
				System.out.println("file does not exist");
		}
}
