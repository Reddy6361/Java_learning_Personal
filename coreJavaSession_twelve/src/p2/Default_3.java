package p2;
/*Default(non sub class same package):if you make variable and method default,
 * then you can access it in non sub class same package.
 * */
public class Default_3 {//no inheritance.
	public static void main(String[] args) {
		Default_1 a = new Default_1(); // object creation of parent class
		System.out.println(a.x); // accessing default variable.//no error.
		a.test();// accessing default method.//no error.
	}
}
