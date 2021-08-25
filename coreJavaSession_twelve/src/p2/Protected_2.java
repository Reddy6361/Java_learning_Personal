package p2;

/*Default(sub class same package):if you make variable and method protected,
 * then you can access it in sub class same package.
 * */
public class Protected_2 extends Protected_1 { // inheritance is there
	public static void main(String[] args) {
		Protected_2 a = new Protected_2(); // object creation of child class
		System.out.println(a.x); // accessing protected variable.//no error.
		a.test();// accessing protected method.//no error.
	}
}
