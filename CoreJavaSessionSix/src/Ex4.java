/*reference variable : 1) can store objects address or null value
 * 2) if  a reference variable is created in a method then it is a local variable.
 * 3) if you make reference variable static it has global access.
 * 4) Data type of reference variable is class name.
 *   */
public class Ex4 {
	static Ex4 ex;
	public static void main(String[] args) {
		 Ex4 ex = new Ex4();//
		System.out.println(ex);
		ex.test();
	}

	public void test() {
		System.out.println(ex);
	}
}
