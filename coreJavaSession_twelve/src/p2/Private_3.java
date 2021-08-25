package p2;

/* private( non sub class same package): if we make any variable or
 *  method private we cannot access in non sub class same package.*/
public class Private_3 { // no inheritance
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Private_1 a = new Private_1();
		/*
		 * object creation for non subclass that is we create parent 
		 * class object in child class without inheritance.
		 */
//			 System.out.println(a.x);//cannot access private variable //error
//			 a.test();// cannot access private method //error
	}

}
