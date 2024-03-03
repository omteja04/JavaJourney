/**
 * Author: omteja04
 * Description: MultiLevelInheritance
 */
package LAB.ExerciseFive;

public class MultiLevelInheritance {
    public static void main(String[] args) {
        // Creating an object of Child class
        Child childObj = new Child();

        // Invoking methods from Grandparent, Parent, and Child classes
        childObj.displayGrandparent();
        childObj.displayParent();
        childObj.displayChild();
    }
}

class Grandparent {
    public void displayGrandparent() {
        System.out.println("This is the grandparent class.");
    }
}

class Parent extends Grandparent {
    public void displayParent() {
        System.out.println("This is the parent class.");
    }
}

class Child extends Parent {
    public void displayChild() {
        System.out.println("This is the child class.");
    }
}