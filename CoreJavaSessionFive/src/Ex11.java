/*non-static variable:1)non static variables are created outside methods and inside class without static keyword.
 * 2) These variables can never be accessed without creating object
 * 3) It is not mandatory to initialize non static variable , because depending on data-type default value gets stored in it, They are also called as instance variable.
 */
public class Ex11 {
	int age1;// Integer DT ->0
	float weight1;// float DT ->0.0
	String name1;// String Data Type -> null
	char ch1;// Character DT -> empty space
	boolean bool1; // Boolean DT -> false

	public static void main(String[] args) {
		Ex11 ex = new Ex11();
		System.out.println(ex.weight1);
		System.out.println(ex.age1);
		System.out.println(ex.name1);
		System.out.println(ex.ch1);
		System.out.println(ex.bool1);
	}

}
