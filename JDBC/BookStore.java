/**
 * Author: omteja04
 * Description: BookStore
 */

package JDBC;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class BookStore {
    static Connection connection;
    static Statement statement;

    @SuppressWarnings("rawtypes")
    static JComboBox comboBox;
    static JTextArea textArea;
    static JScrollPane scrollPane;
    static Font font = new Font("MV Boli", Font.BOLD, 16);

    // cSpell:disable
    public static void main(String[] args) {
        connectToDatabase();
        initializeGUI();
        addToComboBox();

    }

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

    @SuppressWarnings("rawtypes")
    public static void initializeGUI() {
        JFrame frame = new JFrame("BookStore");
        frame.setSize(1400, 1000);
        frame.setLayout(null);

        comboBox = new JComboBox();
        comboBox.setBounds(100, 100, 200, 40);
        comboBox.setFont(font);

        textArea = new JTextArea();
        textArea.setFont(font);

        scrollPane = new JScrollPane(textArea);
        scrollPane.setBounds(310, 100, 800, 500);

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
                    addDetailsToTextArea((String) comboBox.getSelectedItem());
                }
            });
            comboBox.setSelectedItem(null);
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        }
    }

    public static void addDetailsToTextArea(String authorName) {
        try {
            
            statement = connection.createStatement();
            
            ResultSet rs = statement.executeQuery("SELECT * FROM book_store WHERE author = '" + authorName + "'");
            ResultSetMetaData metaData = rs.getMetaData();
            
            int columnCount = metaData.getColumnCount();
            
            StringBuilder header = new StringBuilder();
            
            // Append column names
            for (int i = 1; i <= columnCount; i++) {
                header.append(metaData.getColumnName(i));
                if (i < columnCount) {
                    header.append("\t\t");
                }
            }
            header.append("\n\n");
            
            textArea.setText(header.toString());
            
            textArea.setText("");
            // Append data rows
            while (rs.next()) {
                StringBuilder sb = new StringBuilder();
                for (int i = 1; i <= columnCount; i++) {
                    sb.append(rs.getString(i));
                    if (i < columnCount) {
                        sb.append("\t  ");
                    }
                }
                textArea.append(sb.toString() + "\n");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

}
