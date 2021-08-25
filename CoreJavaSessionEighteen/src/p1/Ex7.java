package p1;

/* Exception:
 * 1)whenever we a bad user input is given, program 
 * execution will halts abruptly.
 * 2) to handle exception we use try catch block, if any line of code 
 * in try block causes exception then try block will create in Exception
 *  block, and its object address try block will give it to catch block, 
 * catch block will now suppress the exception and hence the further
 *  code will continue execution.
 * */
public class Ex7 {
	public static void main(String[] args) {
		try {
			int x = 20;
			int y = 0;
			int z = x / y;// after exception no code will run
			System.out.println(z);// will not run
			System.out.println("hello"); // will not run
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println(100);// will run
	}
}
