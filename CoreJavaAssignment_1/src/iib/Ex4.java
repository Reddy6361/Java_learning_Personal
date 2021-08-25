package iib;
// main method> IIB> Constructor.
public class Ex4 {
	{// IIB // runs second
		System.out.println("from IIB");
	}
	Ex4(){ //runs third
		System.out.println("from constructor");
	}
	public static void main(String[] args) { // runs first
		new Ex4();// object should be created mandatorily to call the IIB
	}
}
