package JDBC;

import java.sql.*;

public class DbConnectSelectQuery {
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
            ResultSet rs = st.executeQuery("SELECT * FROM employee");
            while (rs.next()) {
                System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t" +rs.getString(3));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

    }
}
