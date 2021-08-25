package p1;

/*Constructor overloading
 * 3) if those 2 different arguments belong to same data type like int and byte etc.
 * Note: in the below program, it will call int because all numbers by default is treated as int.
 * */
public class Ex3 {
	Ex3(int i) { // no of arguments = 1 type = int
		System.out.println(i);
		System.out.println("int");
	}

	Ex3(byte i) {// no of arguments = 1 type = byte
		System.out.println(i);
		System.out.println("byte");
	}

	public static void main(String[] args) {
		new Ex3(10);// object creation 1
		// *** to pass byte value we write as new //Ex3((byte)10);
		// *** to pass long value we write as new //Ex3(10L);
		// in java if we write any number it will always be treated as int, if we
		// explicitly want to pass byte value then we do down casting.
	}
}
