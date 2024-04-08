
/**
 * Author: omteja04
 * Description: IMSHome
 */
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IMSHome extends JFrame implements ActionListener {
    JLabel productIdLabel;
    JTextField productIdField;
    JButton viewProductButton;
    JButton listAllProductsButton;
    JButton addProductButton;
    JButton updateQuantityButton;
    JButton updateCostButton;
    JButton deleteProductButton;
    JButton exitButton;
    DefaultTableModel model;
    JTable table;
    JButton clearButton;
    JTable listAllProductsTable;
    JScrollPane scrollPane;
    JButton generateCSVButton;

    IMSHome() {
        setTitle("Inventory Management System");
        setSize(900, 700);
        setLayout(null);

        productIdLabel = new JLabel("Enter The Product ID : ");
        productIdLabel.setBounds(200, 60, 200, 30);

        productIdField = new JTextField();
        productIdField.setBounds(330, 60, 150, 30);
        productIdField.setFont(new Font("Arial", Font.BOLD, 16));

        viewProductButton = new JButton("View Product");
        viewProductButton.setBounds(495, 60, 150, 30);
        viewProductButton.addActionListener(this);

        listAllProductsButton = new JButton("List All Products");
        listAllProductsButton.setBounds(20, 110, 150, 30);
        listAllProductsButton.addActionListener(this);

        addProductButton = new JButton("Add Product");
        addProductButton.setBounds(175, 110, 150, 30);
        addProductButton.addActionListener(this);

        updateQuantityButton = new JButton("Update Quantity");
        updateQuantityButton.setBounds(330, 110, 150, 30);
        updateQuantityButton.addActionListener(this);

        updateCostButton = new JButton("Update Cost");
        updateCostButton.setBounds(485, 110, 150, 30);
        updateCostButton.addActionListener(this);

        deleteProductButton = new JButton("Delete Product");
        deleteProductButton.setBounds(640, 110, 150, 30);
        deleteProductButton.addActionListener(this);

        exitButton = new JButton("Exit");
        exitButton.setBounds(795, 110, 70, 30);
        exitButton.addActionListener(this);

        model = new DefaultTableModel() {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        table = new JTable(model);

        scrollPane = new JScrollPane(table);
        scrollPane.setBounds(20, 150, 850, 430);

        clearButton = new JButton("Clear The Table");
        clearButton.setBounds(280, 600, 150, 30);
        clearButton.addActionListener(this);

        generateCSVButton = new JButton("Generate CSV");
        generateCSVButton.setBounds(430, 600, 150, 30);
        generateCSVButton.addActionListener(this);
        generateCSVButton.setEnabled(false);

        this.add(productIdField);
        this.add(productIdLabel);
        this.add(viewProductButton);
        this.add(listAllProductsButton);
        this.add(addProductButton);
        this.add(updateQuantityButton);
        this.add(updateQuantityButton);
        this.add(updateCostButton);
        this.add(deleteProductButton);
        this.add(exitButton);
        this.add(scrollPane);
        this.add(clearButton);
        this.add(generateCSVButton);

        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == viewProductButton) {
            ViewProductGUI.viewProductDialogue(productIdField.getText());
        } else if (e.getSource() == listAllProductsButton) {
            model.setRowCount(0);
            model.setColumnCount(0);
            ListAllProductsTableModel.listAllProductsTableModel(model, "product");
            generateCSVButton.setEnabled(true);
        } else if (e.getSource() == addProductButton) {
            AddProductGUI.addProductDialogue();
        } else if (e.getSource() == updateQuantityButton) {
            UpdateQuantityGUI.updateQuantityDialogue();
        } else if (e.getSource() == updateCostButton) {
            UpdateCostGUI.updateCostDialogue();
        } else if (e.getSource() == deleteProductButton) {
            DeleteProductGUI.deleteProductDialogue();
        } else if (e.getSource() == exitButton) {
            int result = JOptionPane.showConfirmDialog(null, "Do You Want To Exit ?", "Exit",
                    JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        } else if (e.getSource() == clearButton) {
            model.setRowCount(0);
            model.setColumnCount(0);
            generateCSVButton.setEnabled(false);
        } else if (e.getSource() == generateCSVButton) {
            CSVGenerator.generateCSV(model);
        }
    }
}
