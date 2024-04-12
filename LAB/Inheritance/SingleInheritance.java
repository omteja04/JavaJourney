/**
 * Author: omteja04
 * Description: SingleInheritance
 */
package LAB.Inheritance;

public class SingleInheritance {
    public static void main(String[] args) {
        // Creating an object of Child class
        Children childObj = new Children();

        // Invoking methods from both Parent and Child classes
        childObj.displayParent();
        childObj.displayChild();
    }
}

class Parents {
    public void displayParent() {
        System.out.println("This is the parent class.");
    }
}

class Children extends Parents {
    public void displayChild() {
        System.out.println("This is the child class.");
    }
}