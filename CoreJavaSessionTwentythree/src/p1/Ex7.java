package p1;

import java.io.BufferedReader;
import java.io.FileReader;

/*
 * Note: common issue with file reader and file reader that is 
 * performance issue, so they introduced buffered memory concept which 
 * consists of buffered reader and buffered writer.
 * */

/*
 * Buffered reader:
 * 1) performance improvisation.
 * 2) we cannot give file path in buffered  reader.
 * */
public class Ex7 {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("C:\\Users\\yog\\Desktop\\yog java\\8pm\\t1.txt");
			BufferedReader br = new BufferedReader(fr);
			char[] ch = new char[6];

			br.read(ch);

			for (char c : ch) {
				System.out.print(c);
			}

			// new feature - read line

			System.out.println(br.readLine());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
