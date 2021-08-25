//*Local Variable:  it should be created inside a method and can be used only within created method , outside created method these variables are not accessible hence below program throws an error.
public class Ex1 {
public static void main(String[] args) {
	int age =30;
	System.out.println(age);
	Ex1 ex = new Ex1();
	ex.test1();
}

public void test1() {
//System.out.println(age);//error	
}
}
