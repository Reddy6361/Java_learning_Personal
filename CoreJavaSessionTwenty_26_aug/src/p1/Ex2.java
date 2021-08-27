package p1;

/*for loop : 2nd Example.*/
public class Ex2 {
	static int i; // global access

	public static void main(String[] args) {
		for (i = 0; i < 5; i++) {//0,1,2,3,4,5
			System.out.println(i); // 0,1,2,3,4
		}
		System.out.println(i); // no error as i is not local variable.
	}
}
