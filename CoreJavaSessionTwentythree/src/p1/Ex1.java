package p1;

import java.io.FileReader;

//"C:\\Users\\yog\\Desktop\\yog java\\8pm\\test.txt"
/*
 * File-limitations :
 * 1) cannot read or write.
 * */

/*  2) File Reader class:
 * a) can only read file can't count.
 * */
public class Ex1 {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("C:\\Users\\yog\\Desktop\\yog java\\8pm\\test.txt");
			for (int i = 0; i < 6; i++) {
				System.out.println((char) fr.read());// binary to char up-casting
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
