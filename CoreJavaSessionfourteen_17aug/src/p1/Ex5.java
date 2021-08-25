package p1;

/*	Explicit down-casting:
 * 1) here we convert bigger data type to smaller data type.
 * 2) during down-casting data loss might happen.
 * */
public class Ex5 {
	public static void main(String[] args) {
		long x = 10; // 8 bytes

		int y = (int) x; // down-casting //4 bytes // no data loss

		System.out.println(y);
	}
}
