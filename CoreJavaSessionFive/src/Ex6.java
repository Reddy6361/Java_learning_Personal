/*Static Variables:*These variables are created inside a class but outside method.
*We use static keyword to create these variable.
*It can be access anywhere in the program.
*It is similar to Global Variable;
*It is not Mandatory to initialize static variable, then it prints output Based on data type of static variable it will stored,for example: int-0, float-0.0, string-null. as shown in "Ex9.java" 
**/

public class Ex6 {
	static int age = 30;// static variable so that it can be access anywhere in the program. It is
						// similar to Global Variable.

	public static void main(String[] args) {// main method
		System.out.println(Ex6.age);
		Ex6.test();// calling static method.
	}

	public static void test() {// static method
		System.out.println(Ex6.age);
		Ex6 ex = new Ex6();
		ex.test1();// calling non static method.
	}

	public void test1() {// non static method.
		System.out.println(Ex6.age);// static members can be access anywhere.
	}
}
