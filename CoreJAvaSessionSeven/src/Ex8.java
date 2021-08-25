/*CONSTRUCTOR:
 * 1) It should have same name as  that of Class
 * 2) Every time we create an object a constructor is called.
 * 
 * 
 * */
public class Ex8 {
	// constructor start
	Ex8() {// constructor should have the same name as that of the class its mandatory.
		System.out.println(100);
	}

	// constructor end
	// main method start
	public static void main(String[] args) {
		new Ex8();// 1st time, every time we create an object constructor is called.
		new Ex8();// 2nd time object created so 2 times constructor is called.
	}
	// main method end
}
