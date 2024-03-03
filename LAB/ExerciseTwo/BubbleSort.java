/**
 * Author: omteja04
 * Description: BubbleSort
 */

package LAB.ExerciseTwo;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the list:");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements to sort:");

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Bubble sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap temp and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted list using Bubble Sort:");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        scanner.close();
    }
}