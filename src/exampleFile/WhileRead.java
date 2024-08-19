package exampleFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public class WhileRead {

	public static void main(String[] args) {
		
		try {
			File myobj = new File("C:\\Users\\Administrator\\Desktop\\Demo.txt");
			Scanner myreader = new Scanner(myobj);
			
			while(myreader.hasNextLine())
			{
				String data = myreader.nextLine();
				System.out.println(data);
			}
			myreader.close();
		}catch(FileNotFoundException e)
		{
			System.out.println("file not found!");
		}

	}

}
