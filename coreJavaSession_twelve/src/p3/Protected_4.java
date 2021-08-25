package p3;

import p2.Protected_1;

/*Default( sub class different package):if you make variable and
 *  method Protected, then you can access it in non sub class different package.
 * */
public class Protected_4 extends Protected_1 { // inheritance is there.
	public static void main(String[] args) {
		Protected_4 a = new Protected_4(); // object creation of child class.
		System.out.println(a.x); // can access Protected variable.//no error.
		a.test();// can access Protected method.// no error.
	}
}
