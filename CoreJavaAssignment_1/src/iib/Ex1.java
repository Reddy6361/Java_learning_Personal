package iib;

/*IIB:
 * 1) IIB are exicuted when objects are created, number of times
 * we create object same number of times IIB will be called.
 * 2)IIB are used to initialize all instance variables in one place & 
 * that gives us a better readability of the code.
 * */
public class Ex1 {
	{// IIB
		System.out.println("from IIB");
	}

	public static void main(String[] args) {
		// no output because no object is created.
	}
}
