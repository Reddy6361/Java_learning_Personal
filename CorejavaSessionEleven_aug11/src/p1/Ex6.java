package p1;

/* this keyword:
 * 1)its a special reference variable created automatically to store objects addres.
 * 
 * */
public class Ex6 {
	public static void main(String[] args) {
		Ex6 ex = new Ex6();// object created one adress gets stored in rv by us compiler assigns obj adress
							// to this keyword.
		System.out.println(ex);
		ex.test();
	}

	public void test() {
		System.out.println(this);// it refers to same obj which we created in main method.
	}

}
