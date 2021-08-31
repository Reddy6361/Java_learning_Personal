package p1;

import java.io.File;

/*
 * Creating a folder:
 * */
public class Ex4 {
	public static void main(String[] args) {
		File f = new File("C:\\Users\\yog\\Desktop\\yog java\\8pm\\T1");
		boolean val = f.mkdir(); // non static method, used to create folder
		System.out.println(val); // true created, no overriding.
		boolean val1 = f.delete(); // non static method, used to delete folder
		System.out.println(val1);
	}
}
