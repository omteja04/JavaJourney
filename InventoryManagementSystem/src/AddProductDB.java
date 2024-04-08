
/**
 * Author: omteja04
 * Description: AddProductDB
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class AddProductDB {

    public static void addProductDB(Connection connection, String[] columnNames, String[] productData) {
        if (connection == null) {
            JOptionPane.showMessageDialog(null, "Database connection is null");
            return;
        }

        StringBuilder query = new StringBuilder("INSERT INTO ");
        query.append("product").append(" (");
        for (String columnName : columnNames) {
            query.append(columnName).append(", ");
        }
        query.delete(query.length() - 2, query.length()); // Remove the last comma and space
        query.append(") VALUES (");
        for (int i = 0; i < columnNames.length; i++) {
            query.append("?, ");
        }
        query.deleteCharAt(query.length() - 2); // Remove the last comma and space
        query.append(");");

        try (PreparedStatement statement = connection.prepareStatement(query.toString())) {
            for (int i = 0; i < productData.length; i++) {
                statement.setString(i + 1, productData[i]);
            }
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(null, "Product inserted successfully");
            } else {
                JOptionPane.showMessageDialog(null, "Failed to insert product");
            }
        } catch (SQLException e) {

            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error occurred while updating cost: " + e.getMessage());
        }

    }

}
