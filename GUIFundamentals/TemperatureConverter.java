/**
 * Author: omteja04
 * Description: TemperatureConverter
 */

package GUIFundamentals;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JCheckBox;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// cSpell:disable

public class TemperatureConverter {

    public static void main(String[] args) {
        JFrame window = new JFrame("Temperature Converter");
        window.setLayout(null);
        window.setSize(500, 500);

        Font myFont = new Font("MV Boli", Font.BOLD, 20);

        // labels

        JLabel conversionDirectionLabel = new JLabel();
        conversionDirectionLabel.setText("Celsius To Fahrenheit");
        conversionDirectionLabel.setForeground(Color.BLACK);
        conversionDirectionLabel.setBounds(30, 0, 400, 60);
        conversionDirectionLabel.setFont(myFont);

        JLabel inputLabel = new JLabel();
        inputLabel.setText("Input : ");
        inputLabel.setForeground(Color.RED);
        inputLabel.setBounds(30, 40, 150, 60);
        inputLabel.setFont(myFont);

        JLabel outputLabel = new JLabel();
        outputLabel.setText("Output : ");
        outputLabel.setForeground(Color.blue);
        outputLabel.setBounds(200, 40, 150, 60);
        outputLabel.setFont(myFont);

        // Text Areas

        JTextField inputTextArea = new JTextField();
        inputTextArea.setFont(myFont);
        inputTextArea.setBounds(30, 100, 100, 50);

        JTextField outputTextArea = new JTextField();
        outputTextArea.setFont(myFont);
        outputTextArea.setBounds(200, 100, 100, 50);
        outputTextArea.setEditable(false);

        // Checkbox

        JCheckBox switchCheckBox = new JCheckBox("Switch the Convertor", false);
        switchCheckBox.setBounds(105, 190, 300, 20);

        // Buttons

        JButton convertButton = new JButton();
        convertButton.setText("Convert");
        convertButton.setBounds(30, 250, 102, 20);

        JButton clearButton = new JButton();
        clearButton.setText("Clear");
        clearButton.setBounds(200, 250, 102, 20);

        // ActionListeners

        convertButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                try {
                    double inputValue = Double.parseDouble(inputTextArea.getText());
                    double outputValue;

                    if (switchCheckBox.isSelected()) {
                        outputValue = (inputValue - 32) * 5.0 / 9.0;
                    } else {
                        outputValue = (inputValue * 9.0 / 5.0) + 32;
                    }
                    outputTextArea.setText(String.format("%.2f", outputValue));
                } catch (Exception e) {
                    String inputType = switchCheckBox.isSelected() ? "Fahrenheit" : "Celsius";
                    JOptionPane.showMessageDialog(window, "Please enter a valid number for " + inputType, "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                inputTextArea.setText("");
                outputTextArea.setText("");
            }
        });

        switchCheckBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                if (switchCheckBox.isSelected()) {
                    conversionDirectionLabel.setText("Fahrenheit to Celsius");
                } else {
                    conversionDirectionLabel.setText("Celsius to Fahrenheit");
                }
            }
        });

        // Adding To Frame
        window.add(conversionDirectionLabel);
        window.add(inputLabel);
        window.add(outputLabel);
        window.add(inputTextArea);
        window.add(outputTextArea);
        window.add(switchCheckBox);
        window.add(convertButton);
        window.add(clearButton);
        window.setVisible(true);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}