package p1;

/*2) using this keyword we can access static variable, as shown in the example below., it gives warning but not error. its bad practise.  
 * */
public class Ex10 {
	static int x = 10;

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Ex10 ex = new Ex10();// object created one adress gets stored in rv by us compiler assigns obj adress
								// to this keyword.
		System.out.println(ex.x);
		ex.test();
	}

	@SuppressWarnings("static-access")
	public void test() {
		System.out.println(this.x);// it refers to same obj which we created in main method.
	}
}
