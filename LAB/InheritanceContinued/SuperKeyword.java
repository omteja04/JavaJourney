/**
 * Author: omteja04
 * Description: SuperKeyword
 */

package LAB.InheritanceContinued;

public class SuperKeyword {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
    }
}

class Parent {
    void display() {
        System.out.println("Parent's display() method");
    }
}

class Child extends Parent {
    // Overriding the display() method of the parent class
    void display() {
        // Calling the display() method of the parent class using super
        super.display();
        System.out.println("Child's display() method");
    }
}