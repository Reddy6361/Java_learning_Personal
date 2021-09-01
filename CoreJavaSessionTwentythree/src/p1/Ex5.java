package p1;

import java.io.FileWriter;

/*
 * Important
 * */
public class Ex5 {
	public static void main(String[] args) {
		try {
			FileWriter fr = new FileWriter("C:\\Users\\yog\\Desktop\\yog java\\8pm\\test.txt", true);//if true then it will keep on adding content it wont be overwritten.
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
