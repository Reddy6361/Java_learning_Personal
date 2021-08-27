package p1;

import java.util.Scanner;

/* BANK LOGIC*/
public class Ex13 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.println("Enter your pin number");
			int pinnumber = scan.nextInt();
			if (pinnumber == 12345) {
				System.out.println("welcome");
				break;
			} else {
				System.out.println("invalid pin number");
				if (i == 2) {
					System.out.println("card blocked");
				}
			}
		}
	}
}
