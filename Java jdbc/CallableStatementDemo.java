import java.sql.*;
import java.util.Scanner;

public class CallableStatementDemo {
	public static Connection con;
	static String query = "{call max_mark_of_stud()}";

	public static void main(String agrs[]) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javajdbc", "root", "password");

		CallableStatement stmt = con.prepareCall(query);
		System.out.println("Executing...");
		stmt.execute();

		ResultSet rs = stmt.getResultSet();

		System.out.println("RollNo\tName\tMarks");
		while (rs.next()) {
			int emp_id = rs.getInt(1);
			String emp_name = rs.getString(2);
			int emp_salary = rs.getInt(3);
			System.out.println(emp_id + "\t" + emp_name + "\t" + emp_salary);
		}
		System.out.println("\n");

		query = "{call total_stud(?)}";
		stmt = con.prepareCall(query);
		stmt.registerOutParameter(1, Types.INTEGER);
		System.out.println("Executing...");
		stmt.execute();

		System.out.println("Total count of student in class " + stmt.getInt(1));
		System.out.println("\n");

		query = "{call marks_stud(?,?)}";
		stmt = con.prepareCall(query);
		System.out.println("Enter Roll no");
		int ch = sc.nextInt();

		stmt.setInt(1, ch);
		stmt.registerOutParameter(2, Types.INTEGER);
		System.out.println("Executing...");
		stmt.execute();

		System.out.println("Marks of student " + ch + " : " + stmt.getInt(2));
		System.out.println("\n");

	}

}
