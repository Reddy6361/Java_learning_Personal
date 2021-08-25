package p1;

/*when there are several objects created in same class then this keyword will 
 * select objects based on which is executing at that point of time, and when 
 * there are no objects for this keyword to point then it will go back to 
 * first object */
/*1) this keyword points to current object running in the program.*/
public class Ex1 {
	public static void main(String[] args) {
		Ex1 ex1 = new Ex1();
		System.out.println(ex1);
		ex1.test();
		System.out.println("-----------------------");
		Ex1 ex12 = new Ex1();
		System.out.println(ex12);
		ex12.test();
	}

	public void test() {
		System.out.println(this);
	}
}
