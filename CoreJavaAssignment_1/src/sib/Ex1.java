package sib;
/*SIB:
 * 1) runs before main method and it doesn't require any invoking statement.
 * 2) no Object creation is required or mandatory to call SIB 
 * */

public class Ex1 {
	static { // syntax of SIB, starts with a prefix of static.
		System.out.println("from SIB");
	}

	public static void main(String[] args) {
		//no object creation is required to call SIB as it belongs to 
		// class common memory, this program will give an output.
	}
}
