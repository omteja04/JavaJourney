/**
 * Author: omteja04
 * Description: BinarySearch
 */

package LAB.ExerciseTwo;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the list:");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements in sorted order:");

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Enter the element to search:");
        int key = scanner.nextInt();

        int result = Arrays.binarySearch(arr, key);

        if (result >= 0) {
            System.out.println("Element found at index " + result);
        } else {
            System.out.println("Element not found in the list.");
        }

        scanner.close();
    }
}