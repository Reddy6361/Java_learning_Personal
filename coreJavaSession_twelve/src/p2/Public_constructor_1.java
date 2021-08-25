package p2;
/*Main definition: if you make constructor public, then 
 * its object can be created anywhere in the program. */
public class Public_constructor_1 {
	public Public_constructor_1() {
		System.out.println(100);
	}

	public static void main(String[] args) {
		new Public_constructor_1();
	}
}
