package coreJavaDemoSessionThree;

// write stack and heap model to understand "LIFO"
public class Ex2 {
	public static void main(String[] args) {// step 1
		System.out.println(10);// step 2
		Ex2 ex = new Ex2();// step 3
		ex.test();// step 4//step 9
	}// step 10

	public void test() {// step 5// non static methods 
		//it will always be stored in object.
		Ex2 ex1 = new Ex2();// step 6
		System.out.println(ex1);// step 7
	}// step 8
}
