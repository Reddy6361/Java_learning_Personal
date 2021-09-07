package coreJavaSessionTwentySix;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/* Retrieving Data From MYSQL*/
/*
 * Note:
 * 1) insert, update, delete --> .executeUpdate();
 * 2)read/select --> .executeQuery();
 * */
public class Ex1 {
	static Connection con;
	public static void main(String[] args) {
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/4pm_demo_db_1", "root", "6361");
			Statement stmt = con.createStatement();
			ResultSet result = stmt.executeQuery("SELECT * from registration");
			while (result.next()) {
				System.out.println(result.getString(1));// 1st cell data
				System.out.println(result.getString(2));// 2nd cell data
				System.out.println(result.getString(3));// 3rd cell data
				System.out.println(result.getString(4));// 4th cell data
			}
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
