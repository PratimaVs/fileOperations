package exampleFile;

import java.io.File;
import java.io.IOException;

public class Example2Delete {
	
	public static void main(String[] args) {
		try {
			File obj = new File("C:\\Users\\Administrator\\Desktop\\Demo.xlsx");
			
			if(obj.delete()) {
				System.out.println("File deleted: "+ obj.getName());
			}else {
				System.out.println("Failed to delete the file");
			}
		}finally {System.out.println("lalala");
		}}
}
