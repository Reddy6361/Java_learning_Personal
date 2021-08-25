// There are three ways we can accept static variables, as shown in below program.
public class Ex7 {
	static int weight = 40;

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		System.out.println(Ex7.weight);// accepted to access static variables.
		System.out.println(weight);// even this is accepted to access static variables.
		
		//never do this//
		Ex7 ex = new Ex7();
		System.out.println(ex.weight);// it will give warning but no error , compiler will convert this ex.weight ->
										// Ex7.weight// this is a very bad practice to access static variables.

	}
}
