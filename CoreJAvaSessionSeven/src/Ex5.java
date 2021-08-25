// if you write anything after return keyword then that will not run and it will give us unreachable code error, as shown in the below example.
public class Ex5 {
	public static void main(String[] args) {
		Ex5 ex = new Ex5();
		String var = ex.test();// getting value from non void method and stores in local variable for printing.
		System.out.println(var);// printing Stored value.
	}

	private String test() {// non void method
		System.out.println(100);// it will run it will not be an unreachable code as it is before return
								// keyword.
		return "pankaj";// we have to write value after return as it's an non void method or else error.
		// System.out.println(100);// error unreachable code
	}
}
