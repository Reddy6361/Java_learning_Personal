package iib;

//Note: we have to create Obj mandatorily to call the IIB's.
public class Ex2 {
	{// IIB
		System.out.println("from IIB");
	}

	public static void main(String[] args) {
		new Ex2();// object should be created
		// mandatorily to call the IIB
	}
}
