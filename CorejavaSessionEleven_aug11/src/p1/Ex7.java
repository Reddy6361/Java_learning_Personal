package p1;
// using this keyword we can access non static members of the class.
public class Ex7 {
	int x = 10;

	public static void main(String[] args) {
		Ex7 ex = new Ex7();// object created one adress gets stored in rv by us compiler assigns obj adress
							// to this keyword.
		System.out.println(ex.x);
		ex.test();
	}

	public void test() {
		System.out.println(this.x);// it refers to same obj which we created in main method.
	}
}
