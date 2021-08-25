package p3;

import p2.Private_1;

/* private(sub class different package): if we make any variable or
 *  method private we cannot access in sub class different package.*/
public class Private_4 extends Private_1 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Private_4 a = new Private_4(); // object creation
		// System.out.println(a.x);//cannot access private variable //error
		// a.test();// cannot access private method //error
	}
}
