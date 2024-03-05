package OOP;

import java.lang.reflect.Method;

class GenericMethodExample {
    // { Editable Code Starts
    // Write your method here
    @SafeVarargs
    static <T> void printArrayElements(T... arr) {
        for (T t : arr) {
            System.out.println(t);
        }
    }
    // } Editable Code Ends
}

public class GenericArbitrary {
    public static void main(String[] args) throws Exception {
        // Overload Check - Ignore this
        int cnt = 0;
        for (Method m : GenericMethodExample.class.getDeclaredMethods()) {
            if (m.getName().equals("printArrayElements")) {
                cnt++;
            }
        }
        if (cnt > 1) {
            throw new Exception("Told you!!. No overloading allowed");
        }
        // Read code from this point
        Integer[] intArray = { 1, 2, 3 };
        Double[] doubleArray = { 12.2, 16.3, 14.94, 7.8, 10.72 };
        String[] stringArray = { "One", "Two", "Three", "Four" };

        // Calling printArrayElements method
        GenericMethodExample.printArrayElements(intArray);
        GenericMethodExample.printArrayElements(stringArray);
        GenericMethodExample.printArrayElements(doubleArray);
    }
}
