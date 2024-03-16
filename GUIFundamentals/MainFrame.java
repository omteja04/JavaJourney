/**
 * Author: omteja04
 * Description: MainFrame
 */

package GUIFundamentals;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainFrame extends JFrame implements ActionListener {

    JButton button1;
    JButton button2;

    // Constructor with no parameters
    MainFrame() {
        setTitle("MainFrame");
        setSize(500, 500);
        setLayout(null);

        button1 = new JButton("Button 1");
        button1.setBounds(100, 100, 100, 40);
        button1.addActionListener(this);

        button2 = new JButton("Button 2");
        button2.setBounds(100, 150, 100, 40);
        button2.addActionListener(this);

        add(button1);
        add(button2);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            System.out.println("You Clicked Button 1");
            new Frame1();
        }
        if (e.getSource() == button2) {
            System.out.println("You Clicked Button 2");
        }
    }
}
