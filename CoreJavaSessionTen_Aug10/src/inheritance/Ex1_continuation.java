package inheritance;

// NOTE: only one class should have public when they are created in same file, and which is public should be name of class main interview question.
/*Extends: is a keyword which helps us to inherit*/
public class Ex1_continuation extends Ex1 {// child class //replicating which are present in parent class to child name.
// it is not moved they are copied.
	public static void main(String[] args) {
		Ex1_continuation ex = new Ex1_continuation();// object stores all the non static variables from both parent and
// class name
		System.out.println(ex.x);
	}
}
