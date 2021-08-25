package p2;

/*Default(sub class same package):if you make variable and method default,
 * then you can access it in sub class same package.
 * */
public class Default_2 extends Default_1 { // inheritance is there
	public static void main(String[] args) {
		Default_2 a = new Default_2(); // object creation of child class
		System.out.println(a.x); // accessing default variable.//no error.
		a.test();// accessing default method.//no error.
	}
}
