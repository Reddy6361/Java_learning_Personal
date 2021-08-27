package p1;

import java.util.Scanner;

/*
 * Scanner Class:
 * 1) to give user input.
 * */
public class Ex12 {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter your Name");
			String name = scan.next();
			System.out.println("your name is :" + name);
			System.out.println("Enter your age");
			int age = scan.nextInt();
			System.out.println("your age is :" + age);
			System.out.println("Enter your weight");
			float weight = scan.nextFloat();
			System.out.println("your weight is :" + weight);
			System.out.println("plant is green in color");
			boolean bool = scan.nextBoolean();
			System.out.println("plant color is green is :" + bool);
			scan.nextLine();
			System.out.println("Describe yourself");
			String desc = scan.nextLine();
			System.out.println("yourself :" + desc);
		}

	}
}
