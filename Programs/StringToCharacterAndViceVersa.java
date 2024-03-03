package Programs;

import java.util.Arrays;
import java.util.Scanner;

/**
 * StringToCharacterAndViceVersa
 */
public class StringToCharacterAndViceVersa {
    public static void main(String[] args) {
        // Convert a String to a  character array
        // Convert a character array to a  string
        String s = "Hello";
        //Convert to a CharArray
        char[] arr = s.toCharArray();
        System.out.println(arr);
        Arrays.sort(arr);
        String sortedString = new String(arr);
        System.out.println(sortedString);
        Scanner sc = new Scanner(System.in);
        String ss = sc.nextLine();
        System.out.println(ss);
        sc.close();
    }
    
}