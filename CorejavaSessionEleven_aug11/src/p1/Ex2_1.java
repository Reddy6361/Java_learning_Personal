package p1;

public class Ex2_1 extends Ex2 {
	// public void test1(){
	// System.out.println(100);
	// }
	@Override
	public int test1() {
		return 200;
	}

	public static void main(String[] args) {
		Ex2_1 ex = new Ex2_1();
		System.out.println(ex.test1());
	}
}
