// Continuation of 6 just some examples for methods.
public class Ex7 {
	public static void main(String[] args) {
		Ex7 ex = new Ex7();
		ex.test();
		return;// it wont give any error
	}

	private void test() {
		System.out.println(100);
		return;
		// System.out.println(100);// error
	}
}
