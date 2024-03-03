package Programs;
import java.util.Scanner;

public class Ditto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int p = sc.nextInt();
        boolean r = false;
        int a, b;
        a = Math.max(x, y);
        b = Math.min(x, y);

        while (a > 0 && b > 0) {
            if (a == b)
                r = true;
            a -= p;
            b += p;
        }
        System.out.println(r ? "YES" : "NO");
        System.out.println((x - y) % (2 * p) == 0 ? "YES" : "NO");
        sc.close();
    }
}