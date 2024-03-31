/**
 * Author: omteja04
 * Description: DLLGenerateData
 */

package LineListingApplication;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class DLLGenerateData extends JFrame {
    static JScrollPane scrollPane;
    static DefaultTableModel model;
    static JTable table;
    static ResultSetMetaData metaData;
    static ResultSet resultSet;
    static Connection connection;
    static Statement statement;
    Font font = new Font("Arial", Font.BOLD, 12);

    private void dbConnect(String url, String username, String password, String dataBase) throws SQLException {
        connection = DriverManager.getConnection(url + dataBase, username, password);
    }

    DLLGenerateData() {
        setTitle("Generate Data");
        setLayout(new BorderLayout());
        model = new DefaultTableModel() {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        table = new JTable(model);
        table.setFont(font);
        scrollPane = new JScrollPane(table);

        try {
            dbConnect("jdbc:mysql://localhost:3306/", "omteja", "teja1234", "mom");
            model.setRowCount(0);
            model.setColumnCount(0);
            statement = connection.createStatement();
            resultSet = statement
                    .executeQuery("SELECT * FROM line_listing;");
            metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();
            for (int i = 1; i <= columnCount; i++) {
                model.addColumn(metaData.getColumnLabel(i));
            }
            while (resultSet.next()) {
                Object[] row = new Object[columnCount];
                for (int i = 1; i <= columnCount; i++) {
                    row[i - 1] = resultSet.getObject(i);
                }
                model.addRow(row);
            }
            // Assuming `table` is your JTable instance

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, e.getMessage(), "Oops!!!", JOptionPane.ERROR_MESSAGE);
        }
        JButton generateCSVButton = new JButton("Generate CSV");
        generateCSVButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                generateCSV();
            }
        });

        add(scrollPane, BorderLayout.CENTER);
        add(generateCSVButton, BorderLayout.SOUTH);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int scrollPaneHeight = (int) (screenSize.height * 0.90);
        int scrollPaneWidth = (int) (screenSize.width);
        scrollPane.setPreferredSize(new Dimension(scrollPaneWidth, scrollPaneHeight));
        generateCSVButton.setPreferredSize(new Dimension(150, 50));
        pack(); // Pack the frame to fit its contents
        setLocationRelativeTo(null); // Center the frame on the screen
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setVisible(true);
    }

    private void generateCSV() {
        ArrayList<String> headers = new ArrayList<>();
        for (int i = 0; i < model.getColumnCount(); i++) {
            headers.add(model.getColumnName(i));
        }

        ArrayList<ArrayList<String>> data = new ArrayList<>();
        for (int i = 0; i < model.getRowCount(); i++) {
            ArrayList<String> rowData = new ArrayList<>();
            for (int j = 0; j < model.getColumnCount(); j++) {
                rowData.add(model.getValueAt(i, j).toString());
            }
            data.add(rowData);
        }

        String fileName = JOptionPane.showInputDialog(null, "Save As : ", "FileName", JOptionPane.QUESTION_MESSAGE);
        if (fileName != null) {
            CSVGenerator.generateCSVTable(fileName + ".csv", headers, data);
        } else {
            JOptionPane.showMessageDialog(null, "Generating CSV Unsuccessful", "Error", JOptionPane.ERROR_MESSAGE);
            ;
        }
    }

}
