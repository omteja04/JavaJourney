package OOP;

public class OOPExample3 {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        circle1.radius = 2.4;
        circle1.printDiameter();
        circle1.printPerimeter();
        circle1.printArea();
        System.out.println();
        Circle circle2 = new Circle();
        circle2.radius = 4.4;
        circle2.printDiameter();
        circle2.printPerimeter();
        circle2.printArea();
    }
}

class Circle {
    double radius;

    static final double PI = 3.14;

    void printDiameter() {
        System.out.println("Diameter of the circle with radius " + radius + " is " + 2 * radius);
    }

    void printArea() {
        System.out.println("Area of the circle with radius " + radius + " is " + PI * radius * radius);
    }

    void printPerimeter() {
        System.out.println("Perimeter of the circle with radius " + radius + " is " + 2 * PI * radius);
    }
}