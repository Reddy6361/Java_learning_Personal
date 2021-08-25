package p2;
/*	Packages:
 * 1) helps us to resolve naming convention problem
 * */
public class B {
@SuppressWarnings("unused")
public static void main(String[] args) {
	p1.A a1 = new p1.A();// 2nd method to import other packages. this is use-full when 2 packages have class of same name we use this type of accessing (packagename.classname)
	p3.A a2= new p3.A(); 
}
}
