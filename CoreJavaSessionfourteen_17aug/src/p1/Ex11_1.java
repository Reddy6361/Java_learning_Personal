package p1;

// running method class down-casting
public class Ex11_1 extends Ex11 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Ex11_1 ex = (Ex11_1) new Ex11(); //class down-casting
		Ex11_2 ex1 = (Ex11_2) new Ex11();  //class down-casting
	}
}
