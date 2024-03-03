<!-- cSpell:disable -->

### Exercise-1 (Basics)

a) Display default values of all primitive data types in Java:

```java
/**
 * Author: omteja04
 * Description: DefaultValues
 */

public class DefaultValues {
    static byte defaultByte;
    static short defaultShort;
    static int defaultInt;
    static long defaultLong;
    static float defaultFloat;
    static double defaultDouble;
    static char defaultChar;
    static boolean defaultBoolean;

    public static void main(String[] args) {

        // Default values
        System.out.println("Default value of byte: " + defaultByte);
        System.out.println("Default value of short: " + defaultShort);
        System.out.println("Default value of int: " + defaultInt);
        System.out.println("Default value of long: " + defaultLong);
        System.out.println("Default value of float: " + defaultFloat);
        System.out.println("Default value of double: " + defaultDouble);
        System.out.println("Default value of char: " + defaultChar);
        System.out.println("Default value of boolean: " + defaultBoolean);
    }
}
```

**Output :**

```output
Default value of byte: 0
Default value of short: 0
Default value of int: 0
Default value of long: 0
Default value of float: 0.0
Default value of double: 0.0
Default value of char:
Default value of boolean: false
```

b) Display roots of a quadratic equation and describe the nature of roots:

```java
/**
 * Author: omteja04
 * Description: QuadraticEquationRoots
 */

import java.util.Scanner;

public class QuadraticEquationRoots {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the coefficients of the quadratic equation (ax^2 + bx + c):");
        System.out.print("Enter a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter c: ");
        double c = scanner.nextDouble();

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Roots are real and different. Root1 = " + root1 + ", Root2 = " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("Roots are real and same. Root = " + root);
        } else {
            System.out.println("Roots are complex and different.");
        }

        scanner.close();
    }
}
```

**Output :**

```output
Enter the coefficients of the quadratic equation (ax^2 + bx + c):
Enter a: 1
Enter b: -8
Enter c: 15
Roots are real and different. Root1 = 5.0, Root2 = 3.0
```

c) Display the speed of qualifying racers based on the average speed:

```java
/**
 * Author: omteja04
 * Description: QualifyingRacers
 */
import java.util.Scanner;

public class QualifyingRacers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the speeds of the five racers:");

        double totalSpeed = 0;
        double[] speeds = new double[5];

        // Input speeds
        for (int i = 0; i < 5; i++) {
            System.out.print("Racer " + (i + 1) + " speed: ");
            speeds[i] = scanner.nextDouble();
            totalSpeed += speeds[i];
        }

        // Calculate average speed
        double averageSpeed = totalSpeed / 5;

        System.out.println("\nAverage Speed: " + averageSpeed + "\nQualifying Racers:");

        // Display speeds of qualifying racers
        for (int i = 0; i < 5; i++) {
            if (speeds[i] > averageSpeed) {
                System.out.println("Racer " + (i + 1) + ": " + speeds[i]);
            }
        }

        scanner.close();
    }
}
```

**Output :**

```output
Enter the speeds of the five racers:
Racer 1 speed: 60
Racer 2 speed: 76
Racer 3 speed: 69
Racer 4 speed: 80
Racer 5 speed: 54

Average Speed: 67.8
Qualifying Racers:
Racer 2: 76.0
Racer 3: 69.0
Racer 4: 80.0
```

### Exercise-2 (Operations, Expressions, Control-flow, Strings)

a) Binary search program:

```java
/**
 * Author: omteja04
 * Description: BinarySearch
 */
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the list:");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements in sorted order:");

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Enter the element to search:");
        int key = scanner.nextInt();

        int result = Arrays.binarySearch(arr, key);

        if (result >= 0) {
            System.out.println("Element found at index " + result);
        } else {
            System.out.println("Element not found in the list.");
        }

        scanner.close();
    }
}
```

**Output :**

```output
Enter the number of elements in the list:
7
Enter the elements in sorted order:
3 8 12 45 65 69 99
Enter the element to search:
69
Element found at index 5
```

b) Bubble sort program:

```java
/**
 * Author: omteja04
 * Description: BubbleSort
 */

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the list:");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements to sort:");

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Bubble sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap temp and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted list using Bubble Sort:");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        scanner.close();
    }
}
```

**Output :**

```output
Enter the number of elements in the list:
7
Enter the elements to sort:
54 34 99 65 69 0 -9
Sorted list using Bubble Sort:
-9 0 34 54 65 69 99
```

c) Merge sort program:

```java
import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the list:");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements to sort:");

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Merge sort
        Arrays.sort(arr);

        System.out.println("Sorted list using Merge Sort:");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        scanner.close();
    }
}
```

**Output :**

```output
Enter the number of elements in the list:
7
Enter the elements to sort:
54 34 99 65 69 0 -9
Sorted list using Merge Sort:
-9 0 34 54 65 69 99
```

