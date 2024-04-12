/**
 * Author: omteja04
 * Description: ThrowExample
 */

package LAB.UserDefinedExceptions;

import java.util.Scanner;

public class ThrowExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter your age:");
            int age = scanner.nextInt();

            // Validate age
            if (age < 0 || age > 120) {
                throw new IllegalArgumentException("Invalid age. Age must be between 0 and 120.");
            }

            System.out.println("Age entered: " + age);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
