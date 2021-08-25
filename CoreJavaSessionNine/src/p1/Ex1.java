package p1;

/*Constructor overloading:
 * 1)here we create more than one constructor in same class.
 * 2) create constructors with different number of arguments or different type of argument
 * 
 * */
public class Ex1 {
	Ex1() {// no of arguments=0.
		System.out.println(300);
	}

	Ex1(int i) {// no of arguments = 1
		System.out.println(i);
	}

	Ex1(int i, int y) {// no of arguments = 2
		System.out.println(i);
		System.out.println(y);
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		Ex1 ex = new Ex1();// object creation 1
		Ex1 ex1 = new Ex1(10);// object creation 2
		Ex1 ex2 = new Ex1(100, 200);// object creation 3

	}
}
