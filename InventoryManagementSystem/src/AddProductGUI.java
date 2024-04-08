
/**
 * Author: omteja04
 * Description: AddProductGUI
 */

import java.sql.Connection;

import javax.swing.JOptionPane;

public class AddProductGUI {
    

    public static void addProductDialogue() {
        Connection connection = DatabaseConnection.getConnection();
        String[] columnNames = DatabaseConnection.getColumnNames(connection, "product");
        String[] productData = new String[columnNames.length];
        for (int i = 0; i < columnNames.length; i++) {
            productData[i] = JOptionPane.showInputDialog("Enter The " + columnNames[i]);

        }
        AddProductDB.addProductDB(connection, columnNames, productData);
    }
}
