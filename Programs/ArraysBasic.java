package Programs;

import java.util.Scanner;

public class ArraysBasic {
    public static void main(String[] args) {

        // Initialize the array statically
        /*
         * int[] arr = { 10, 20, 30, 40,50 };
         * System.out.println(arr[0] + arr[3] - arr[4] * arr[2]);
         * System.out.println(arr.length);
         */

        // System.out.println(arr[100]);

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        // Reading Elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Accessing Elements
        // for (int i = 0; i < n; i++) {
        // System.out.println(arr[i]);
        // }
        for (int i : arr) {
            System.out.println(i);
        }

        sc.close();
    }
}