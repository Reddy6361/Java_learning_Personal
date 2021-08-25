package polymorphism;
//overriding
public class Ex1_1 extends Ex1 {
	public void test() { // here overriding is happening. here the copy is not taking place, here test method is taking 2 forms that is called as polymorphism
		System.out.println(200);
	}
public static void main(String[] args) {
	Ex1_1 ex = new Ex1_1();
	ex.test();
}
}
