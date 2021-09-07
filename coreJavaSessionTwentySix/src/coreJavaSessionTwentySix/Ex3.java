package coreJavaSessionTwentySix;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/*
 * Dynamically entering data to Delete Data from SQL Database.
 * Note: use execute.update('"+var name+"');
 * */
public class Ex3 {
	static Connection con;
	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(System.in);

			System.out.println("Enter your email which you want to delete data:");
			String email = scan.next();

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/4pm_demo_db_1", "root", "6361");
			Statement stmt = con.createStatement();
			stmt.executeUpdate("delete from registration where email= '" + email + "'");

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
