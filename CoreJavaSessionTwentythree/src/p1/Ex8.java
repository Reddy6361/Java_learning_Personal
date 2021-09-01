package p1;

import java.io.BufferedWriter;
import java.io.FileWriter;

/*
 * Buffered writer:
 * 1) /n does not work in file writer so we use buffered writer where a 
 * special method to write in new line is given so we use buffered writer.
 * 2)
 * */
public class Ex8 {
	public static void main(String[] args) {
		try {
			FileWriter fr = new FileWriter("C:\\Users\\yog\\Desktop\\yog java\\8pm\\test.txt");
			BufferedWriter bw = new BufferedWriter(fr);
			bw.write(100);
			bw.newLine();
			bw.write("Two");
			bw.newLine();
			char[] ch = { 'a', 'b', 'c', 'd' };
			bw.write(ch);

			bw.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
