package p2;
/*
 * Main definition: If you make the  member default,Then it can be accessed 
 * anywhere in same package and same class.
 * */
/*Default(same class):if you make variable and method default,
 * then you can access it in same class.
 * */
public class Default_1 {
	int x = 10;// default variable.

	void test() { // default method
		System.out.println("accesible");
	}

	public static void main(String[] args) {
		Default_1 a = new Default_1(); // object creation
		System.out.println(a.x); // accessing default variable.//no error.
		a.test();// accessing default method.//no error.
	}

}
