
/**
 * Author: omteja04
 * Description: ViewProductGUI
 */

import java.sql.Connection;

import javax.swing.JOptionPane;

public class ViewProductGUI {

    public static void viewProductDialogue(String pid) {
        Connection connection = DatabaseConnection.getConnection();
        String[] columnNames = DatabaseConnection.getColumnNames(connection, "product");
        String[] details = ViewProductDB.viewProductDetails(connection, pid);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < columnNames.length; i++) {
            stringBuilder.append(columnNames[i]).append(" : ").append(details[i]);
            if (i < columnNames.length - 1) {
                stringBuilder.append("\n");
            }
        }
        String detailsString = stringBuilder.toString();
        JOptionPane.showMessageDialog(null, detailsString, "Details of " + pid, JOptionPane.INFORMATION_MESSAGE);

    }
}
