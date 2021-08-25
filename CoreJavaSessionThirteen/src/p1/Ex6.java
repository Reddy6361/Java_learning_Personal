package p1;
/*Encapsulation:
 * 1) Bundling of data with the method it operates on it restricting
 *  direct access to that variable is called as encapsulation.
 * 2) to restrict direct access of the variable we make variable 
 * private to operate on those variables, we create
 * Publicly defined getters and setters.
 * 3) data hiding is the part of encapsulation.
 * */

public class Ex6 {
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
