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

    /**
     * The main function connects to a database, initializes the GUI, adds items to
     * a column combo box,
     * and handles a fetch button click event.
     */
    public static void main(String[] args) {
        connectToDatabase();
        initializeGUI();
        addToColumnComboBox();
        fetchButtonClicked();
    }

    /**
     * The function `connectToDatabase` establishes a connection to a MySQL database
     * using JDBC with
     * specified URL, username, and password.
     */
    public static void connectToDatabase() {
        try {
            String url = "jdbc:mysql://localhost:3306/jdbc_temp";
            String username = "omteja";
            String password = "teja1234";

            connection = DriverManager.getConnection(url, username, password);

            if (connection != null) {
                JOptionPane.showMessageDialog(null, "Successfully connected to the database", "Success ",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException e) {
            System.out.println("Error connecting to the database: " + e.getMessage());
        }
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    // The `initializeGUI()` method in the provided Java code is responsible for
    // setting up the
    // graphical user interface (GUI) components for the BookStore application.
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

    /**
     * The function `addToColumnComboBox` retrieves column names from a database
     * table and populates a
     * combo box with them, allowing users to select a column and trigger the
     * population of another
     * combo box with data related to the selected column.
     */
    public static void addToColumnComboBox() {
        try {
            statement = connection.createStatement();
            // The line `DatabaseMetaData metaData = connection.getMetaData();` is
            // retrieving the metadata of the
            // database connected through the `connection` object.
            DatabaseMetaData metaData = connection.getMetaData();
            // The line `resultSet = metaData.getColumns(null, null, "book_store", null);`
            // is retrieving the
            // metadata of the database table named "book_store". Specifically, it fetches
            // information about the
            // columns in the "book_store" table such as column names, data types, and other
            // properties. This
            // information is then used to populate the `columnComboBox` with the names of
            // the columns in the
            // "book_store" table, allowing users to select a column for further data
            // manipulation in the
            // application.
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

    /**
     * The function `populateColumnDataComboBox` populates a combo box with distinct
     * values from a
     * specified column in a database table.
     * 
     * @param selectedColumn The `selectedColumn` parameter is a String that
     *                       represents the name of the
     *                       column in a database table from which you want to
     *                       populate data into a JComboBox.
     */
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

    /**
     * The fetchButtonClicked function adds an ActionListener to a button that
     * retrieves selected data
     * from combo boxes and generates details based on the selected data.
     */
    public static void fetchButtonClicked() {
        fetchButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedColumn = (String) columnComboBox.getSelectedItem();
                String selectedData = (String) columnDataComboBox.getSelectedItem();
                // JOptionPane.showMessageDialog(null, selectedData, "",
                // JOptionPane.INFORMATION_MESSAGE);
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

    /**
     * The function `generateDetails` retrieves data from a database table based on
     * a selected column
     * and data value, populates a table model with the results, and handles any SQL
     * exceptions.
     * 
     * @param selectedColumn The `selectedColumn` parameter in the `generateDetails`
     *                       method represents
     *                       the column in the database table `book_store` that you
     *                       want to use as a filter condition. This
     *                       method retrieves data from the `book_store` table based
     *                       on the value provided in the
     *                       `selectedData` parameter for the specified
     * @param selectedData   The `selectedData` parameter in the `generateDetails`
     *                       method represents the
     *                       value that you want to use as a filter when querying
     *                       the database. This value will be used in
     *                       the SQL query to retrieve data from the `book_store`
     *                       table based on a specific column (specified
     *                       by the `selectedColumn
     */
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
