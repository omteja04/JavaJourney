/**
 * Author: omteja04
 * Description: IntegratingJDBCandGUI
 */

package JDBC;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class IntegratingJDBCandGUI {

    static Connection connection;
    static JComboBox<String> comboBox;
    static JTextArea textArea;
    static JScrollPane scrollPane;

    public static void main(String[] args) {
        connectToDatabase();
        initializeGUI();
        populateTableNames();
    }

    public static void initializeGUI() {
        JFrame frame = new JFrame("Integrating JDBC and GUI");
        frame.setSize(1000, 800);
        frame.setLayout(null);

        Font font = new Font("MV Boli", Font.BOLD, 20);

        comboBox = new JComboBox<>();
        comboBox.setBounds(100, 100, 200, 40);
        comboBox.setFont(font);

        comboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                selectTable((String) comboBox.getSelectedItem());
            }
        });

        textArea = new JTextArea();
        textArea.setFont(font);

        scrollPane = new JScrollPane(textArea);
        scrollPane.setBounds(310, 100, 500, 500);

        frame.add(comboBox);

        frame.add(scrollPane);

        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void connectToDatabase() {
        try {
            String url = "jdbc:mysql://localhost:3306/world";
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

    public static void populateTableNames() {

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SHOW tables;");
            while (resultSet.next()) {
                comboBox.addItem(resultSet.getString(1));
            }

        } catch (SQLException e) {
            System.out.println("Error populating table names: " + e.getMessage());
        }
    }

    public static void selectTable(String tableName) {
        try {
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT * FROM " + tableName + ";");
            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();

            Font font = new Font("MV Boli", Font.BOLD, 16);
            textArea.setFont(font);

            StringBuilder header = new StringBuilder();
            for (int i = 1; i <= columnCount; i++) {
                header.append(metaData.getColumnName(i));
                if (i < columnCount) {
                    header.append("\t");
                }
            }
            header.append("\n\n");

            textArea.setText(header.toString());

            while (resultSet.next()) {
                StringBuilder row = new StringBuilder();
                for (int i = 1; i <= columnCount; i++) {
                    row.append(resultSet.getString(i));
                    if (i < columnCount) {
                        row.append("\t");
                    }
                }
                textArea.append(row.toString() + "\n");
            }

        } catch (SQLException e) {
            System.out.println("Error selecting table: " + e.getMessage());
        }
    }
}
