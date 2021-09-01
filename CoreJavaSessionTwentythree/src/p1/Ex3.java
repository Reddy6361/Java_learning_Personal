package p1;

import java.io.File;
import java.io.FileReader;

/*
 * 2nd type to read file.
 * Drawbacks:
 * 1) performance is a problem.
 * */
public class Ex3 {
	public static void main(String[] args) {
		try {
			File f = new File("C:\\Users\\yog\\Desktop\\yog java\\8pm\\t1.txt");
			FileReader fr = new FileReader(f);
			char[] ch = new char[(int) f.length()];
			fr.read(ch);
			for (char c : ch) {
				System.out.print(c);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
