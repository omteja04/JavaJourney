/**
 * Author: omteja04
 * Description: InterfaceLecture
 */

package OOP;

public class InterfaceLecture {
    public static void main(String[] args) {
        Math1 m1 = new Math1();
        System.out.println(m1.factorial(5));
        Math2 m2 = new Math2();
        System.out.println(m2.factorial(4));

    }

}

interface Operations {
    // NOTE every method you create is by-default public and abstract
    int factorial(int n); /* public abstract in factorial(int n); */
}

class Math1 implements Operations {
    // Iterative implementation
    public int factorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}

class Math2 implements Operations {
    // Recursive implementation
    public int factorial(int n) {
        if (n == 1 || n == 0)
            return 1;
        return n * factorial(n - 1);
    }
}