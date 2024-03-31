/**
 * Author: omteja04
 * Description: DLLHome
 */

package LineListingApplication;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class DLLHome extends JFrame implements ActionListener {

    JButton newEntryButton;
    JButton showDetailsButton;
    JButton modifyAnEntryButton;
    public static ImageIcon icon = new ImageIcon("E:\\PROGRAMS\\JAVA\\MaWork\\mom.jpg");

    // Constructor with no parameters
    DLLHome() {
        setTitle("Line Listing");
        setSize(500, 500);
        setLayout(null);
        setIconImage(icon.getImage());

        newEntryButton = new JButton("Add New  Entry");
        newEntryButton.setBounds(100, 100, 250, 40);
        newEntryButton.addActionListener(this);

        showDetailsButton = new JButton("Show Entries");
        showDetailsButton.setBounds(100, 150, 250, 40);
        showDetailsButton.addActionListener(this);

        modifyAnEntryButton = new JButton("Modify Entry");
        modifyAnEntryButton.setBounds(100, 200, 250, 40);
        modifyAnEntryButton.addActionListener(this);

        add(newEntryButton);
        add(showDetailsButton);
        add(modifyAnEntryButton);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == newEntryButton) {
            new DLLAddEntry();
        }
        if (e.getSource() == showDetailsButton) {
            new DLLGenerateData();
        }
        if (e.getSource() == modifyAnEntryButton) {
            JOptionPane.showMessageDialog(null, "This Feature is Currently Under Testing, It will be relased Soon", "Modift Data", JOptionPane.INFORMATION_MESSAGE);
            new DLLModifyData();
        }

    }
}
