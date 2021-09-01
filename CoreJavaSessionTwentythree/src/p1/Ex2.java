package p1;

import java.io.File;
import java.io.FileReader;

/*
 * 1st type to read file.
 * */
public class Ex2 {
	public static void main(String[] args) {
		try {
			File f = new File("C:\\Users\\yog\\Desktop\\yog java\\8pm\\t1.txt");
			FileReader fr = new FileReader(f);
			for (int i = 0; i < f.length(); i++) {
				System.out.print((char) fr.read());// binary to char up-casting
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
