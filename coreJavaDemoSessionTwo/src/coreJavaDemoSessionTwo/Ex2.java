package coreJavaDemoSessionTwo;

public class Ex2 {
	int x = 10;// non static main copy.

	public static void main(String[] args) {
		Ex2 ex = new Ex2();// object 1 1st x copy and change value but it will not effect the main copy.
		ex.x = 30;// changing copy of x value.
		Ex2 ex1 = new Ex2();// object 2 2nd x copy it will be same as 10 it wont be 30.
		System.out.println(ex.x);// printing value of 1st obj value which we changed.
		System.out.println(ex1.x);// printing value of 2nd obj copy.
	}
}
