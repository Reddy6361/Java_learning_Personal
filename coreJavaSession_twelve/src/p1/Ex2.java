package p1;

/*2) in non static method we can can access non static members even without 
 * this keyword as shown in the below example*/
public class Ex2 {
	int x = 10;

	public static void main(String[] args) {
		Ex2 ex2 = new Ex2();
		ex2.test();
	}

	public void test() {
		System.out.println(/*this.*/x);// this.x
	}
}
