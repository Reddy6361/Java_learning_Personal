package p3;

import p2.Protected_1;

/*Default(non sub class different package):if you make variable and method 
 * Protected,then you cannot access it in non sub class same package.
 * */
public class Protected_5 {// no inheritance.
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Protected_1 a = new Protected_1(); // object creation of parent class
//		System.out.println(a.x); //cannot accessing Protected variable.//error.
//		a.test();// cannot accessing Protected method.// error.
	}
}
