package p2;

/*Main definition: if we make constructor protected, then we can create 
 * object only in same class and in same package, cannot be used in 
 * different package it will give an error
 * */

/* Note: protected and Default works in same 
 * way when it comes to constructor.*/

/*Object creation to call constructor in same class is accepted.*/
public class Protected_Constructor_1 {
	protected Protected_Constructor_1() { // protected constructor.
		System.out.println(100);
	}

	public static void main(String[] args) {
		new Protected_Constructor_1(); // object creation in same class accepted.
	}
}
