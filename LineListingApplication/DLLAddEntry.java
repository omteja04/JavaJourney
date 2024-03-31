/**
 * Author: omteja04
 * Description: DLLAddEntry
 */

package LineListingApplication;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
// cSpell:disable
public class DLLAddEntry extends JFrame {
    private JLabel RCHIdLabel;
    private JLabel healthFacilityLabel;
    private JLabel healthSubFacilityLabel;
    private JLabel anmNameLabel;
    private JLabel ashaNameLabel;
    private JLabel motherNameLabel;
    private JLabel husbandNameLabel;
    private JLabel registrationDateLabel;
    private JLabel lmpLabel;
    private JLabel eddLabel;
    private JLabel deliveryDateLabel;
    private JLabel motherAgeLabel;
    private JLabel deliveryTypeLabel;
    private JLabel noOfBirthsLabel;
    private JLabel maleOrFemaleLabel;
    private JLabel deliverySpotLabel;
    private JLabel facilityNameLabel;
    private JLabel townNameLabel;
    private JLabel districtNameLabel;
    private JLabel stateNameLabel;
    private JTextField RCHIdField;
    private JTextField healthFacilityField;
    private JTextField healthSubFacilityField;
    private JTextField anmNameField;
    private JComboBox<String> ashaNameComboBox;
    private JTextField motherNameField;
    private JTextField husbandNameField;
    private JTextField registrationDateField;
    private JTextField lmpField;
    private JTextField eddField;
    private JTextField deliveryDateField;
    private JTextField motherAgeField;
    private JTextField deliveryTypeField;
    private JTextField noOfBirthsField;
    private JTextField maleOrFemaleField;
    private JTextField deliverySpotField;
    private JTextField facilityNameField;
    private JTextField townNameField;
    private JTextField districtNameField;
    private JTextField stateNameField;

    private JButton submitButton;
    private JButton clearButton;
    Font font = new Font("Arial", Font.BOLD, 12);

