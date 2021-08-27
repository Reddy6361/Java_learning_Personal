package p1;

/*While*/
public class Ex10 {
	public static void main(String[] args) {
		int x = 0;
		while (x < 3) { // true runs //false ends.
			System.out.println(x);// 0,1,2
			x++; // very important to avoid infinite loop.
		}
	}
}
