package p1;

/* Auto up-casting:
*  1)Here we convert smaller data type to bigger data type
*  2)during auto up-casting data loss should not happen.
*  */
public class Ex2 {
	public static void main(String[] args) {
		int x=10;//4 bytes
		long y = x; //up-casting //8 bytes
		System.out.println(y);
	}
}
