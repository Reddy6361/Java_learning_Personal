//fake constructor / void fakeism.
public class Ex10 {
	void Ex10() {// this is not a constructor its an nonstatic method.
		System.out.println(100);
	}

	public static void main(String[] args) {
		new Ex10();// no output as it is not an constructor.
	}
}
