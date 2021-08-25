package p1;

import p2.Ex1p2; // we have to write it mandatorily.
import p3.p4.p5.A; // we have to write it mandatorily

/*CONTINUATION OF Ex5
 *continuation from package p2->Ex1p2-> import p2.Ex1p2;.
 * continuation from package p3.p4.p5->A-> import p3.p4.p5.A;.
 * */
public class Ex6 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Ex5 ex = new Ex5(); // object of Ex5 from same package p1, accessing in different class.
		Ex1p2 ex1 = new Ex1p2(); // object of Ex1p2 from different package p2, accessing in different class of
									// different package.
		A a = new A(); // object of A from different package p3.p4.p5, accessing in different class of
						// different package.
	}
}
