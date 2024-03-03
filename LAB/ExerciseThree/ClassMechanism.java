/**
 * Author: omteja04
 * Description: ClassMechanism
 */

package LAB.ExerciseThree;

public class ClassMechanism {
    public static void main(String[] args) {
        // Creating an object of SampleClass
        SampleClass obj = new SampleClass(42);

        // Invoking the displayValue method
        obj.displayValue();
    }
}

class SampleClass {
    // Member variables
    private int number;

    // Constructor
    public SampleClass(int num) {
        this.number = num;
    }

    // Method to display the value
    public void displayValue() {
        System.out.println("The value is: " + number);
    }
}