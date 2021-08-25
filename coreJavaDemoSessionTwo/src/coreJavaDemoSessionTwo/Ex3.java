package coreJavaDemoSessionTwo;

//static variable : * they are created inside class but outside method using static keyword.
//*do not create object to access this static member, we access this directly with the class name.
//*static variable value can be changed  -> Ex3.x=50;
public class Ex3 {
	static int x = 30;

	public static void main(String[] args) {
		System.out.println(Ex3.x);// only access static members only by this method
		Ex3.x = 50;// changing static variables values
		System.out.println(Ex3.x); // it is permanently changed
	}
}
