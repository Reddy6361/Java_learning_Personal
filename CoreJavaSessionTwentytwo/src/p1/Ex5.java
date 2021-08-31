package p1;

import java.io.File;

/*
 * Getting a count of folders and files:
 * */
public class Ex5 {
	public static void main(String[] args) {
		File f = new File("C:\\Users\\yog\\Desktop\\yog java\\8pm");
		String[] name = f.list(); // to read all the files.
		for (String string : name) { // for each
			System.out.println(string);
		}
		System.out.println(name.length);// number of folders present
	}
}
