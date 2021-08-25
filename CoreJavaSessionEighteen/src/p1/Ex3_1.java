package p1;

public class Ex3_1 extends Ex3 {
	public static void main(String[] args) {
		Ex3_1 a = new Ex3_1();
		System.out.println(a.x);
		a.test2();
		a.test1();
	}

	@Override
	public void test1() {
		System.out.println(100);
	}
}
