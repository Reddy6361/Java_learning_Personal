package sib;
/* SIB can only store static variables if non static 
 * variables are initialized in SIB then it will give an error*/
public class Ex3 {
	static int i;
	int x ;
	static { // syntax of SIB, starts with a prefix of static.
		i =20;
		System.out.println(i);
		//x=30;// we cannot initialize non-static variables inside 
		//SIB it will give error.
	}

	public static void main(String[] args) { 
		System.out.println("from main");
	}
}
