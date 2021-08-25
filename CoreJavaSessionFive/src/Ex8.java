/*
 * static variable name and local variable names can be same but when we should know the imp thing which is shown below. */
public class Ex8 {
	static int age = 30;// static variable

	public static void main(String[] args) {
		int age = 50; // even local variable name can be same as static variable.

		System.out.println(age);// IMPORTANAT only local variable is given preference if we access like this

		// in case if we need to access the static variable in particular we have to do
		// the below thing shown

		System.out.println(Ex8.age);//accessing static variable in particular, when local variable has same name as that of the static variable.
	}
}
