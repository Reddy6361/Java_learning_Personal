package coreJavaDemoSessionTwo;

public class Ex1 {
	int x = 20;// non static stores only in object without object we can't asses it.
	static int y = 50;// static member stores only  in class common memory and we call it by using class name. variable name.

	public static void main(String[] args) {
		Ex1 ex = new Ex1();// object creation
		System.out.println(Ex1.y);// reading static member
		System.out.println(ex.x);// reading non-static member
	}
}
