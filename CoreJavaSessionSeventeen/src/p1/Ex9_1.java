package p1;

public class Ex9_1 {
	public static void main(String[] args) {
		Ex9 ex = (int x) -> { //lambdas syntax
			System.out.println(x);
		};
		ex.test1(100); // calls lambdas
	}
}
