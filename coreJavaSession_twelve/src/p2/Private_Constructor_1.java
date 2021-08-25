package p2;

/*Main definition: if we make constructor private, then we can create 
 * object only in same class, cannot be used outside class / if it is used
 * in different class it will give an error
 * */
/*Object creation to call constructor in same class is accepted.*/
public class Private_Constructor_1 {
	private Private_Constructor_1() { // private constructor.
		System.out.println(100);
	}

	public static void main(String[] args) {
		new Private_Constructor_1(); // object creation in same class accepted.
	}
}
