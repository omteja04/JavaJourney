package Programs;

import java.util.Arrays;

public class ArrayOperations {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40 };
        // int[] brr = arr;
        // arr[1] = 1000;
        // System.out.println(Arrays.toString(brr));
        // System.out.println(Arrays.toString(arr));

        // By Doing like this you will never get a duplicate array
        // What exactly happens is we are not getting a copy but we are pointing the
        // same array of same memory location will be pointed with a new variable

        int[] brr = arr.clone(); // This a copy of the original array
        arr[1] = 1000;
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(brr));

        // Another method
        int[] array = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            array[i] = arr[i];
        }
        System.out.println(Arrays.toString(array));

        String[] names = { "Edgar Hart", "Sylvia Ward", "Luke Leonard" };
        String[] newNames = names.clone();
        names[0] = "Jon Snow";
        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(newNames));

        

    }
}
