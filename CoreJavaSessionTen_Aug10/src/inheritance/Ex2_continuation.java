package inheritance;

public class Ex2_continuation extends Ex2 {
	public static void main(String[] args) {
		Ex2_continuation ex = new Ex2_continuation(); //here method and variables gets stored from parent class
		
		ex.test();
		System.err.println(ex.x);
	}
}
