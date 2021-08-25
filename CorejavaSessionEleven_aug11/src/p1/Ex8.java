package p1;

public class Ex8 {
	public static void main(String[] args) {
		Ex8 ex = new Ex8();// object created one adress gets stored in rv by us compiler assigns obj adress// to this keyword.
		ex.test();
	}

	public void test() {
		this.test1();// we can use this keyword to call the method too
	}

	public void test1() {
		System.out.println(100);
	}
}
