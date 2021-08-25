package p1;

public class Ex9_1 extends Ex9 {
	Ex9_1(int i){
		//super(); will always be added by default buy compiler.
		System.out.println("child class constructor.");
	}
	public static void main(String[] args) {
		new Ex9_1(10);
	}
}
