package Programs;

import java.util.Arrays;

public class VaryingLengthArrays {
    public static void main(String[] args) {
        /*
            ^ int[] a, b, c;
         * In this all a,b,c are arrays
            ^ int p[], q, r;
         * In this only p is array q and r are normal integers
        
         */
        
        /* int[][] arr = { { 10, 20 }, { 30, 40, 50 }, { 60 }, { 90, 100 } };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        } */
        /* 
            ^ int[][] arr=new int[3][];
            * this doesn't give any error coz java support variable each row size
            */
        int[][] arr = new int[3][];
        arr[0] = new int[10];
        arr[1] = new int[5];
        arr[2] = new int[2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = 10;
            }
        }
        System.out.println(Arrays.deepToString(arr));
            

    }
}
