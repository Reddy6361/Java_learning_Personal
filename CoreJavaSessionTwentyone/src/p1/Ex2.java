package p1;

/*Arrays: 
 * 1) array out of bounds Exception.
 * */
public class Ex2 {
	public static void main(String[] args) {
		try {
			int[] arr = new int[3];
			System.out.println(arr.length);
			// it is a non static variable not method.
			arr[0] = 10;
			arr[1] = 20;
			arr[2] = 30;
			// arr[3]= 10; // array index out of bounds exception
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
