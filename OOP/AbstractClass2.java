/**
 * Author: omteja04
 * Description: Abstract classes can also contain concrete methods
 */

package OOP;

import java.util.Scanner;

public class AbstractClass2 {
    public static void main(String[] args) {
        Square square = new Square();
        square.takeInput();
        square.calculateArea();
        square.displayArea();
        Rectangles rectangle = new Rectangles();
        rectangle.takeInput();
        rectangle.calculateArea();
        rectangle.displayArea();
    }
}

abstract class Shape {
    double area;

    abstract void takeInput();

    abstract void calculateArea();

    void displayArea() {
        System.out.println("Area is " + area);
    }
}


class Square extends Shape {
    double side;

    void takeInput() {
        Scanner sc = new Scanner(System.in);
        side = sc.nextDouble();
        // sc.close();
    }

    void calculateArea() {
        area = side * side;
    }

}

class Rectangles extends Shape {
    double length, width;

    void takeInput() {
        Scanner sc = new Scanner(System.in);
        length = sc.nextDouble();
        width = sc.nextDouble();
        // sc.close();
    }

    void calculateArea() {
        area = length * width;
    }

}