package p1;

/*Array:
 * 2) for each loop- only for reading array values only we use.
 * */
public class Ex3 {
	public static void main(String[] args) {
		int[] arr = new int[4];

		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		for (int i : arr) {
			// only used for array and only for reading values of arrays
			System.out.println(i);
		}
	}
}
