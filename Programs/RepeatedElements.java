package Programs;
import java.util.Arrays;
import java.util.Scanner;

public class RepeatedElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array length
        int N = sc.nextInt();

        // Input array elements
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        // Input the value of k
        int k = sc.nextInt();

        // Sort the array for easier counting
        Arrays.sort(arr);

        // Initialize variables for tracking the current element and its count
        int currentElement = arr[0];
        int count = 1;

        // Print elements repeated k times
        boolean found = false;
        for (int i = 1; i < N; i++) {
            if (arr[i] == currentElement) {
                count++;
            } else {
                if (count == k) {
                    System.out.print(currentElement + " ");
                    found = true;
                }
                currentElement = arr[i];
                count = 1;
            }
        }

        // Check for the last element
        if (count == k) {
            System.out.print(currentElement + " ");
            found = true;
        }

        // If no element is found, print -1
        if (!found) {
            System.out.println(-1);
        }

        sc.close();
    }
}
