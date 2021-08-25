package p1;

//in the below example ex.test() is converted into Ex6.test() 
//automatically by compiler. 
public class Ex6_1 extends Ex6 {
	static Ex6_1 ex = null;
	public static void main(String[] args) {
		ex.test(); // here no inheritance happening compiler is just
		// changing ex.test() to Ex6.test() automatically
		// to avoid exception
	}
}