d) StringBuffer program to delete and remove characters:

```java
/**
 * Author: omteja04
 * Description: StringBufferOperations
 */

import java.util.Scanner;

public class StringBufferOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();

        StringBuffer stringBuffer = new StringBuffer(inputString);

        System.out.println("Original string: " + stringBuffer);

        // Delete character at index
        System.out.println("Enter the index to delete a character:");
        int indexToDelete = scanner.nextInt();
        stringBuffer.deleteCharAt(indexToDelete);
        System.out.println("String after deleting character at index " + indexToDelete + ": " + stringBuffer);

        // Remove a range of characters
        System.out.println("Enter the starting index to remove characters:");
        int startIndex = scanner.nextInt();
        System.out.println("Enter the ending index to remove characters:");
        int endIndex = scanner.nextInt();
        stringBuffer.delete(startIndex, endIndex + 1);
        System.out.println("String after removing characters from index " + startIndex + " to " + endIndex + ": " + stringBuffer);

        scanner.close();
    }
}
```

**Output :**

```output
Enter a string:
Bloddy Romeo
Original string: Bloddy Romeo
Enter the index to delete a character:
6
String after deleting character at index 6: BloddyRomeo
Enter the starting index to remove characters:
0
Enter the ending index to remove characters:
5
String after removing characters from index 0 to 5: Romeo
```

### Exercise - 3 (Class, Objects)

a) Implementing class mechanism:

```java
/**
 * Author: omteja04
 * Description: ClassMechanism
 */

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
```

**Output :**

```output
The value is: 42
```

b) Implementing constructor:

```java

/**
 * Author: omteja04
 * Description: ConstructorImplementation
 */

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
```

**Output :**

```output
Message from the constructor: Hello, Constructor!
```

### Exercise - 4 (Methods)

a) Implementing constructor overloading:

```java
/**
 * Author: omteja04
 * Description: ConstructorOverloading
 */

public class ConstructorOverloading {
    public static void main(String[] args) {
        // Creating objects of ConstructorOverloadingExample
        ConstructorOverloadingExample obj1 = new ConstructorOverloadingExample();
        ConstructorOverloadingExample obj2 = new ConstructorOverloadingExample(42);
        ConstructorOverloadingExample obj3 = new ConstructorOverloadingExample("Hello");
    }
}
class ConstructorOverloadingExample {
    // Constructors with different parameters
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
```

**Output :**

```output
Default constructor called.
Parameterized constructor with int: 42
Parameterized constructor with string: Hello
```

b) Implementing method overloading:

```java
/**
 * Author: omteja04
 * Description: MethodOverloading
 */

public class MethodOverloading {
    public static void main(String[] args) {
        // Creating an object of MethodOverloadingExample
        MethodOverloadingExample obj = new MethodOverloadingExample();

        // Invoking the overloaded methods
        System.out.println("Sum of integers: " + obj.add(5, 10));
        System.out.println("Sum of doubles: " + obj.add(5.5, 10.5));
        System.out.println("Concatenation of strings: " + obj.add("Hello", " World"));
    }
}

class MethodOverloadingExample {
    // Overloaded methods
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public String add(String str1, String str2) {
        return str1 + str2;
    }
}
```

**Output :**

```output
Sum of integers: 15
Sum of doubles: 16.0
Concatenation of strings: Hello World
```

### Exercise - 5 (Inheritance)

a) Implementing Single Inheritance:

```java
/**
 * Author: omteja04
 * Description: SingleInheritance
 */

public class SingleInheritance {
    public static void main(String[] args) {
        // Creating an object of Child class
        Child childObj = new Child();

        // Invoking methods from both Parent and Child classes
        childObj.displayParent();
        childObj.displayChild();
    }
}

class Parent {
    public void displayParent() {
        System.out.println("This is the parent class.");
    }
}

class Child extends Parent {
    public void displayChild() {
        System.out.println("This is the child class.");
    }
}
```

**Output :**

```output
This is the parent class.
This is the child class.
```

b) Implementing Multi-level Inheritance:

```java
/**
 * Author: omteja04
 * Description: MultiLevelInheritance
 */

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
```

**Output :**

```output
This is the grandparent class.
This is the parent class.
This is the child class.
```

c) Abstract class to find areas of different shapes:

```java
/**
 * Author: omteja04
 * Description: AbstractClassExample
 */

public class AbstractClassExample {
    public static void main(String[] args) {
        // Creating objects of Circle and Rectangle
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);

        // Calculating and displaying areas
        System.out.println("Area of Circle: " + circle.calculateArea());
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
    }
}
abstract class Shape {
    // Abstract method to calculate area
    public abstract double calculateArea();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}
```

**Output :**

```output
Area of Circle: 78.53981633974483
Area of Rectangle: 24.0
```
