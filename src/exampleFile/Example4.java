package exampleFile;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Example4 {

	public static void main(String[] args) {
		try {
		FileWriter mywriter = new FileWriter("C:\\Users\\Administrator\\Desktop\\Demo.txt");
		mywriter.write("welcome to micron technologies");
		mywriter.close();
		System.out.println("Successfully  wrote to the file");
	}catch(IOException e)
		{
			System.out.println("An error occured");
			e.printStackTrace();
		}
		}

}
