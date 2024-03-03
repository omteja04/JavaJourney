package Programs;

import java.util.Scanner;

public class StrongPrime {
    static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        if (n == 2 || n == 3)
            return true;
        if (n % 2 == 0 || n % 3 == 0)
            return false;

        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (!isPrime(number)) {
            System.out.println("NO");
        } else {
            int pp = number - 1;
            int np = number + 1;

            while (pp > 1 && !isPrime(pp)) {
                pp = pp - 1;
            }

            while (!isPrime(np)) {
                np++;
            }

            if ((pp + np) / 2 < number) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
