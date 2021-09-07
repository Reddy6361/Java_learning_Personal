package coreJavaSessionTwentySix;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/*
 * Dynamically entering data to update data into SQL Database.
 * Note: use execute.update('"+var name+"');
 * */
/*
 * C - Create
 * R - Retrieve
 * U - Update
 * D - Delete
 * */
public class Ex4 {
	static Connection con;
	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("to change mobile number Enter your email:");
			String email = scan.next();
			System.out.println("Enter your new mobile number:");
			String mbNumber = scan.next();
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/4pm_demo_db_1", "root", "6361");
			Statement stmt = con.createStatement();
			stmt.executeUpdate("UPDATE registration Set mobile = '"+mbNumber+"' where email='"+email+"'");
			System.out.println("mobile number Updated +91-"+mbNumber);
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
