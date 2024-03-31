/**
 * Author: omteja04
 * Description: CSVGenerator
 */
package LineListingApplication;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class CSVGenerator {

    public static void main(String[] args) {
        DLLAddEntry frame = new DLLAddEntry(); // Assuming DLLAddEntry is your Swing form class
        frame.setVisible(true);
    }

    public static void generateCSV(String filename, ArrayList<String> headers, ArrayList<String> data) {
        try (FileWriter writer = new FileWriter(filename)) {
            // Write headers
            for (int i = 0; i < headers.size(); i++) {
                writer.append(headers.get(i));
                if (i < headers.size() - 1) {
                    writer.append(',');
                } else {
                    writer.append('\n');
                }
            }

            // Write data
            for (int i = 0; i < data.size(); i++) {
                writer.append(data.get(i));
                if (i < data.size() - 1) {
                    writer.append(',');
                } else {
                    writer.append('\n');
                }
            }

            JOptionPane.showMessageDialog(null, "CSV file generated successfully!");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error generating CSV file: " + e.getMessage(), "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void generateCSVTable(String filename, ArrayList<String> headers, ArrayList<ArrayList<String>> data) {
        try (FileWriter writer = new FileWriter(filename)) {
            // Write headers
            for (int i = 0; i < headers.size(); i++) {
                writer.append(headers.get(i));
                if (i < headers.size() - 1) {
                    writer.append(',');
                } else {
                    writer.append('\n');
                }
            }

            // Write data
            for (ArrayList<String> row : data) {
                for (int i = 0; i < row.size(); i++) {
                    writer.append(row.get(i));
                    if (i < row.size() - 1) {
                        writer.append(',');
                    } else {
                        writer.append('\n');
                    }
                }
            }

            JOptionPane.showMessageDialog(null, "CSV file generated successfully!");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error generating CSV file: " + e.getMessage(), "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
