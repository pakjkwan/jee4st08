package global;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest {
	public static void main(String[] args) {
		File f = new File("C:\\Users\\hb\\workspace\\test.txt");
		try {
			FileWriter fw = new FileWriter(f);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//BufferedWriter writer = new BufferedWriter(fw);
	}
}
