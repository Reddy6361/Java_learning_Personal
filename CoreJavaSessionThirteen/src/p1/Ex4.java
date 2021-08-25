package p1;

//constructor chaining best example.
public class Ex4 {
	Ex4() {
		this(500);
		/*
		 * calling constructor from line 13 and we can pass 
		 * value in this keyword while calling the constructor
		 */
	}

	Ex4(int x) {
		this(30, 40);
		/*
		 * calling constructor from line 22 and we can pass value
		 *  in this keyword while calling the constructor
		 */
		System.out.println(x);
	}

	Ex4(int x, int y) {
		System.out.println(x);
		System.out.println(y);
	}

	public static void main(String[] args) {
		new Ex4();// object calling constructor at line 5
	}
}
