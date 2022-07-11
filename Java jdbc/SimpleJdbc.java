import java.sql.*;

public class SimpleJdbc {

	public static void main(String ages[]) throws Exception {
		String query;
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javajdbc", "root", "password");

		Statement smt = con.createStatement();
		query = "CREATE TABLE emplo(emp_id INT,emp_name VARCHAR(30),emp_sal INT)";
		// int i = smt.executeUpdate(query);

		query = "INSERT INTO emplo VALUES(1004,'Madara',140000)";
		int i = smt.executeUpdate(query);

		query = "SELECT * FROM emplo";

		ResultSet rs = smt.executeQuery(query);

		System.out.println("RollNo\tName\tMarks");
		while (rs.next()) {
			int roll = rs.getInt(1);
			String name = rs.getString(2);
			int mark = rs.getInt(3);
			System.out.println(roll + "\t" + name + "\t" + mark);
		}

		smt.close();
		con.close();
	}

}
