// how we can access local variables.
public class Ex3 {
public static void main(String[] args) {
	Ex3 ex3 = new Ex3();
	ex3.test1();
//	System.out.println(age); we cannot access here since the variable is created in test1()//method.//error
}

public void test1() {
int age =30;
System.out.println(age);//we can access here because age is created inside test1 method.
}
}
