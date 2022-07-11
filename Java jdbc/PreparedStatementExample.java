import java.sql.*;
import java.util.Scanner;

public class PreparedStatementExample {

    PreparedStatement pstmt;
    public static Connection con;

    public static  void printTable() throws SQLException{
        PreparedStatement printTbl;

        String query = "SELECT * FROM emplo";
      
            System.out.println("\n\nPrinting Table : \n");
            printTbl = PreparedStatementExample.con.prepareStatement(query);

            ResultSet rs = printTbl.executeQuery();

            System.out.println("EMP_ID\tNAME\tSALARY");
            while (rs.next()) {
                int roll = rs.getInt(1);
                String name = rs.getString(2);
                int mark = rs.getInt(3);
                System.out.println(roll + "\t" + name + "\t" + mark);
            }
            System.out.println("\n");
            printTbl.close();
    }

    public static void insertInTable(int id, String name, int salary) throws SQLException {
        PreparedStatement insertTbl;

        String query = "INSERT INTO emplo VALUES(?,?,?)";
     

            insertTbl = PreparedStatementExample.con.prepareStatement(query);

            insertTbl.setInt(1, id);
            insertTbl.setString(2, name);
            insertTbl.setInt(3, salary);

            int i = insertTbl.executeUpdate();

            insertTbl.close();
    }

    public static void updateTable(int roll, int marks) throws SQLException{
        PreparedStatement updateTbl;

        String query = "update emplo set emp_sal=? where emp_id=? ";
       
            updateTbl = PreparedStatementExample.con.prepareStatement(query);

            updateTbl.setInt(1, marks);

            updateTbl.setInt(2, roll);

            int i = updateTbl.executeUpdate();
            updateTbl.close();

    }

    public static void deleteData(int roll) {
        PreparedStatement delete;

        String query = "delete from emplo where emp_id = ?";
        try {
            delete = PreparedStatementExample.con.prepareStatement(query);

            delete.setInt(1, roll);

            int i = delete.executeUpdate();

            delete.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void main(String args[]) {
       
            Scanner sc = new Scanner(System.in);
            Class.forName("com.mysql.cj.jdbc.Driver");
            PreparedStatementExample.con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javajdbc", "root",
                    "password");

            while (true) {
                System.out
                        .println("1. Print table\n2. Insert table\n3. Update Data(salary)\n4. Delete Data\n5. Exit\n");
                        
                int i = sc.nextInt();
                int emp_id, salary;
                String name;
                switch (i) {
                    case 1:
                    PreparedStatementExample.printTable();
                        break;

                    case 2:
                        System.out.println("Enter Employee ID");
                        emp_id = sc.nextInt();
                        System.out.println("\nEnter name");
                        name = sc.next();
                        System.out.println("\nEnter Salary");
                        salary = sc.nextInt();
                        pd.insertInTable(emp_id, name, salary);
                        pd.printTable();
                        break;

                    case 3:
                        System.out.println("Enter Employee ID");
                        emp_id = sc.nextInt();
                        System.out.println("\nEnter Salary");
                        salary = sc.nextInt();
                        PreparedStatementExample.updateTable(emp_id, salary);
                        PreparedStatementExample.printTable();
                        break;

                    case 4:
                        System.out.println("Enter Employee ID");
                        emp_id = sc.nextInt();
                        PreparedStatementExample.deleteData(emp_id);
                        PreparedStatementExample.printTable();
                        break;

                    case 5:
                        break;

                    default:
                        break;
                }
            }
    }
}
