package p1;

//continuation of Ex8
public class Ex9 extends Ex8 {
	public static void main(String[] args) {
		Ex9 ex9 = new Ex9();
		ex9.setAge(200);
		ex9.setName("pankaj");
		int age = ex9.getAge();
		String name = ex9.getName();
		System.out.println(age);
		System.out.println(name);
	}
}
