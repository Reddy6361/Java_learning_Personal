package p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * 1) Inserting Data Into SQL using JDBC:
 * */
public class Ex1 {
	public static void main(String[] args) {
		try {
			// connect to database
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/4pm_demo_db_1", "root", "6361");

			// insert into record or creating SQL query
			Statement stmt = con.createStatement();
			stmt.executeUpdate("insert into registration values('yog', 'mangalore', 'yog@gmail.com', '9986410880')");
			con.close(); // closes connection after updating
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
