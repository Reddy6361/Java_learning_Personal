package p1;

/* what if we don't have the index number to fetch 
 * the element from an array*/
public class Ex4 {
	public static void main(String[] args) {
		int[] intArray = new int[7];
		intArray[0] = 20;
		intArray[1] = 30;
		intArray[2] = 40;
		intArray[3] = 50;
		intArray[4] = -60;
		intArray[5] = 70;
		intArray[6] = -80;

		for (int i = 0; i < intArray.length; i++) {
			if (intArray[i] == 30) {
				// used to find unknown index number when value is known
				System.out.println("index " + i);
			}
		}
	}
}
