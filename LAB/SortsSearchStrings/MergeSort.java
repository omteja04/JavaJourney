package LAB.SortsSearchStrings;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the list:");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements to sort:");

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Merge sort
        Arrays.sort(arr);

        System.out.println("Sorted list using Merge Sort:");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        scanner.close();
    }
}