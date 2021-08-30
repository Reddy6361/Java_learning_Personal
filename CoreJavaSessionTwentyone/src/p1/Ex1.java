package p1;

import java.util.Scanner;

/* bank logic example 2- with while loop*/
public class Ex1 {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			String condition = "yes";
			while (condition.equals("yes")) { // we don't know how many
				// iterations so we use while loop.
				System.out.println("enter the amount");
				int amount = scan.nextInt();
				System.out.println("please collect rs." + amount);
				System.out.println("Do you want continue(yes/no)");
				condition = scan.next(); // if we give yes loop will continue
				// if we give no loop will break.
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
