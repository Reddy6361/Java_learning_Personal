package p1;

public class Ex2_3 implements Ex2_2 {

	@Override
	public void test1() {
System.out.println(1);		
	}

	@Override
	public void test2() {
		System.out.println(2);			
	}

	@Override
	public void test3() {
		System.out.println(3);			
	}
	public static void main(String[] args) {
		Ex2_3 d = new Ex2_3();
		d.test1();
		d.test2();
		d.test3();
	}

}
