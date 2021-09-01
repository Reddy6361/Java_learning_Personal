package p1;

import java.io.FileWriter;

/*
 * 3) File Writer:
 * a) to write into file.
 * b) it will overrides the present file and all content is lost.
 * c) we have to close the file or else content is not saved in file
 * d) /n wont work i.e we cannot write in new line.
 * */
public class Ex4 {
	public static void main(String[] args) {
		try {
			FileWriter fr = new FileWriter("C:\\Users\\yog\\Desktop\\yog java\\8pm\\test.txt");
			fr.write(100); // char it will be converted.
			fr.write("100"); // now it is string and will be saved as 100
			fr.write("pankaj");
			char[] ch = { 'a', 'b', 'c', 'd' };
			fr.write(ch);
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
