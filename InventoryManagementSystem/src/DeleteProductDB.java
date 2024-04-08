import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class DeleteProductDB {

    public static void deleteProductDB(Connection connection, String productID) {

        try {

            if (connection == null) {
                throw new IllegalArgumentException("Database connection is null");
            }

            if (productID == null || productID.isEmpty()) {
                throw new IllegalArgumentException("Product ID is null or empty");
            }

            String deleteQuery = "DELETE FROM product WHERE pid = ?";
            try (PreparedStatement deleteStatement = connection.prepareStatement(deleteQuery)) {
                deleteStatement.setString(1, productID);
                int rowsAffected = deleteStatement.executeUpdate();
                if (rowsAffected > 0) {

                    JOptionPane.showMessageDialog(null, "Product deleted successfully.");

                } else {

                    JOptionPane.showMessageDialog(null, "Product not found or no changes made.");

                }

            }
        } catch (SQLException e) {

            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error occurred while deleting product: " + e.getMessage());
        } catch (IllegalArgumentException e) {

            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

}
