package sib;

/*combination of all types
 * SIB>MM>IIB>Constructor>Method*/
public class Ex5 {

	{//IIB
		System.out.println("from IIB");
	}
	static { //SIB
		System.out.println("from SIB");
	}
	public static void main(String[] args) {//main method
		new Ex5();// object
		System.out.println("from main");
		Ex5.test();
	}
	public static void test() {
		System.out.println("from method");
	}
}
