package polymorphism;

/*overriding happens here the same method from class Ex2 is getting logic modified.*/
public class Ex2_2 extends Ex2 {
	public void test() {// overriding happens here the same method from class Ex2 is getting logic
						// modified.
		System.out.println(500);
	}

	public void test1() {
		System.out.println(100);
	}

	public static void main(String[] args) {
		Ex2_2 ex = new Ex2_2();
		ex.test();
		ex.test1();
	}
}
