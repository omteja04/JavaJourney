
/**
 * Author: omteja04
 * Description: ConstructorOverloading
 */

package LAB.Overloadings;

public class ConstructorOverloading {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        // Creating objects of ConstructorOverloadingExample
        ConstructorOverloadingExample obj1 = new ConstructorOverloadingExample();
        ConstructorOverloadingExample obj2 = new ConstructorOverloadingExample(42);
        ConstructorOverloadingExample obj3 = new ConstructorOverloadingExample("Hello");
    }
}

class ConstructorOverloadingExample {
    // Constructors with different parameters.
    public ConstructorOverloadingExample() {
        System.out.println("Default constructor called.");
    }

    public ConstructorOverloadingExample(int num) {
        System.out.println("Parameterized constructor with int: " + num);
    }

    public ConstructorOverloadingExample(String str) {
        System.out.println("Parameterized constructor with string: " + str);
    }
}