/**
 * Author: omteja04
 * Description: DbConnection
 */

package JDBC;

import java.sql.*;

public class DbConnection {
    public static void main(String[] args) {
        /**
         * NOTE - Connect the database
         * URL , username , password
         */
        try {
            String url = "jdbc:mysql://localhost:3306/jdbc_temp";
            String user = "omteja";
            String password = "teja1234";



            // This line of code is establishing a connection to a database using JDBC
            Connection con = DriverManager.getConnection(url, user, password);
            if (con != null) {
                System.out.println("Successfully connected");
            }

        } catch (SQLException e) {
            System.out.println(e);
        }

    }
}
