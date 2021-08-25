package iib;

/*Multiple IIB's
 * 1) which is present at first prints first ie by order wise
 * 2) MM>IIB1>IIB(n)>Constructor.
 * */
public class Ex7 {
	{// IIB 1 // runs second
		System.out.println("from IIB");
	}
	{// IIB 2 // runs third
		System.out.println("from IIB");
	}

	Ex7() { // runs fourth
		System.out.println("from constructor");
	}

	public static void main(String[] args) { // runs first

		new Ex7();// object should be created mandatorily to call the IIB

	}
}
