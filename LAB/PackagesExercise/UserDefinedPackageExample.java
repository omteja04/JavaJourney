import java.util.Scanner;
import mathpack.Compare;

public class UserDefinedPackageExample {
    public static void main(String[] args) {
        int n1, n2;
        Scanner sc = new Scanner(System.in);
        Compare c = new Compare();
        System.out.println("Enter Any 2 Values");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        int max = c.getMax(n1, n2);
        int min = c.getMin(n1, n2);
        c.getEqual(n2, n1);
        System.out.println("Maximum : " + max);
        System.out.println("Minimum : " + min);
        sc.close();
    }

}

