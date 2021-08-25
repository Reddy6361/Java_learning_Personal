package p1;

// in below example during conversion there is data loss of 0.3 hence
// up-casting cannot happen hence there is an error.
public class Ex4 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		float x = 10.3f; // 4 bytes
		/*
		 * long y = x; //up-casting //8 bytes it can only store integer values not
		 * decimal values so no up-casting
		 */
		// System.out.println(y);
	}
}
