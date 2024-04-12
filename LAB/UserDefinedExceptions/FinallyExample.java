/**
 * Author: omteja04
 * Description: FinallyExample
 */

package LAB.UserDefinedExceptions;

import java.util.Scanner;

public class FinallyExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter a number:");
            int number = scanner.nextInt();
            System.out.println("Number entered: " + number);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            // This block will always execute, even if an exception occurs or not
            // It is used for cleanup tasks like closing resources
            System.out.println("Finally block executed.");
            scanner.close(); // Close the scanner
        }
    }
}
