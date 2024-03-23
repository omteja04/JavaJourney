/**
 * Author: omteja04
 * Description: DbConnectQueryGUI
 */

package JDBC;

import java.sql.*;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class DbConnectQueryGUI {
    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost:3306/jdbc_temp";
            String username = "root";
            String password = "teja1234";

            Connection con = DriverManager.getConnection(url, username, password);

            if (con != null) {
                System.out.println("Successfully connected");
            }

            Statement st = con.createStatement();

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the no of insertions: ");
            int n = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                String id = JOptionPane.showInputDialog(null, "Enter id of Employee");
                String name = JOptionPane.showInputDialog(null, "Enter Name of Employee " + ":");
                String salary = JOptionPane.showInputDialog(null, "Enter Salary of Employee " + ":");

                String query = "INSERT INTO employee VALUES (" + id + ",'" + name + "'," + salary + ")";
                st.executeUpdate(query);
            }

            sc.close();
            System.out.println("Data inserted successfully!");

        } catch (SQLException e) {
            System.out.println(e);
        }

    }
}
