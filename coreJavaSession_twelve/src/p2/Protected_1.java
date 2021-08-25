package p2;

/* Main definition: If you make the  variable/method protected,Then 
 * it can be accessed anywhere in same package and different package 
 * only through inheritance.
 * */

/*protected(same class):if you make variable and method protected,
 * then you can access it in same class.
 * */
public class Protected_1 {
	protected int x = 10;// protected variable.

	protected void test() { // protected method
		System.out.println("accesible");
	}

	public static void main(String[] args) {
		Protected_1 a = new Protected_1(); // object creation
		System.out.println(a.x); // accessing protected variable.//no error.
		a.test();// accessing protected method.//no error.
	}

}
