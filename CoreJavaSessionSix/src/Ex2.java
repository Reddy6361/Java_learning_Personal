//long: when we exceed the integer range we terminate with l or else l as suffix is not needed
//float: terminated with f
//char: should always be stored in ''.

public class Ex2 {
public static void main(String[] args) {
	String s= "hello";
	char c='a';
	int a= 20;
	long l = 6361317502l;// if it exceeds the int range then only       we have to end it with l.
	long l2 =10;
	float f=20.54f;
	double d=287.98;
	boolean b = true;
	System.out.println(s);
	System.out.println(c);
	System.out.println(a);
	System.out.println(l);
	System.out.println(l2);
	System.out.println(f);
	System.out.println(d);
	System.out.println(b);
}
	
}
