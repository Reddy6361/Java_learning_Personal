package p1;

import java.io.File;
//import java.io.IOException;
// if already a file is already created and we tried to recreate a file it wont override.
/*a)File class*/
public class Ex3 {
	public static void main(String[] args) {
		File f = new File("C:\\Users\\yog\\Desktop\\yog java\\8pm\\test.txt");
		// stores file location in "f" reference variable.
		System.out.println(f); // reference variable it stores folder path.
		boolean val = f.exists();// to check file exists.
		System.out.println(val);// if true it means file exists.
	// boolean delete = f.delete(); // delete the file.
	// System.out.println(delete); // if it deletes then it will return true.
//		try {
//			File file =f.createNewFile("C:\\Users\\yog\\Desktop\\yog java\\8pm\\test1.txt"); // mandatory to surround with try catch
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	}
}
