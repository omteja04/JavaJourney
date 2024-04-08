
/**
 * Author: omteja04
 * Description: DatabaseConnection
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import java.sql.DatabaseMetaData;

public class DatabaseConnection {
    private static String url = "jdbc:mysql://localhost:3306/ims";
    private static String username = "omteja";
    private static String password = "teja1234";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Connection Failed", "Oops!",
                    JOptionPane.ERROR_MESSAGE);
        }
        return connection;
    }

    public static void closeConnection(Connection connection) {
        try {
            if (connection != null) {
                connection.close();
                JOptionPane.showMessageDialog(null, "Not CLosed", "Oops!",
                        JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static String[] getColumnNames(Connection connection, String tableName) {
        try {
            DatabaseMetaData metaData = connection.getMetaData();
            ResultSet resultSet = metaData.getColumns(null, null, tableName, null);
            ArrayList<String> columnNamesList = new ArrayList<>();
            while (resultSet.next()) {
                String columnName = resultSet.getString("COLUMN_NAME");
                columnNamesList.add(columnName);
            }
            resultSet.close();
            return columnNamesList.toArray(new String[0]);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
