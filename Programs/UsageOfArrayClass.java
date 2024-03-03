package Programs;

import java.util.Arrays;

public class UsageOfArrayClass {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40 };
        String[] arr1 = { "abc", "xyz" };
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));

        int A[] = { 7, 8, 11, -1, -36, 24, 6 };
        // 0 1 2 3 4 5 6
        // -36 -1 6 7 8 11 24
        // Performs sort in-place
        // Arrays.sort(A);
        // System.out.println(Arrays.toString(A));
        Arrays.sort(A, 3, 6); // sorts from 3 index to 5 index
        System.out.println(Arrays.toString(A));

        // filling
        // Arrays.fill() -> Used to fill an array
        int X[] = new int[10];
        Arrays.fill(X, -1);
        System.out.println(Arrays.toString(X));

        String[] strArray = new String[5];
        Arrays.fill(strArray, "teja");
        System.out.println(Arrays.toString(strArray));

        // compare(p, q)
        // 0 --> p == q
        // 1 --> p > q
        // -1 --> p < q
        // compare(q, p)
        // 0 --> q == p
        // 1 --> q > p
        // -1 --> q < p
        int[] p = { 10, 20, 15, 40 };
        int[] q = { 10, 20, 30, 40 };
        // Arrays.mismatch(a, b) --> return the index of the first element where the
        // mismatch is found
        System.out.println(Arrays.mismatch(p, q));
        System.out.println(Arrays.compare(p, q));

        // equals()
        // true / false
        System.out.println(Arrays.equals(p, q));
    }
}