/**
 * Author: omteja04
 * Description: MultipleCatchExample
 */

package LAB.Exceptions;

import java.util.Scanner;

public class MultipleCatchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter two numbers:");
            int num1 = Integer.parseInt(scanner.next());
            int num2 = Integer.parseInt(scanner.next());

            int result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input. Please enter valid numbers.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Cleanup code");
            scanner.close();
        }
    }
}
