package p2;

/*Main definition: if we make constructor default, then we can create 
 * object only in same class and in same package, cannot be used in 
 * different package it will give an error
 * */
/*Object creation to call constructor in same class is accepted.*/
public class Default_Constructor_1 {
	Default_Constructor_1() { // default constructor.
		System.out.println(100);
	}

	public static void main(String[] args) {
		new Default_Constructor_1(); // object creation in same class accepted.
	}
}
