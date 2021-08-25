package p1;

// child class > extends parent class> implements interface
public class Ex4_2 extends Ex4_1 implements Ex4 {

	@Override
	public void test1() {
		System.out.println(50);
	}
	public void test3() {
		System.out.println(200);
	}
public static void main(String[] args) {
	Ex4_2 c = new Ex4_2();
	c.test1();
	c.test2();
	c.test3();
}
}
