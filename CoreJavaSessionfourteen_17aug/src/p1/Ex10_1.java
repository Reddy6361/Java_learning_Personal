package p1;

// running method //class up-casting
public class Ex10_1 extends Ex10 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Ex10 ex = new Ex10_1();
		ex = new Ex10_2();
		System.out.println(ex);
	}
}
