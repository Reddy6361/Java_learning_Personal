package coreJavaSessionTwentySix;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/*
 * Dynamically entering data to insert new data into SQL Database.
 * Note: use execute.update('"+var name+"');
 * */
public class Ex2 {
	static Connection con;
	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter your Name:");
			String name = scan.next();
			System.out.println("Enter your city:");
			String city = scan.next();
			System.out.println("Enter your email:");
			String email = scan.next();
			System.out.println("Enter your mobile number:");
			String mbNumber = scan.next();
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/4pm_demo_db_1", "root", "6361");
			Statement stmt = con.createStatement();
			stmt.executeUpdate("insert into registration values('" + name + "', '" + city + "', '" + email + "', '"
					+ mbNumber + "')");

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
