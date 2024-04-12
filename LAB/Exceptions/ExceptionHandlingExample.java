/**
 * Author: omteja04
 * Description: Exceptions
 */

package LAB.Exceptions;

import java.util.Scanner;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter two numbers:");
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();


            int result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero.");
        } finally {
            System.out.println("Program Executed!!!");
            scanner.close();
        }
    }
}
