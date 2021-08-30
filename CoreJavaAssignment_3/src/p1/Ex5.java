package p1;

/*
 * Bubble Sort Algorithm
 * */
/*Note: Number of elements in array is "n" then
 *  number of iterations will always be equal to "n-1"*/
public class Ex5 {
	static int[] a;

	public static void main(String[] args) {
		int[] intArray = { 20, 35, -15, 7, 55, 7, -22 };
		for (int i = (intArray.length - 1); i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (intArray[j] > intArray[j + 1]) {
					a = Ex5.swap(intArray, j, j + 1);
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	private static int[] swap(int[] array, int j, int i) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
		return array;
	}
}
