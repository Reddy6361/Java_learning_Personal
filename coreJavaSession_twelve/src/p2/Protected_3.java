package p2;

/*Default(non sub class same package):if you make variable and method protected,
 * then you can access it in non sub class same package.
 * */
public class Protected_3 {// no inheritance.
	public static void main(String[] args) {
		Protected_1 a = new Protected_1(); // object creation of parent class
		System.out.println(a.x); // accessing protected variable.//no error.
		a.test();// accessing protected method.//no error.
	}
}
