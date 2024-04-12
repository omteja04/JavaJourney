/**
 * Author: omteja04
 * Description: ConstructorImplementation
 */

package LAB.ExerciseThree;

public class ConstructorImplementation {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        ConstructorExample ob1 = new ConstructorExample();
        // Creating an object of ConstructorExample with a parameterized constructor
        ConstructorExample ob2 = new ConstructorExample("Who Are You ?");

    }
}

class ConstructorExample {

    public ConstructorExample() {
        System.out.println("Hey This Is Default Constructor");
    }

    public ConstructorExample(String msg) {
        System.out.println(msg);
        System.out.println("Hey This Is Parameterized Constructor !!!");
    }

}