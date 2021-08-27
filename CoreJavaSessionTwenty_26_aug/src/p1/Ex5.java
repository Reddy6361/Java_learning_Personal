package p1;

/*labeled break.*/
public class Ex5 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			x: if (i == 3) { // 3==3 true //this will be only exiting
				// if statement not for statement
				break /* variable */x;
				/* variable */// where we write x there the loop will break.
			}
			System.out.println(i);// 0,1,2,3,4
		}
	}
}
