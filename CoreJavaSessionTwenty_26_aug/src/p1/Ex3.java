package p1;

/*break*/

public class Ex3 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			if (i == 3) { // 3==3 true
				break; // for loop will stop abruptly.
			}
			System.out.println(i);// 0,1,2
		}
	}
}
