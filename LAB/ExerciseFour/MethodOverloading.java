/**
 * Author: omteja04
 * Description: MethodOverloading
 */

package LAB.ExerciseFour;

public class MethodOverloading {
    public static void main(String[] args) {
        // Creating an object of MethodOverloadingExample
        MethodOverloadingExample obj = new MethodOverloadingExample();

        // Invoking the overloaded methods
        System.out.println("Sum of integers: " + obj.add(5, 10));
        System.out.println("Sum of doubles: " + obj.add(5.5, 10.5));
        System.out.println("Concatenation of strings: " + obj.add("Hello", " World"));
    }
}

class MethodOverloadingExample {
    // Overloaded methods
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public String add(String str1, String str2) {
        return str1 + str2;
    }
}