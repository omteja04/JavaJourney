package GUIFundamentals;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Font;

/**
 * Author: omteja04
 * Description: JTextAreaExample
 */

public class JTextAreaExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Text area");
        frame.setSize(1000, 600);
        frame.setResizable(false);
        frame.setLayout(null);

        JScrollPane pane = new JScrollPane();
        pane.setBounds(50, 50, 500, 500);


        JTextArea textArea = new JTextArea();
        textArea.setFont(new Font("Arial", Font.BOLD, 20));
        textArea.setText("This is textarea \tThis is textarea example\n".repeat(50));
        pane.setViewportView(textArea);
        frame.add(pane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
