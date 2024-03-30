/**
 * Author: omteja04
 * Description: BookStoreUsingJTable
 */

package JDBC;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class BookStoreUsingJTable {
    static Connection connection;
    static Statement statement;

    static JComboBox<String> columnComboBox;
    static JComboBox<String> columnDataComboBox;
    static JScrollPane scrollPane;
    static DefaultTableModel model;
    static JTable table;
    static JButton fetchButton;
    static Font font = new Font("MV Boli", Font.BOLD, 16);
    static ResultSetMetaData metaData;
    static ResultSet resultSet;

    public static void main(String[] args) {
        connectToDatabase();
        initializeGUI();
        addToColumnComboBox();
        fetchButtonClicked();

    }

    public static void connectToDatabase() {
        try {
            String url = "jdbc:mysql://localhost:3306/jdbc_temp";
            String username = "omteja";
            String password = "teja1234";

            connection = DriverManager.getConnection(url, username, password);

            if (connection != null) {
                JOptionPane.showMessageDialog(null, "Successfully connected to the database", "Success ", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException e) {
            System.out.println("Error connecting to the database: " + e.getMessage());
        }
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void initializeGUI() {
        JFrame frame = new JFrame("BookStore");
        ImageIcon icon = new ImageIcon("E:\\PROGRAMS\\JAVA\\JDBC\\bookStore.png");
        frame.setIconImage(icon.getImage());
        frame.setSize(1100, 800);
        frame.setLayout(null);

        columnComboBox = new JComboBox();
        columnComboBox.setBounds(40, 100, 200, 40);
        columnComboBox.setFont(font);
        columnDataComboBox = new JComboBox();
        columnDataComboBox.setBounds(40, 200, 200, 40);
        columnDataComboBox.setFont(font);

        fetchButton = new JButton("Generate");
        fetchButton.setBounds(40, 280, 200, 40);
        fetchButton.setFont(font);

        model = new DefaultTableModel() {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        table = new JTable(model);

        scrollPane = new JScrollPane(table);
        scrollPane.setBounds(240, 40, 700, 400);

        frame.add(fetchButton);
        frame.add(scrollPane);
        frame.add(columnComboBox);
        frame.add(columnDataComboBox);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);
    }

    public static void addToColumnComboBox() {
        try {
            statement = connection.createStatement();
            DatabaseMetaData metaData = connection.getMetaData();
            resultSet = metaData.getColumns(null, null, "book_store", null);
            while (resultSet.next()) {
                columnComboBox.addItem(resultSet.getString("COLUMN_NAME"));
            }

            columnComboBox.setSelectedIndex(-1);
        } catch (SQLException e) {
            System.out.println(e);
        }

        columnComboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedColumn = (String) columnComboBox.getSelectedItem();
                populateColumnDataComboBox(selectedColumn); // Populate data combo box
            }
        });
    }

    public static void populateColumnDataComboBox(String selectedColumn) {
        columnDataComboBox.removeAllItems();
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(
                    "SELECT DISTINCT " + selectedColumn + " FROM book_store ORDER BY " + selectedColumn + " ;");
            while (resultSet.next()) {
                columnDataComboBox.addItem(resultSet.getString(1));
            }
            columnDataComboBox.setSelectedIndex(-1);
        } catch (SQLException e) {
            System.out.println("Error : " + e.getMessage());
        }
    }

    public static void fetchButtonClicked() {
        fetchButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedColumn = (String) columnComboBox.getSelectedItem();
                String selectedData = (String) columnDataComboBox.getSelectedItem();
                // JOptionPane.showMessageDialog(null, selectedData, "", JOptionPane.INFORMATION_MESSAGE);
                if (selectedData != null && selectedColumn != null) {
                    generateDetails(selectedColumn, selectedData);
                } else {
                    // Handle the case where no data is selected
                    JOptionPane.showMessageDialog(null, "Please select the combo box.", "Oops",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    public static void generateDetails(String selectedColumn, String selectedData) {
        model.setRowCount(0);
        model.setColumnCount(0);

        try {
            statement = connection.createStatement();

            resultSet = statement
                    .executeQuery("SELECT * FROM book_store WHERE " + selectedColumn + "= '" + selectedData + "'");
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
        } catch (SQLException e) {
            System.out.println("Error : " + e.getMessage());
        }

    }
}
