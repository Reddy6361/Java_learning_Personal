package p1;
//@ override annotation helps us to check weather overriding is happening or not. if overriding is not happening then we would get an error as shown in the below example.
// overriding
public class Ex1_1 extends Ex1 {
	//@Override - if we dont write this it will give an error.
	public void teset1(){// if it matches it wont give error, here it is not matching so it is giving error.
		System.out.println(100);
	}
	public static void main(String[] args) {
		Ex1_1 ex = new Ex1_1();
		ex.test1();
	}
}
