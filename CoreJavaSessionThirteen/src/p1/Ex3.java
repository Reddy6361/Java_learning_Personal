package p1;

// while calling a constructor this keyword should always be first statement in another constructor.
public class Ex3 {
	Ex3() {
		System.out.println(500);
		// this(500);//error /* calling constructor from line 10 and we can pass value in this keyword while calling the constructor*/
	}

	Ex3(int x) {
		System.out.println(x);
	}

	public static void main(String[] args) {
		new Ex3(100);// object calling constructor at line 5
	}
}
