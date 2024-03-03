/**
 * Author: omteja04
 * Description: ConstructorImplementation
 */

package LAB.ExerciseThree;

public class ConstructorImplementation {
    public static void main(String[] args) {
        // Creating an object of ConstructorExample with a parameterized constructor
        ConstructorExample obj = new ConstructorExample("Hello, Constructor!");

        // Invoking the displayMessage method
        obj.displayMessage();
    }
}

class ConstructorExample {
    // Member variables
    private String message;

    // Constructor with parameter
    public ConstructorExample(String msg) {
        this.message = msg;
    }

    // Method to display the message
    public void displayMessage() {
        System.out.println("Message from the constructor: " + message);
    }
}