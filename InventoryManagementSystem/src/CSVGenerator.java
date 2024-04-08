
/**
 * Author: omteja04
 * Description: CSVGenerator
 */

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CSVGenerator {

    public static void generateCSV(DefaultTableModel model) {
        ArrayList<String> headers = new ArrayList<>();
        for (int i = 0; i < model.getColumnCount(); i++) {
            headers.add(model.getColumnName(i));
        }

        ArrayList<ArrayList<String>> data = new ArrayList<>();
        for (int i = 0; i < model.getRowCount(); i++) {
            ArrayList<String> rowData = new ArrayList<>();
            for (int j = 0; j < model.getColumnCount(); j++) {
                rowData.add(model.getValueAt(i, j).toString());
            }
            data.add(rowData);
        }

        String fileName = JOptionPane.showInputDialog(null, "Save As : ", "FileName", JOptionPane.QUESTION_MESSAGE);
        if (fileName != null) {
            generateCSVTable(fileName + ".csv", headers, data);
        } else {
            JOptionPane.showMessageDialog(null, "Generating CSV Unsuccessful", "Error", JOptionPane.ERROR_MESSAGE);
            ;
        }
    }

    private static void generateCSVTable(String fileName, ArrayList<String> headers,
            ArrayList<ArrayList<String>> data) {
        try (FileWriter writer = new FileWriter(fileName)) {
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
