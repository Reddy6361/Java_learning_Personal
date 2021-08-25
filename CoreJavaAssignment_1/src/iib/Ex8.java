package iib;

//Example represntation.
public class Ex8 {
	int i; // non static variable.
	{
		i = 30; // initialization of var inside IIB
		System.out.println(i);
	}

	public static void main(String[] args) {
		new Ex8();// object creation to call IIB
	}
}
