package p1;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
/*
 *  Serialization: Here we store object state permanently into the file
 *  system in the from of binaries/ streams.
 * */
public class Ex2_1 {
	public static void main(String[] args) {
		try {
			// create a file to write binary content
			FileOutputStream fos = new FileOutputStream("C:\\Users\\yog\\Desktop\\yog java\\8pm\\FileObject1.ser");
			
			// write object
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			Ex2 ex = new Ex2(); // create object which we want to serialize
			oos.writeObject(ex); // creating a object serializabel file
			oos.close(); // closing file
			fos.close(); //closing file
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
