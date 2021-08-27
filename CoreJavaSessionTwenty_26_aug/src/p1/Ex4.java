package p1;

/*continue*/
public class Ex4 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			if (i == 3) { // 3==3 true
				continue; // 3 will skip and others will continue.
			}
			System.out.println(i);// 0,1,2,4
		}
	}
}
