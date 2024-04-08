
/**
 * Author: omteja04
 * Description: ListAllProductsTableModel
 */
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class ListAllProductsTableModel {
    public static void listAllProductsTableModel(DefaultTableModel model, String tableName) {
        try (Connection connection = DatabaseConnection.getConnection();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT * FROM " + tableName)) {

            String[] columnNames = DatabaseConnection.getColumnNames(connection, tableName);
            model.setColumnIdentifiers(columnNames); // Set column names to existing model

            // Populate data
            while (resultSet.next()) {
                Object[] row = new Object[columnNames.length];
                for (int i = 0; i < columnNames.length; i++) {
                    row[i] = resultSet.getObject(columnNames[i]);
                }
                model.addRow(row);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
