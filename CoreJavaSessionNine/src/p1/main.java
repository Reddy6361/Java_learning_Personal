package p1;

/* Note:class name constructor name method name and variable name can be same as shown in the below example. 
 * */
public class main {
	main() {
		System.out.println(1000);
	}

	public static void main(String[] args) {
		int main = 10;
		main m = new main();
		System.out.println(main);
	}
}
