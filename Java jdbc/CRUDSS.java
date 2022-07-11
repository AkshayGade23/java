import java.sql.*;
import java.util.Scanner;

public class CRUDSS {
	public static Connection con;
	static int ch;
	static String selectQ = "SELECT * FROM employee";
	static String eid, ename, esalary;

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		CRUDSS.con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javajdbc", "root", "password");
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println(
					" 1. create employee \n 2. update employee info \n 3. delete employee \n 0. Exit \n enter your choice: ");

			ch = sc.nextInt();
			switch (ch) {
				case 1:
					createEmp();
					break;
				case 2:
					updateEmp();
					break;
				case 3:
					deleteEmp();
					break;
				case 0:
					System.exit(0);
				default:
					System.out.println("Invalid choice! Please make a valid choice. \n\n");
			}
		}
	}

	private static void createEmp() throws SQLException, ClassNotFoundException {
		ResultSet rs;
		String insertQ = "INSERT INTO employee VALUES ('104','Rupesh','90000')";

		// obtain a statement
		Statement st = con.createStatement();
		rs = st.executeQuery(selectQ);
		System.out.println("Employee table before Insertion");
		System.out.println("EmpId \t Empname \t EmpSalary");
		while (rs.next()) {
			eid = rs.getString(1);
			ename = rs.getString(2);
			esalary = rs.getString(3);
			System.out.println(eid + "\t" + ename + "\t" + esalary);
		}
		int exeUpdate = st.executeUpdate(insertQ);
		if (exeUpdate == 1) {
			System.out.println("1 row inserted");
		}
		rs = st.executeQuery(selectQ);
		System.out.println("Employee table after Insertion");
		System.out.println("EmpId \t Empname \t EmpSalary");
		while (rs.next()) {
			eid = rs.getString(1);
			ename = rs.getString(2);
			esalary = rs.getString(3);
			System.out.println(eid + "\t" + ename + "\t" + esalary);
		}
		
	}

	private static void updateEmp() throws SQLException, ClassNotFoundException {
		ResultSet rs;
		String updateQ = "UPDATE employee SET emp_sal= '120000' WHERE emp_id = '104'";

		// obtain a statement
		Statement st = con.createStatement();
		rs = st.executeQuery(selectQ);
		System.out.println("Employee table before Updation");
		System.out.println("EmpId \t Empname \t EmpSalary");
		while (rs.next()) {
			eid = rs.getString(1);
			ename = rs.getString(2);
			esalary = rs.getString(3);
			System.out.println(eid + "\t" + ename + "\t" + esalary);
		}
		int exeUpdate1 = st.executeUpdate(updateQ);
		if (exeUpdate1 == 1) {
			System.out.println("1 row updated");
		}
		rs = st.executeQuery(selectQ);
		System.out.println("Employee table after Updation");
		System.out.println("EmpId \t Empname \t EmpSalary");
		while (rs.next()) {
			eid = rs.getString(1);
			ename = rs.getString(2);
			esalary = rs.getString(3);
			System.out.println(eid + "\t" + ename + "\t" + esalary);
		}
		
	}

	private static void deleteEmp() throws SQLException, ClassNotFoundException {
		ResultSet rs;
		String deleteQ = " 	DELETE FROM employee WHERE emp_id = '102'";

		// obtain a statement
		Statement st = con.createStatement();
		rs = st.executeQuery(selectQ);
		System.out.println("Employee table before deletion");
		System.out.println("EmpId \t Empname \t EmpSalary");
		while (rs.next()) {
			eid = rs.getString(1);
			ename = rs.getString(2);
			esalary = rs.getString(3);
			System.out.println(eid + "\t" + ename + "\t" + esalary);
		}
		int exeUpdate1 = st.executeUpdate(deleteQ);
		if (exeUpdate1 == 1) {
			System.out.println("Employee is deleted");
		}
		rs = st.executeQuery(selectQ);
		System.out.println("Employee table after deletion");
		System.out.println("EmpId \t Empname \t EmpSalary");
		while (rs.next()) {
			eid = rs.getString(1);
			ename = rs.getString(2);
			esalary = rs.getString(3);
			System.out.println(eid + "\t" + ename + "\t" + esalary);
		}
		
	}
}
