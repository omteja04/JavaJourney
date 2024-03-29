package GUIFundamentals;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class JTableExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JTableExample");
        frame.setSize(400, 300);
        frame.setLayout(null);

        Object[][] data = { { "Blanche Hodges", 19, "Cadetger" }, { "Clayton Larson", 17, "Mabzowo" },
                { "Kate Parsons", 20, "Hapefduz" } };

        String[] columnNames = { "Name", "Age", "City" };
        // DefaultTableModel model = new DefaultTableModel(data, columnNames); // Editable
        DefaultTableModel model = new DefaultTableModel(data, columnNames) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Disable cell editing
            }
        };

        JTable table = new JTable(model);
        JScrollPane pane = new JScrollPane(table);
        frame.add(pane);
        pane.setBounds(20,20,300,65);

        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
