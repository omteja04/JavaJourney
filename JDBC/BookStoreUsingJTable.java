/**
 * Author: omteja04
 * Description: BookStore
 */

package JDBC;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

public class BookStoreUsingJTable {
    static Connection connection;
    static Statement statement;

    @SuppressWarnings("rawtypes")
    static JComboBox comboBox;
    static JTextArea textArea;
    static JScrollPane scrollPane;
    static DefaultTableModel model;
    static JTable table;
    static Font font = new Font("MV Boli", Font.BOLD, 16);

    // cSpell:disable
    public static void main(String[] args) {
        connectToDatabase();
        initializeGUI();
        addToComboBox();
        // actionListeners();

    }

    public static void connectToDatabase() {
        try {
            String url = "jdbc:mysql://localhost:3306/jdbc_temp";
            String username = "omteja";
            String password = "teja1234";

            connection = DriverManager.getConnection(url, username, password);

            if (connection != null) {
                System.out.println("Successfully connected to the database");
            }
        } catch (SQLException e) {
            System.out.println("Error connecting to the database: " + e.getMessage());
        }
    }

    @SuppressWarnings("rawtypes")
    public static void initializeGUI() {
        JFrame frame = new JFrame("BookStore");
        ImageIcon icon = new ImageIcon("E:\\PROGRAMS\\JAVA\\JDBC\\bookStore.png");
        frame.setIconImage(icon.getImage());
        frame.setSize(1100, 800);
        frame.setLayout(null);

        comboBox = new JComboBox();
        comboBox.setBounds(40, 200, 200, 40);
        comboBox.setFont(font);
        model = new DefaultTableModel() {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        table = new JTable(model);

        scrollPane = new JScrollPane(table);
        scrollPane.setBounds(240, 40, 700, 400);

        frame.add(scrollPane);
        frame.add(comboBox);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);
    }

    // cSpell:enable
    @SuppressWarnings("unchecked")
    public static void addToComboBox() {
        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT DISTINCT(author) FROM book_store;");
            while (resultSet.next()) {
                comboBox.addItem(resultSet.getString(1));
            }
            comboBox.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    generateDetails((String) comboBox.getSelectedItem());
                }
            });
            comboBox.setSelectedItem(null);
        } catch (SQLException e) {
            System.out.println("Error : " + e.getMessage());
        }
    }

    public static void generateDetails(String authorName) {
        model.setRowCount(0);
        model.setColumnCount(0);

        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement
                    .executeQuery("SELECT * FROM book_store WHERE author = '" + authorName + "'");
            ResultSetMetaData metaData = resultSet.getMetaData();
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
