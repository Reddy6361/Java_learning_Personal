package p3;

import p2.Default_1;

/*Default( sub class different package):if you make variable and method default,
 * then you cannot access it in non sub class different package.
 * */
public class Default_4 extends Default_1 { // inheritance is there.
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Default_4 a = new Default_4(); // object creation of child class.
		// System.out.println(a.x); //cannot accessing default variable.//error.
		// a.test();// cannot accessing default method.// error.
	}
}
