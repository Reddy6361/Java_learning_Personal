package iib;

/*Note: We can initialize both static and 
 * non-static variables in IIB
 * */
public class Ex9 {
	static int i; // static variable declaration.
	{
		i = 30;// initialization of var inside IIB
		System.out.println(i);
	}
	public static void main(String[] args) {
		new Ex9(); // object creation to call IIB
	}
}
