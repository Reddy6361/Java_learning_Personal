// continuation of Ex10

// Note: method name and class name can be same and wont give error until it has same arguments if so it will give error, as shown below.
public class Ex11 {
	void Ex11() {// method not constructor.
		System.out.println(100);
	}

	public static void main(String[] args) {
		Ex11 ex = new Ex11();// object created but it wont call constructor as the above thing is void method
								// so never call the constructor with void as prefix.
		ex.Ex11();// we write this to access the non-static method.
	}
}
