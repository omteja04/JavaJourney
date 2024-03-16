package GUIFundamentals;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// cSpell:disable
public class GUIComboBoxLecture {
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setResizable(false);
        frame.setLayout(null);
        ImageIcon icon = new ImageIcon("E:\\SWING\\GUIFundamentals\\Instagram_icon.png");
        frame.setIconImage(icon.getImage());

        // COMBO_BOX

        // JComboBox box1 = new JComboBox();

        // box1.addItem("Levi");
        // box1.addItem("Mikasa");
        // box1.addItem("Eren");
        // box1.addItem("Armin");
        // box1.setBounds(0, 0, 100, 100);

        JLabel label = new JLabel();
        label.setBounds(200, 100, 80, 80);
        label.setOpaque(true);
        label.setBackground(Color.black);

        String[] boxItems = { "Jon Snow", "Daenerys", "Ned Stark", "Arya", "Samwell" };
        String[] associations = { "You know nothing Jon Snow",
                "Leave one wolf alive, and the sheep are never safe.",
                "The man who passes the sentence should swing the sword.",
                "My name is Arya Stark. I want you to know that. The last thing you're ever going to see is a Stark smiling down at you as you die.",
                "I have a tender spot in my heart for cripples, bastards, and broken things." };
        JComboBox box = new JComboBox(boxItems);
        box.setBounds(200, 200, 100, 20);
        box.setFont(new Font("MV Boli", Font.BOLD, 15));
        box.setForeground(Color.red);
        box.setBackground(Color.black);
        box.setSelectedItem(null);

        box.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int ind = box.getSelectedIndex();
                JOptionPane.showMessageDialog(box, associations[ind], "Iconic Dialogue",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });

        frame.add(label);
        frame.add(box);
        // frame.add(box1);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
