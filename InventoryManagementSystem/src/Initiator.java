import java.sql.Connection;

import javax.swing.JOptionPane;

/**
 * Author: omteja04
 * Description: Initiator
 */

public class Initiator {
    public static void main(String[] args) {
        Connection connection = DatabaseConnection.getConnection();
        if (connection != null) {
            JOptionPane.showMessageDialog(null, "Welcome To Inventory Management System", "Successfully Connected",
                    JOptionPane.INFORMATION_MESSAGE);
            new IMSHome();
        } else {
            JOptionPane.showMessageDialog(null, "Connection Failed", "Oops!",
                    JOptionPane.ERROR_MESSAGE);
        }

    }
}
