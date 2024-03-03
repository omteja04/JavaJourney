package OOP;

public class OOPExample2 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.width = 5.4;
        r1.length = 2.2;
        r1.printArea();
        r1.printPerimeter();

        Rectangle r2 = new Rectangle();
        r2.width = 2.4;
        r2.length = 4.3;
        r2.printArea();
        r2.printPerimeter();
    }
}

class Rectangle {
    double length, width;

    void printArea() {
        System.out.println(length * width);
    }

    void printPerimeter() {
        System.out.println(2 * (length + width));
    }
}
