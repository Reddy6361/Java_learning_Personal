package p1;

/*overloading:
 * 1)creating more than one method with the same name in same class provided they have diff number of argument or diff type of argument is called as method overloading
 * */
public class Ex4 {
	public void test() {
		System.out.println(100);
	}

	public void test(int i) {
		System.out.println(i);
	}

	public void test(int i, int y) {
		System.out.println(i);
		System.out.println(y);
	}

	public void test(byte b) {
		System.out.println(b);
	}
}
