/* void :1)If a method is void then it means it cannot return any value
 *  hence the below program throws error.
 * 2) we cannot anything after return keyword.
 * 3) we cannot write anything side to return keyword in void method , 
 * we can just put return keyword terminated with semicolon.
 * 4) we cannot just write return keyword without any value next to it in non void method.
 * */
public class Ex3 {
	public static void main(String[] args) {
		Ex3 ex = new Ex3();
		ex.test();
		int test2 = ex.test2();// assigning non void member's to local variable.
		System.out.println(test2);// printing non void values
	}

	private int test2() {
		return 100;// it will be thrown out and we should assign the call statement to variable.
		// System.out.println(20);//error we can't write anything after return
	}

	private void test() {
		// return 100;//error
		System.out.println(100);// we can write anything before return keyword but not after.
		return;// accepted
		// System.out.println(20);//error we can't write anything after return
	}
}
