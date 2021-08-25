package coreJavaDemoSessionThree;

//write stack and heap model to understand "LIFO"
public class Ex4 {
	public static void main(String[] args) {// step 1
		Ex4 ex = new Ex4();// step 2
		ex.test1();// step 3//step 11
	}// step 12 stop

	public void test1() {// step 4//non static method
		Ex4.test2();// step 5//step 9
	}// step 10

	public static void test2() {// step 6//static method as methoed is
		// called with class name
		System.out.println(100);// step 7
	}// step 8
}
