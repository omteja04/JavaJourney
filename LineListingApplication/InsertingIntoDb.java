/**
 * Author: omteja04
 * Description: InsertingIntoDb
 */

package LineListingApplication;

import java.sql.*;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class InsertingIntoDb {
    static Connection connection;
    static Statement statement;

    private void dbConnect(String url, String username, String password, String dataBase) throws SQLException {
        connection = DriverManager.getConnection(url + dataBase, username, password);
    }

    public void insertDB(ArrayList<String> valueList) {

        try {
            dbConnect("jdbc:mysql://localhost:3306/", "omteja", "teja1234", "mom");
            // if (connection != null) {
            // JOptionPane.showMessageDialog(null, "Successfully Connected", "Success",
            // JOptionPane.INFORMATION_MESSAGE);
            // }
            DatabaseMetaData metaData = connection.getMetaData();

            String tableName = "line_listing";
            ResultSet columns = metaData.getColumns(null, null, tableName, null);

            ArrayList<String> columnNames = new ArrayList<>();
            while (columns.next()) {
                String columnName = columns.getString("COLUMN_NAME");
                columnNames.add(columnName);
            }

            // Construct the INSERT query
            StringBuilder query = new StringBuilder("INSERT INTO ");
            query.append(tableName).append(" (");
            for (String columnName : columnNames) {
                query.append(columnName).append(", ");
            }
            query.delete(query.length() - 2, query.length()); // Remove the last comma and space
            query.append(") VALUES (");
            for (String value : valueList) {
                query.append("'").append(value).append("', ");
            }
            query.deleteCharAt(query.length() - 2); // Remove the last comma and space
            query.append(");");
            statement = connection.createStatement();
            int rowsAffected = statement.executeUpdate(query.toString());

            int choice = JOptionPane.showConfirmDialog(null,
                    rowsAffected + " rows affected.\n Do You Want To Generate CSV", "Success",
                    JOptionPane.YES_NO_OPTION);
            if (choice == JOptionPane.YES_OPTION) {
                csv(columnNames, valueList);
            }

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, e.getMessage(), "Oops!!!", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void csv(ArrayList<String> headers, ArrayList<String> data) {
        String fileName = JOptionPane.showInputDialog(null, "Save As : ", "FileName", JOptionPane.QUESTION_MESSAGE);
        if (fileName != null) {
            CSVGenerator.generateCSV(fileName + ".csv", headers, data);
        } else {
            JOptionPane.showMessageDialog(null, "Generating CSV Unsuccessful", "Error", JOptionPane.ERROR_MESSAGE);
            ;
        }
    }
}
