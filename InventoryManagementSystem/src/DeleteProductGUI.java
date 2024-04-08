import java.sql.Connection;

import javax.swing.JOptionPane;

/**
 * Author: omteja04
 * Description: DeleteProductGUI
 */

public class DeleteProductGUI {
    static String productID;

    

    public static void deleteProductDialogue() {
        Connection connection = DatabaseConnection.getConnection();
        if (connection != null) {
            productID = JOptionPane.showInputDialog("Enter The Product ID : ");
        }
        DeleteProductDB.deleteProductDB(connection,productID);
    }
}
