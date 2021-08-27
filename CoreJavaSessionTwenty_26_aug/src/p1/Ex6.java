package p1;

/*labeled for example 2*/
public class Ex6 {
	public static void main(String[] args) {
		x: for (int i = 0; i < 5; i++) {// this will be exiting for statement
			if (i == 3) { // 3==3 true
				break /* any variable */x;
				// where we write x there the loop will break.
			}
			System.out.println(i);// 0,1,2
		}
	}
}
