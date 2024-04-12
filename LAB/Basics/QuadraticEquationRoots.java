
/**
 * Author: omteja04
 * Description: QuadraticEquationRoots
 */

package LAB.Basics;

import java.util.Scanner;

public class QuadraticEquationRoots {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the coefficients of the quadratic equation (ax^2 + bx + c):");
        System.out.print("Enter a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter c: ");
        double c = scanner.nextDouble();

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Roots are real and different.\nRoot1 = " + root1 + ", Root2 = " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("Roots are real and same. Root = " + root);
        } else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("Roots are complex and different. ");
            System.out.format("Root1 = %.2f + %.2f i , ", realPart, imaginaryPart);
            System.out.format("Root2 = %.2f - %.2f i", realPart, imaginaryPart);

        }

        scanner.close();
    }
}