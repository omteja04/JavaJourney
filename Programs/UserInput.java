package Programs;

import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
        // System.out.println("Taking Input From User");
        Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // System.out.println(a + b);

        System.out.println(sc.hasNextInt());

        sc.close();
    }
}
