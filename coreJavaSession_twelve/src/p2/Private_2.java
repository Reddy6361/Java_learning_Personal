package p2;

/* private(sub class same package): if we make any variable or
 *  method private we cannot access in sub class same package.*/
public class Private_2 extends Private_1 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Private_2 a = new Private_2(); // object creation
		// System.out.println(a.x);//cannot access private variable //error
		// a.test();// cannot access private method //error
	}

}
