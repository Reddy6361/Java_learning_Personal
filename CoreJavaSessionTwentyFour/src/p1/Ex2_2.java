package p1;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/*
 * DeSerialization: here we read the file
 * content in binaries and then we form the object back on ram.
 * */
public class Ex2_2 {// no inheritance its subclass.
	public static void main(String[] args) {
		try {
			// read a file in binary content.
			FileInputStream fis = new FileInputStream("C:\\Users\\yog\\Desktop\\yog java\\8pm\\FileObject1.ser");
			try (// read or form object
					ObjectInputStream ois = new ObjectInputStream(fis)) {
				Ex2 a = (Ex2) ois.readObject();// type casting to convert object into class object.// object casting
				System.out.println(a.city);
				System.out.println(a.name);
				System.out.println(a.password); // as we used transient value will not be copied
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
