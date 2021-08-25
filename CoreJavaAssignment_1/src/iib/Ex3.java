package iib;

//since 2 obj are created twice output will print twice.
public class Ex3 {
	{// IIB
		System.out.println("from IIB");
	}

	public static void main(String[] args) {
		new Ex3();// object should be created
		// mandatorily to call the IIB
		new Ex3();// since 2 obj are created twice output will print twice.
	}
}
