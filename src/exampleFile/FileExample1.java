package exampleFile;

import java.io.File;
import java.io.IOException;

public class FileExample1 {

	public static void main(String[] args) {
		try {
			File obj = new File("C:\\Users\\Administrator\\Desktop\\Demo.txt");
			
			if(obj.createNewFile()) {
				System.out.println("File created: "+ obj.getName());
				System.out.println("Absolute path: "+obj.getAbsolutePath());
			}else {
				System.out.println("File already exists");
			}
		}catch(IOException e)
		{
			System.out.println("An error occurred!");
			e.printStackTrace();
		}

	}

}
