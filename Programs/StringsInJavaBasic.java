package Programs;
import java.util.Scanner;

public class StringsInJavaBasic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String name = new String("Teja");
        // String name ="Teja";
        // System.out.print("Hi ");
        // System.out.println(name);
        int a = 10;
        float b = 10.9f;
        // // System.out.println(a+" "+ b);
        System.out.printf("%d %.2f \n", a, b); // Format Specifiers
        // System.out.println();
        // System.out.format("%d %f", a, b);

        // String str1 = sc.next(); //Word
        String str2 = sc.nextLine(); //Line
        System.out.println(str2);
        sc.close();
    }
}