package p2;
/*Main point: if you make variable /method private
 *  it can be accessed in same class*/

/*
 * Data-hiding: here we make variable private so that it cannot be 
 * accessed outside class. 
 * 
 * Hiding-implementation of Data/details:
 * Encapsulation concept.
 * */

/* Private: if we make any variable or method private we can
access in same class.*/
public class Private_1 {
	private int x = 20; // non static private variable.

	private void test() { // private method.
		System.out.println("accessible");
	}

	public static void main(String[] args) {
		Private_1 a = new Private_1(); // object creation
		System.out.println(a.x);// accessing private variable // no error
		a.test();// accessing private method // no error
	}

}
