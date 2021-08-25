package p1;

/*Constructor overloading.
 * 1)different type of argument
 * */
public class Ex2 {
	Ex2(int i) {// no of arguments = 1 type = int
		System.out.println(i);
	}

	Ex2(char i) {// no of arguments = 1 type = char
		System.out.println(i);
	}

	Ex2(String i) {// no of arguments = 1 type = string
		System.out.println(i);
	}

	public static void main(String[] args) {
		new Ex2(10);// object creation 1
		new Ex2('a');// object creation 2
		new Ex2("pankaj");// object creation 3
	}
}
