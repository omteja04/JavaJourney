package GUIFundamentals;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

// cSpell:disable

public class GUIComboBoxPractice {
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setResizable(false);
        frame.setLayout(null);
        ImageIcon icon = new ImageIcon("Instagram_icon.png");
        frame.setIconImage(icon.getImage());

        // COMBO_BOX

        JLabel label = new JLabel();
        label.setBounds(200, 100, 80, 80);
        label.setOpaque(true);
        label.setBackground(Color.black);

        String[] boxItems = { "RED", "GREEN", "BLUE", "YELLOW", "PINK" };
        Color[] colors = { Color.red, Color.green, Color.blue, Color.yellow, Color.pink };
        JComboBox box = new JComboBox(boxItems);
        box.setBounds(200, 200, 100, 20);
        box.setFont(new Font("MV Boli", Font.BOLD, 15));
        box.setForeground(Color.red);
        box.setBackground(Color.black);
        box.setSelectedItem(null);

        box.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int selectedItemIndex = box.getSelectedIndex();

                label.setBackground(colors[selectedItemIndex]);

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
