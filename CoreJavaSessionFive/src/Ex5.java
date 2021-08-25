// while writing big numbers if it is difficult to read such as example (5000000) we can't put "," here so instead we can put "_" here to not give error as shown in bellow example.
public class Ex5 {
	public static void main(String[] args) {
		// int salary=50,00,000;// we can't put commas.
		int salary = 50_00_000;// we can write it this way to read it easily.
		System.out.println(salary);
	}
}
