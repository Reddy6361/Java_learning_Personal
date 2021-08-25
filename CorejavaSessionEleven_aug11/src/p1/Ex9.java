package p1;

/*limitations:
1) this keyword cannot be used inside static method, hene the below program throws error. 
*/
public class Ex9 {
	public static void main(String[] args) {
		// System.out.println(this);// error.
		Ex9.test();
	}

	public static void test() {
		// System.out.println(this); //error.
	}
}
