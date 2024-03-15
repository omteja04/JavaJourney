package GUIFundamentals;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Main {
    public static void main(String[] args) {
        // An Object of JFrame class

        JFrame window = new JFrame();
        window.setTitle("My Frame");
        // window.getContentPane().setBackground(Color.black);

        window.setLayout(null);
        JLabel lb1 = new JLabel();
        lb1.setText("This is my first Java GUI Program");

        lb1.setBounds(0, 0, 498, 45);

        /*
         * `lb1.setForeground(Color.red);` is setting the foreground color of the JLabel
         * `lb1` to red.
         * This means that the text displayed by the JLabel will appear in red color on
         * the GUI window.
         */
        lb1.setForeground(Color.red);
        Font myFont = new Font("MV Boli", Font.BOLD, 25);
        lb1.setFont(myFont);

        // NOTE lb1.setFont(new Font("MV Boli", Font.BOLD, 25));

        /*
         * `window.add(lb1);` is adding a JLabel component (`lb1`) to the JFrame
         * (`window`). This means
         * that the JLabel will be displayed within the JFrame when the program is
         * executed.
         */

        JLabel lb2 = new JLabel();
        lb2.setText("I'm Teja");

        lb2.setBounds(50, 67, 450, 78);
        lb2.setForeground(Color.red);
        lb2.setFont(myFont);

        window.add(lb1);
        window.add(lb2);

        window.setVisible(true);
        window.setSize(500, 500);
        /*
         * The line `window.setResizable(false);` is setting the JFrame's resizable
         * property to false. This
         * means that when the program is executed, the user will not be able to resize
         * the JFrame window by
         * dragging its edges or corners. The window will remain fixed in size as
         * specified by
         * `window.setSize(800, 500);`
         */
        window.setResizable(false);
        /*
         * `window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);` is setting the
         * default close
         * operation for the JFrame `window`. In this case, `JFrame.EXIT_ON_CLOSE`
         * specifies that when
         * the user closes the JFrame by clicking the close button, the application will
         * exit and
         * terminate.
         */

        // ANCHOR - JTextField implementation
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTextField tf1 = new JTextField();
        tf1.setFont(myFont);
        tf1.setBounds(240, 170, 60, 50);



        // ANCHOR
        // ~ Buttons

        JButton button = new JButton();

        button.setText("Know My GF");
        button.setBounds(50, 145, 180, 20);
        // button1.setFont(myFont);
        
        /*
        * The line `button.addActionListener();` in the Java code snippet is attempting
        * to add an ActionListener to the JButton named `button`.
        * However, the `addActionListener()` method requires an object of a class that
        * implements the ActionListener interface to be passed as
        * an argument. This object would define the actions to be performed when the
        * button is clicked.
        */
        // button.addActionListener(new DoSomething());
        
        // Anonymous Implementation of actionListener
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                
                String inputText = tf1.getText();
                System.out.println("Input text: " + inputText);
                tf1.setText("");
            }
        });
        window.add(tf1);
        window.add(button);
    }
}

/*
 * class DoSomething implements ActionListener {
 * public void actionPerformed(ActionEvent event) {
 * System.out.println("\nTelisthe First Neeke Cheptha");
 * }
 * }
 */