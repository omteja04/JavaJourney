
/**
 * Author: omteja04
 * Description: DeleteProductGUI
 */
import java.sql.Connection;

import javax.swing.JOptionPane;

public class DeleteProductGUI {
    static String productID;

    public static void deleteProductDialogue() {
        Connection connection = DatabaseConnection.getConnection();
        if (connection != null) {
            productID = JOptionPane.showInputDialog("Enter The Product ID : ");
        }
        DeleteProductDB.deleteProductDB(connection, productID);
    }
}
