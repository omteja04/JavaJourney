/**
 * Author: omteja04
 * Description: BuiltInExceptionExample
 */

package LAB.UserDefinedExceptions;

import java.util.Scanner;

public class BuiltInExceptionExample {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3 };
        Scanner sc = new Scanner(System.in);
        try {
            // Trying to access an element outside the bounds of the array
            System.out.println("Enter The Index : ");
            int i = sc.nextInt();
            int num = numbers[i];
            System.out.println("Element at index 3: " + num);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Catching the ArrayIndexOutOfBoundsException and printing the error message
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
