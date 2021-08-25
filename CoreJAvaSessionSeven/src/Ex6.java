/* A)return : 
 * 1) return keyword can be used only in void method.
 * 2) its optional.
 * 3) It returns control to method calling statement.
 * 4) We can write return keyword in main method too.
 * 5) We can write return in static method too.
 * **************************************
 * B) return value:
 * 1) cannot be used in void methods.
 * 2) returns control and value to the calling statement.
 * 3) if not a void method its mandatory to use [return value]
 * */
public class Ex6 {// A
	public static void main(String[] args) {
		Ex6 ex = new Ex6();
		ex.test();
		return;// it wont give any error
	}

	private void test() {
		return;
	}
}

/*
 * public class Ex6 {//B public static void main(String[] args) { Ex6 ex = new
 * Ex6(); int a=ex.test(); System.out.println(a) return;// it wont give any
 * error }
 * 
 * private int test() { return 100; } }
 * 
 * 
 */