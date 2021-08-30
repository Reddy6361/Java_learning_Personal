package p1;

/*Fetch the value from an array based on index number
 *  , calculate the big O notation for the same */
public class Ex3 {
	public static void main(String[] args) {
		int[] intArray = new int[7];
		intArray[0] = 20;
		intArray[1] = 30;
		intArray[2] = 40;
		intArray[3] = 50;
		intArray[4] = -60;
		intArray[5] = 70;
		intArray[6] = -80;
		System.out.println(intArray[3]);
		/*
		 * x+i*y; 12+3*4 =24, always 3 find, O(1) constant Performance
		 */

	}
}
