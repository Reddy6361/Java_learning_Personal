package inheritance;
//object oriented programming is applicable only in non static.
public class Ex4_2 extends Ex4_1 {
	public	void test3() {// test1() test2() inherited
		System.out.println(300);
	}
	public static void main(String[] args) {
		Ex4_2 ex = new Ex4_2();
		ex.test1();
		ex.test2();
		ex.test3();
	}
}
