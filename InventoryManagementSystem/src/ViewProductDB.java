import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ViewProductDB {

    public static String[] viewProductDetails(Connection connection, String pid) {
        if (connection == null) {
            JOptionPane.showMessageDialog(null, "Database connection is null");
        }
        String productDetailsStatement = "SELECT * FROM product WHERE pid = ?";

        try (PreparedStatement statement = connection.prepareStatement(productDetailsStatement)) {
            statement.setString(1, pid);
            ResultSet resultSet = statement.executeQuery();
            String[] columnNames = DatabaseConnection.getColumnNames(connection, "product");
            int columnNamesCount = columnNames.length;
            if (resultSet.next()) {

                String[] productDetails = new String[columnNamesCount];

                for (int i = 0; i < columnNamesCount; i++) {
                    productDetails[i] = resultSet.getString(columnNames[i]);
                }
                return productDetails;
            } else {
                JOptionPane.showMessageDialog(null, "Product not found");
                return null;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }

    }

}
