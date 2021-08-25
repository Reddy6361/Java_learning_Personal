//more on methods 
public class Ex1 {

	public static void main(String[] args) {
		Ex1 ex = new Ex1();
		ex.test(10, 10.3f, "test", true, 'a');
	}

	public void test(int i, float f, String string, boolean b, char c) {
		System.out.println(i);
		System.out.println(f);
		System.out.println(string);
		System.out.println(b);
		System.out.println(c);

	}
}
