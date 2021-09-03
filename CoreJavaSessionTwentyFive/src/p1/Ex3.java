package p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/* 
 * 3) Updating data Into SQL using JDBC:
 * */
public class Ex3 {
	public static void main(String[] args) {
		try {
			// connect to database
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/4pm_demo_db_1", "root", "6361");

			// insert into record or creating SQL query
			Statement stmt = con.createStatement();
			stmt.executeUpdate("UPDATE registration SET mobile= 6361317502 where email ='pankaj@gmail.com' "); // deletes data
			con.close(); // closes connection after updating
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
