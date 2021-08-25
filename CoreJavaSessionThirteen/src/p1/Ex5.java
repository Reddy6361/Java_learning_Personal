package p1;

/*GETTERSS AND SETTERS*/
public class Ex5 {
	int age; // Shouldn't be initialize manually or by using iib,
	// only by method, getters and setters.

	public int getAge() { // getter
		return age;
	}

	public void setAge(int age) {// setter

		/* non static var with this keyword */ this.age = /* local var */age;
	}

	public static void main(String[] args) {
		Ex5 ex5 = new Ex5();
		ex5.setAge(20); // to set the value
		System.out.println(ex5.getAge());// to print the getter value
	}
}
