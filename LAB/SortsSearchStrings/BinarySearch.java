/**
 * Author: omteja04
 * Description: BinarySearch
 */

package LAB.SortsSearchStrings;

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

        int result = binarySearch(arr, 0, n - 1, key);

        if (result >= 0) {
            System.out.println("Element found at index " + result);
        } else {
            System.out.println("Element not found in the list.");
        }

        scanner.close();
    }

    private static int binarySearch(int[] arr, int low, int high, int key) {

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;

    }
}