    @SuppressWarnings({ "rawtypes", "unchecked" })
    DLLAddEntry() {
        setTitle("New Entry");
        setSize(700, 700);

        RCHIdLabel = new JLabel("RCH ID:");
        RCHIdField = new JTextField();
        healthFacilityLabel = new JLabel("Health Facility:");
        healthFacilityField = new JTextField("RANGAMPETA (2471)");
        healthSubFacilityLabel = new JLabel("Health Sub Facility:");
        healthSubFacilityField = new JTextField("SUBHADRAMPETA(22553)");
        anmNameLabel = new JLabel("ANM Name:");
        anmNameField = new JTextField("G.V.Ramana Sri(33587)");
        ashaNameLabel = new JLabel("ASHA Name:");
        String[] ashaNames = { "P Shara(32368)", "M Padmavathi(32369)" };
        ashaNameComboBox = new JComboBox(ashaNames);
        ashaNameComboBox.setFont(font);
        ashaNameComboBox.setSelectedIndex(-1);
        motherNameLabel = new JLabel("Mother's Name:");
        motherNameField = new JTextField();
        husbandNameLabel = new JLabel("Husband's Name:");
        husbandNameField = new JTextField();
        registrationDateLabel = new JLabel("Registration Date:");
        registrationDateField = new JTextField();
        lmpLabel = new JLabel("LMP:");
        lmpField = new JTextField();
        eddLabel = new JLabel("EDD:");
        eddField = new JTextField();
        deliveryDateLabel = new JLabel("Delivery Date:");
        deliveryDateField = new JTextField();
        motherAgeLabel = new JLabel("Mother's Age:");
        motherAgeField = new JTextField();
        deliveryTypeLabel = new JLabel("L.S.C.S or Normal:");
        deliveryTypeField = new JTextField();
        noOfBirthsLabel = new JLabel("No. of Births:");
        noOfBirthsField = new JTextField();
        maleOrFemaleLabel = new JLabel("Male or Female:");
        maleOrFemaleField = new JTextField();
        deliverySpotLabel = new JLabel("Govt or Private:");
        deliverySpotField = new JTextField();
        facilityNameLabel = new JLabel("Hospital Name:");
        facilityNameField = new JTextField();
        townNameLabel = new JLabel("Town Name:");
        townNameField = new JTextField();
        districtNameLabel = new JLabel("District Name:");
        districtNameField = new JTextField();
        stateNameLabel = new JLabel("State Name:");
        stateNameField = new JTextField("Andhra Pradesh");
        submitButton = new JButton("Submit");
        clearButton = new JButton("Clear");

        // Set layout to GridLayout
        setLayout(new GridLayout(0, 2, 100, 5)); // 0 rows, 2 columns, with 50px & 5px horizontal and vertical gaps

        // Add components to the frame
        add(RCHIdLabel);
        add(RCHIdField);
        add(healthFacilityLabel);
        add(healthFacilityField);
        add(healthSubFacilityLabel);
        add(healthSubFacilityField);
        add(anmNameLabel);
        add(anmNameField);
        add(ashaNameLabel);
        add(ashaNameComboBox);
        add(motherNameLabel);
        add(motherNameField);
        add(husbandNameLabel);
        add(husbandNameField);
        add(registrationDateLabel);
        add(registrationDateField);
        add(lmpLabel);
        add(lmpField);
        add(eddLabel);
        add(eddField);
        add(deliveryDateLabel);
        add(deliveryDateField);
        add(motherAgeLabel);
        add(motherAgeField);
        add(deliveryTypeLabel);
        add(deliveryTypeField);
        add(noOfBirthsLabel);
        add(noOfBirthsField);
        add(maleOrFemaleLabel);
        add(maleOrFemaleField);
        add(deliverySpotLabel);
        add(deliverySpotField);
        add(facilityNameLabel);
        add(facilityNameField);
        add(townNameLabel);
        add(townNameField);
        add(districtNameLabel);
        add(districtNameField);
        add(stateNameLabel);
        add(stateNameField);
        add(submitButton);
        add(clearButton);

        setFontForTextFields();

        // pack(); // Adjust the size of the frame to fit its contents
        setLocationRelativeTo(null); // Center the frame on the screen

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);

        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                int choice = JOptionPane.showConfirmDialog(null, "Do You Want To Clear ?", "Submit",
                        JOptionPane.YES_NO_OPTION);
                if (choice == JOptionPane.YES_OPTION) {
                    clearFields();
                }
            }
        });
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int choice = JOptionPane.showConfirmDialog(null, "Do You Want To Submit ?", "Submit",
                        JOptionPane.YES_NO_OPTION);
                if (choice == JOptionPane.YES_OPTION) {
                    InsertingIntoDb insertingIntoDb = new InsertingIntoDb();
                    ArrayList<String> valueList = new ArrayList<String>();
                    valueList.add((String) RCHIdField.getText());
                    valueList.add((String) healthFacilityField.getText());
                    valueList.add((String) healthSubFacilityField.getText());
                    valueList.add((String) anmNameField.getText());
                    valueList.add((String) ashaNameComboBox.getSelectedItem());
                    valueList.add((String) motherNameField.getText());
                    valueList.add((String) husbandNameField.getText());
                    valueList.add((String) registrationDateField.getText());
                    valueList.add((String) lmpField.getText());
                    valueList.add((String) eddField.getText());
                    valueList.add((String) deliveryDateField.getText());
                    valueList.add((String) motherAgeField.getText());
                    valueList.add((String) deliveryTypeField.getText());
                    valueList.add((String) noOfBirthsField.getText());
                    valueList.add((String) maleOrFemaleField.getText());
                    valueList.add((String) deliverySpotField.getText());
                    valueList.add((String) facilityNameField.getText());
                    valueList.add((String) townNameField.getText());
                    valueList.add((String) districtNameField.getText());
                    valueList.add((String) stateNameField.getText());

                    insertingIntoDb.insertDB(valueList);
                }

            }
        });
        setResizable(false);
    }

    Component[] components = getContentPane().getComponents();

    private void setFontForTextFields() {
        for (Component component : components) {
            if (component instanceof JTextField) {
                JTextField textField = (JTextField) component;
                textField.setFont(font);
            }
        }
    }

    private void clearFields() {
        Component[] components = getContentPane().getComponents();
        for (Component component : components) {
            if (component instanceof JTextField) {
                JTextField textField = (JTextField) component;
                textField.setText("");
            } else if (component instanceof JComboBox) {
                @SuppressWarnings("rawtypes")
                JComboBox comboBox = (JComboBox) component;
                comboBox.setSelectedIndex(-1);
            }
        }
        setDefaultFieldValues();
    }

    private void setDefaultFieldValues() {
        stateNameField.setText("Andhra Pradesh");
        anmNameField.setText("G.V.Ramana Sri(33587)");
        healthFacilityField.setText("RANGAMPETA (2471)");
        healthSubFacilityField.setText("SUBHADRAMPETA(22553)");
    }

}
