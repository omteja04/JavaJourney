/**
 * Author: omteja04
 * Description: DbConnectQueries
 */

package JDBC;

import java.sql.*;

public class DbConnectQueries {
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
            st.executeUpdate("insert into employee values(4,'Warren Thornton','586443')");

            System.out.println();
        } catch (SQLException e) {
            System.out.println(e);
        }

    }
}
