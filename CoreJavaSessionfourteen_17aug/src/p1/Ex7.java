package p1;

//continuation of down-casting.
public class Ex7 {
	public static void main(String[] args) {
		short x = 10; // 2 bytes

		byte y = (byte) x; // down-casting //1 bytes // no data loss

		System.out.println(y);
	}
}
