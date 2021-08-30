package p1;

//very important qstn.
/*
 * Array:
 * 7) array can be created anywhere.
 * */
public class Ex7 {
	public static void main(String[] args) {
		int[] x = { 10, 20, 30, 40 };// dynamic array
		System.out.println(x.length);
		Ex7 a = new Ex7();
		a.test(x);
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
	}

	private void test(int[] y) {
		y[0] = 100;
	}
}
