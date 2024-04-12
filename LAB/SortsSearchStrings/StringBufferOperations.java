/**
 * Author: omteja04
 * Description: StringBufferOperations
 */

package LAB.SortsSearchStrings;

import java.util.Scanner;

public class StringBufferOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();

        StringBuffer stringBuffer = new StringBuffer(inputString);

        System.out.println("Original string: " + stringBuffer);

        // Delete character at index
        System.out.println("Enter the index to delete a character:");
        int indexToDelete = scanner.nextInt();
        stringBuffer.deleteCharAt(indexToDelete);
        System.out.println("String after deleting character at index " + indexToDelete + ": " + stringBuffer);

        // Remove a range of characters
        System.out.println("Enter the starting index to remove characters:");
        int startIndex = scanner.nextInt();
        System.out.println("Enter the ending index to remove characters:");
        int endIndex = scanner.nextInt();
        stringBuffer.delete(startIndex, endIndex + 1);
        System.out.println(
                "String after removing characters from index " + startIndex + " to " + endIndex + ": " + stringBuffer);

        scanner.close();
    }
}