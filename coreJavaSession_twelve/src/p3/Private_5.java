package p3;

import p2.Private_1;

/* private(non sub class different package): if we make any variable or
 *  method private we cannot access in non sub class different package.*/
public class Private_5 { // no inheritance
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Private_1 a = new Private_1(); // object creation for non sub class.
		// System.out.println(a.x);//cannot access private variable //error
		// a.test();// cannot access private method //error
	}
}
