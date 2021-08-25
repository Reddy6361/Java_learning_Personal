package p1;

/*	Explicit down-casting:
 * 1) here we convert bigger data type to smaller data type.
 * 2) during down-casting data loss might happen.
 * */
public class Ex6 {
	public static void main(String[] args) {
		float x = 10.3f; // 4 bytes

		long y = (long) x; // down-casting //8 bytes //data loss

		System.out.println(y);
	}
}
