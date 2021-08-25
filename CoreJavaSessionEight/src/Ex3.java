// if we create an object with a value, if constructor is not created it will give error, creating constructor here is mandatory.
public class Ex3 {
	Ex3(int i) {// mandatory creation of constructor with value or else it will give error.
		System.out.println(i);
	}

	public static void main(String[] args) {
		new Ex3(100);// object with value// if constructor is not created then it will give error.

	}
}
