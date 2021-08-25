package sib;
/* 1) Object creation in SIB is accepted.
 * 2) Object creation in IIB can be written , it wont give any error
 * but it will give exception.
 * */
public class Ex6 {
	{//IIB
		System.out.println("from IIB");
	}
	static { //SIB
		new Ex6();// object creation inside SIB
		System.out.println("from SIB");
	}
	public static void main(String[] args) {//main method
		System.out.println("from main");
		Ex6.test();
	}
	public static void test() {
		System.out.println("from method");
	}
}
