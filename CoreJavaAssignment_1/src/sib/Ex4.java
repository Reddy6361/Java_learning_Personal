package sib;

/*SIB-1>SIB-2>MM>IIB>Constructor>Method*/
public class Ex4 {
	static { // 1st SIB
		System.out.println("first SIB");
	}
	static {// 2nd SIB
		System.out.println("second SIB");
	}

	public static void main(String[] args) {
		System.out.println("from main");
	}
}
