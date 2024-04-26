<!-- cSpell:disable -->

### Exercise - 1 (Basics)

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
            System.out.println("Roots are real and different.\nRoot1 = " + root1 + ", Root2 = " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("Roots are real and same. Root = " + root);
        } else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("Roots are complex and different. ");
            System.out.format("Root1 = %.2f + %.2f i , ", realPart, imaginaryPart);
            System.out.format("Root2 = %.2f - %.2f i", realPart, imaginaryPart);

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

### Exercise - 2 (Operations, Expressions, Control-flow, Strings)

a) Binary search program:

```java
/**
 * Author: omteja04
 * Description: BinarySearch
 */
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

        int result = binarySearch(arr, 0, n - 1, key);

        if (result >= 0) {
            System.out.println("Element found at index " + result);
        } else {
            System.out.println("Element not found in the list.");
        }

        scanner.close();
    }

    private static int binarySearch(int[] arr, int low, int high, int key) {

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;

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
/**
 * Author: omteja04
 * Description: MergeSort
 */

import java.util.Scanner;

class MergeSort {

    public static void merge(int arr[], int left, int mid, int right) {
        int i = left;
        int j = mid + 1;
        int k = 0;
        int temp[] = new int[right - left + 1];

        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j])
                temp[k++] = arr[i++];
            else
                temp[k++] = arr[j++];
        }

        while (i <= mid)
            temp[k++] = arr[i++];

        while (j <= right)
            temp[k++] = arr[j++];

        k = 0;
        for (int s = left; s <= right; s++)
            arr[s] = temp[k++];
    }

    public static void mergeSort(int arr[], int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    public static void printArray(int arr[], int size) {
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Given array is");
        printArray(arr, arr.length);

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("\nSorted array is");
        printArray(arr, arr.length);

        scanner.close();
    }
}

```

**Output :**

```output
Enter the number of elements in the array:
7
Given array is
54 34 99 65 69 0 -9
Sorted array is
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
```

**Output :**

```output
Hey This Is Default Constructor
Who Are You ?
Hey This Is Parameterized Constructor !!!
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

### Exercise - 6 (Inheritance - continued)

a) Using super keyword:

```java
/**
 * Author: omteja04
 * Description: SuperKeyword
 */

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
```

**Output :**

```output
Parent's display() method
Child's display() method
```

b) Implementation of interface & What kind of Inheritance can be achieved?

```java
/**
 * Author: omteja04
 * Description: InterfaceProgram
 */

// Interface representing a Student
interface Student {
    void study(); // Method to study

    void attendClasses(); // Method to attend classes
}

// Interface representing a Teacher
interface Teacher {
    void teach(); // Method to teach

    void conductExams(); // Method to conduct exams
}

public class InterfaceProgram {
    public static void main(String[] args) {
        // Creating an object of SchoolEmployee class
        SchoolEmployee schoolEmployee = new SchoolEmployee();
        // Calling methods from Student interface
        schoolEmployee.study();
        schoolEmployee.attendClasses();
        // Calling methods from Teacher interface
        schoolEmployee.teach();
        schoolEmployee.conductExams();
    }
}

// Class implementing both Student and Teacher interfaces
class SchoolEmployee implements Student, Teacher {
    // Implementation of study method defined in the Student interface
    public void study() {
        System.out.println("Student studies for exams");
    }

    // Implementation of attendClasses method defined in the Student interface
    public void attendClasses() {
        System.out.println("Student attends classes regularly");
    }

    // Implementation of teach method defined in the Teacher interface
    public void teach() {
        System.out.println("Teacher teaches lessons to students");
    }

    // Implementation of conductExams method defined in the Teacher interface
    public void conductExams() {
        System.out.println("Teacher conducts exams for students");
    }
}

```

> INTERFACE MULTIPLE INHERITANCE is achieved.

**Output :**

```output
Student studies for exams
Student attends classes regularly
Teacher teaches lessons to students
Teacher conducts exams for students
```

### Exercise - 7 (Exception Handling)

a) Exception Handling Mechanism

```java
/**
 * Author: omteja04
 * Description: Exceptions
 */

import java.util.Scanner;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter two numbers:");
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();

            if (num2 == 0) {
                throw new ArithmeticException("Cannot divide by zero.");
            }

            int result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero.");
        } finally {
            System.out.println("Program Executed!!!");
            scanner.close();
        }
    }
}

```

**Output :**

```output
Enter two numbers:
11 2
Result: 5
Program Executed!!!
```

```output
Enter two numbers:
10 0
Error: Division by zero.
Program Executed!!!
```

b) Multiple catch clauses

```java
/**
 * Author: omteja04
 * Description: MultipleCatchExample
 */

import java.util.Scanner;

public class MultipleCatchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter two numbers:");
            int num1 = Integer.parseInt(scanner.next());
            int num2 = Integer.parseInt(scanner.next());

            int result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input. Please enter valid numbers.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Cleanup code");
            scanner.close();
        }
    }
}


```

**Output :**

```output
Enter two numbers:
10 10
Result: 1
Cleanup code
```

```output
Enter two numbers:
10 0
Error: Division by zero.
Cleanup code
```

```output
Enter two numbers:
10 teja
Error: Invalid input. Please enter valid numbers.
Cleanup code
```

### Exercise - 8 (Runtime Polymorphism)

a) Implements Runtime Polymorphism

```java
/**
 * Author: omteja04
 * Description: RuntimePolymorphismExample
 */

public class RuntimePolymorphismExample {
    public static void main(String[] args) {
        // Creating objects of child classes
        Vehicle car = new Car();
        Vehicle truck = new Truck();
        Vehicle vehicle = new Vehicle();

        // Calling the displayInfo method of the Car class
        car.displayInfo();

        // Calling the displayInfo method of the Truck class
        truck.displayInfo();

        // Calling the displayInfo method of the Vehicle class
        vehicle.displayInfo();

    }
}

// Parent class
class Vehicle {
    // Method to display information about the vehicle
    void displayInfo() {
        System.out.println("This is a vehicle.");
    }
}

// Child class 1
class Car extends Vehicle {
    // Overriding the displayInfo method of the parent class
    void displayInfo() {
        System.out.println("This is a car.");
    }
}

// Child class 2
class Truck extends Vehicle {
    // Overriding the displayInfo method of the parent class
    void displayInfo() {
        System.out.println("This is a truck.");
    }
}

```

**Output :**

```output
This is a car.
This is a truck.
This is a vehicle.
```

b) Runtime Polymerphism Case Study

**Description:**
Polymorphism, derived from the Greek words "poly" meaning many and "morphs" meaning forms, refers to the ability of a single entity to take on multiple forms or behaviors. It is classified into two types: static or compile-time polymorphism and dynamic or runtime polymorphism.

**Runtime Polymorphism:**
Runtime polymorphism, also known as dynamic polymorphism, is the process of calling overridden methods at runtime rather than at compile time. In this process, the overridden methods are invoked using references of the superclass.

**Explanation:**
In the provided example, runtime polymorphism is achieved using inheritance. Two child classes, Car and Truck, inherit from the parent class Vehicle. Both child classes override the displayInfo method of the parent class to provide specific implementations.

In the main method, objects of the child classes Car and Truck are created and referred to by references of the superclass Vehicle. When the displayInfo method is called on these objects, the appropriate overridden method is invoked based on the actual type of the object at runtime. This demonstrates how runtime polymorphism allows for flexibility in method invocation and behavior based on the actual object type at runtime.

### Exercise - 9 (User Defined Exceptions)

a) Illustrate throw

```java
/**
 * Author: omteja04
 * Description: ThrowExample
 */

import java.util.Scanner;

public class ThrowExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter your age:");
            int age = scanner.nextInt();

            // Validate age
            if (age < 0 || age > 120) {
                throw new IllegalArgumentException("Invalid age. Age must be between 0 and 120.");
            }

            System.out.println("Age entered: " + age);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

```

**Output :**

```output
Enter your age:
19
Age entered: 19
```

```output
Enter your age:
121
Error: Invalid age. Age must be between 0 and 120.
```

b) Illustrate finally

```java
/**
 * Author: omteja04
 * Description: FinallyExample
 */

import java.util.Scanner;

public class FinallyExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter a number:");
            int number = scanner.nextInt();
            System.out.println("Number entered: " + number);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            // This block will always execute, even if an exception occurs or not
            // It is used for cleanup tasks like closing resources
            System.out.println("Finally block executed.");
            scanner.close(); // Close the scanner
        }
    }
}


```

**Output :**

```output
Enter a number:
12
Number entered: 12
Finally block executed.
```

```output
Enter a number:
teja
Error: null
Finally block executed.
```

c) Create Java Built-in Exception

```java
/**
 * Author: omteja04
 * Description: BuiltInExceptionExample
 */

import java.util.Scanner;

public class BuiltInExceptionExample {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3 };
        Scanner sc = new Scanner(System.in);
        try {
            // Trying to access an element outside the bounds of the array

            System.out.println("Enter The Index : ");
            int i = sc.nextInt();
            int num = numbers[i];
            System.out.println("Element at index 3: " + num);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Catching the ArrayIndexOutOfBoundsException and printing the error message
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}


```

**Output :**

```output
Enter The Index :
1
Element at index 3: 2
```

```output
Enter The Index :
3
Error: Index 3 out of bounds for length 3
```

d) Create Java UserDefined Exception

```java
/**
 * Author: omteja04
 * Description: UserDefinedExceptionExample
 */
import java.util.Scanner;

public class UserDefinedExceptionExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            // Create a bank account with initial balance of 500
            BankAccount account = new BankAccount(500);
            System.out.println("Enter The Withdraw Amount : ");
            int amount = sc.nextInt();
            account.withdraw(amount);
        } catch (InsufficientBalanceException e) {
            // Catch the custom exception and print the error message
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}

// Custom exception: InsufficientBalanceException
class InsufficientBalanceException extends Exception {
    // Constructor with a custom error message
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

// BankAccount class
class BankAccount {
    private double balance;

    // Constructor
    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    // Method to withdraw money
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance.");
        }
        balance -= amount;
        System.out.println("Withdrawal successful. Remaining balance: " + balance);
    }
}
```

**Output :**

```output
Enter The Withdraw Amount :
100
Withdrawal successful. Remaining balance: 400.0
```

```output
Enter The Withdraw Amount :
600
Error: Insufficient balance.
```

### Exercise - 10 (Threads)

a) Thread Implementation using `Thread` Class and `Runnable` Interface

```java

/**
 * Author: omteja04
 * Description: ThreadImplementation
 */

public class ThreadImplementation {
    public static void main(String[] args) {
        // Threads extending Thread class
        DisplayThread thread1 = new DisplayThread("Good Morning", 1000);
        DisplayThread thread2 = new DisplayThread("Hello", 2000);
        DisplayThread thread3 = new DisplayThread("Welcome", 3000);

        // Threads implementing Runnable interface
        Thread runnableThread1 = new Thread(new DisplayRunnable("Good Morning", 1000));
        Thread runnableThread2 = new Thread(new DisplayRunnable("Hello", 2000));
        Thread runnableThread3 = new Thread(new DisplayRunnable("Welcome", 3000));

        // Start the threads
        thread1.start();
        thread2.start();
        thread3.start();

        runnableThread1.start();
        runnableThread2.start();
        runnableThread3.start();
    }
}

// Extending Thread class
class DisplayThread extends Thread {
    private String message;
    private int delay;

    public DisplayThread(String message, int delay) {
        this.message = message;
        this.delay = delay;
    }

    public void run() {
        try {
            while (true) {
                System.out.println(message);
                Thread.sleep(delay);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

// Implementing Runnable interface
class DisplayRunnable implements Runnable {
    private String message;
    private int delay;

    public DisplayRunnable(String message, int delay) {
        this.message = message;
        this.delay = delay;
    }

    public void run() {
        try {
            while (true) {
                System.out.println(message);
                Thread.sleep(delay);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
```

**Output :**

```output
Good Morning
Hello
Good Morning
Welcome
Good Morning
Hello
Good Morning
Welcome
Hello
Good Morning
...
```

b) illustrate `isAlive()` & `join()`

```java
/**
 * Author: omteja04
 * Description: IsAliveAndJoin
 */

public class IsAliveAndJoin {
    public static void main(String[] args) {
        MyThread thread = new MyThread();

        System.out.println("Thread is alive: " + thread.isAlive());

        thread.start();

        System.out.println("Thread is alive: " + thread.isAlive());

        try {
            thread.join(); // Wait for the thread to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread is alive: " + thread.isAlive());
    }
}

class MyThread extends Thread {
    public void run() {
        try {
            System.out.println("Thread is running...");
            Thread.sleep(2000);
            System.out.println("Thread is finished.");
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }
    }
}
```

**Output :**

```output
Thread is alive: false
Thread is running...
Thread is alive: true
Thread is finished.
Thread is alive: false
```

c) Illustrate Daemon Thread

```java
/**
 * Author: omteja04
 * Description: DaemonThreadExample
 */

public class DaemonThreadExample {
    public static void main(String[] args) {
        DaemonThread daemonThread = new DaemonThread();
        daemonThread.setDaemon(true); // Setting daemon status
        daemonThread.start();

        Thread userThread = new DaemonThread();
        userThread.start();
    }
}

class DaemonThread extends Thread {
    public void run() {
        if (isDaemon()) {
            System.out.println(this.getName() + " is a daemon thread.");
        } else {
            System.out.println(this.getName() + " is a user thread.");
        }
        try {
            Thread.sleep(2000); // Simulating some task
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println(this.getName() + " has finished.");
    }
}

```

**Output :**

```output
Thread-0 is a daemon thread.
Thread-1 is a user thread.
Thread-0 has finished.
Thread-1 has finished.
```

### Exercise - 11 (Threads Continued)

```java

/**
 * Author: omteja04
 * Description: ProducerConsumerExample
 */

import java.util.LinkedList;

public class ProducerConsumerExample {
    public static void main(String[] args) {
        final ProducerConsumer pc = new ProducerConsumer();

        Thread producerThread = new Thread(() -> {
            try {
                pc.produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread consumerThread = new Thread(() -> {
            try {
                pc.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        producerThread.start();
        consumerThread.start();
    }
}

class ProducerConsumer {
    LinkedList<Integer> buffer = new LinkedList<>();
    int capacity = 5;

    public void produce() throws InterruptedException {
        int value = 0;
        while (true) {
            synchronized (this) {
                while (buffer.size() == capacity)
                    wait();

                System.out.println("Producer produced: " + value);
                buffer.add(value++);
                notify();
                Thread.sleep(1000);
            }
        }
    }

    public void consume() throws InterruptedException {
        while (true) {
            synchronized (this) {
                while (buffer.isEmpty())
                    wait();

                int val = buffer.removeFirst();
                System.out.println("Consumer consumed: " + val);
                notify();
                Thread.sleep(1000);
            }
        }
    }
}

```

**Output:**

```
Producer produced: 0
Consumer consumed: 0
Producer produced: 1
Consumer consumed: 1
Producer produced: 2
Consumer consumed: 2
Producer produced: 3
Consumer consumed: 3
Producer produced: 4
Consumer consumed: 4
Producer produced: 5
Consumer consumed: 5
Producer produced: 6
Consumer consumed: 6
...
```

b) Producer Consumer Case Study

**Case Study: Synchronization in Producer-Consumer Problem**

**Introduction:**
The producer-consumer problem, also known as the bounded-buffer problem, is a classic synchronization challenge in computer science. It involves two processes, the producer and the consumer, which share a fixed-size buffer. The producer generates data and places it into the buffer, while the consumer retrieves and consumes data from the buffer.

**Problem Description:**
The key challenge in the producer-consumer problem is ensuring that the producer does not attempt to add data to a full buffer and that the consumer does not attempt to remove data from an empty buffer. This requires synchronization mechanisms to coordinate the actions of the producer and consumer threads.

**Solution Approach:**
The solution involves implementing mechanisms to control access to the shared buffer and coordinate the activities of the producer and consumer threads. When the buffer is full, the producer either waits or discards data. When the buffer is empty, the consumer either waits or signals the producer to resume production.

**Implementation Overview:**

- The solution involves creating a `ProducerConsumer` class that encapsulates the shared buffer and synchronization mechanisms.
- The class includes a `LinkedList` to store jobs in the queue and a capacity variable to check if the buffer is full.
- Both the producer and consumer methods are implemented within the `ProducerConsumer` class.
- Synchronization is achieved using synchronized blocks to ensure mutual exclusion between producer and consumer threads.

**Producer Implementation:**

- The `Producer` class initializes a value and enters an infinite loop to produce data.
- Within the loop, a synchronized block ensures that only one thread (producer or consumer) can access the buffer at a time.
- If the buffer is full, the producer thread waits, relinquishing the intrinsic lock on the `ProducerConsumer` object.
- When space becomes available in the buffer, the producer adds data to the list and notifies waiting threads.

**Consumer Implementation:**

- The `Consumer` class also enters an infinite loop to consume data from the buffer.
- Inside the loop, a synchronized block ensures exclusive access to the buffer.
- If the buffer is empty, the consumer thread waits, releasing the lock and allowing the producer to resume.
- When data is available in the buffer, the consumer removes an item from the list and processes it.

**Conclusion:**
The producer-consumer problem illustrates the importance of synchronization in managing shared resources and coordinating concurrent processes. By implementing synchronization mechanisms such as mutual exclusion and coordination, we ensure data integrity and prevent race conditions in multi-threaded environments. This case study demonstrates how synchronization techniques can be applied to address complex concurrency challenges effectively.

### Exercise - 12 (Packages)

a) Illustrate Class Path

```java


```

**Output:**

```

```

b) Class Path Case Study

**COPING THE PATH OF JAVA:-**
First of all go to `MY COMPUTER` and go to the drive where the java is installed.In that go to `PROGRAM FILES` and then double click on java folder.
In that we have observed there is a folder with name `java jdk`,double click on the `java jdk`folder and then go into the bin folder.
At this time we have to copy the path of the bin folder.

`c:\Program Files\java\jdk1.5.0_10\bin;`

**SETTING THE JAVA PATH:-**
In order to set the path of the java in our system,first of all we need to open `CONTROL PANEL` in our system and go to `SYSTEM SETTINGS`.
In system settings we need to go into the `ADVANCED SYSTEM SETTINGS` settings.
In advanced system settings we just click on `ENVIRONMENT VARIABLES`option.
In `USER VARIABLES` click on `NEW` button and type the **`path`** at `VARIABLE NAME`.
We need to paste the previously copied path of the bin folder at the place of `VARIABLE VALUE`.
Finally click on OK and then OK,then close the `MY COMPUTER` window.
Now the java path is set. We are ready to use java facilities in our computer.

c) Import and use the user defined package

#### User defined packages

User-defined packages are those which are developed by users in order to group related classes, interfaces and sub packages. With the help of an example program, let's see how to create packages,compile Java programs inside the packages and execute them.

**Steps involved in user defined package creation:**

1. Creation of user defined package file
2. Compilation of user defined package file
3. Setting of class path
4. Importing of user defined package in another application.

`Step 1:`

**User Defined Packages in Java:**

User-defined packages in Java allow users to organize related classes, interfaces, and sub-packages. Here's an example program demonstrating how to create, compile, and use user-defined packages in Java.

**Step 1: Creation of User Defined Package File**

```java
package mathpack;
public class Compare {
    public int getMax(int n, int m) {
        if (n > m)
            return n;
        else
            return m;
    }

    public int getMin(int n, int m) {
        if (n < m)
            return n;
        else
            return m;
    }

    public void getEqual(int n, int m) {
        if (n == m)
            System.out.println("Equal");
        else
            System.out.println("Not equal");
    }
}
```

**Step 2: Compilation of User Defined Package File**

```bash
E:\PROGRAMS\JAVA\LAB\PackagesExercise\labpackages>javac -d . Compare.java
```

**Step 3: Setting the Class Path**

```bash
E:\PROGRAMS\JAVA\LAB\PackagesExercise>set classpath=;E:\PROGRAMS\JAVA\LAB\PackagesExercise\labpackages
```

**Step 4: Importing User Defined Package in Another Application**

```java
import java.util.Scanner;
import mathpack.Compare;

public class UserDefinedPackageExample {
    public static void main(String[] args) {
        int n1, n2;
        Scanner sc = new Scanner(System.in);
        Compare c = new Compare();
        System.out.println("Enter Any 2 Values");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        int max = c.getMax(n1, n2);
        int min = c.getMin(n1, n2);
        c.getEqual(n2, n1);
        System.out.println("Maximum : " + max);
        System.out.println("Minimum : " + min);
        sc.close();
    }

}
```

**Output:**

```bash
E:\PROGRAMS\JAVA\LAB\PackagesExercise>javac UserDefinedPackageExample.java

E:\PROGRAMS\JAVA\LAB\PackagesExercise>java UserDefinedPackageExample
```

```
Enter Any 2 Values
10 20
Not equal
Maximum : 20
Minimum : 10
```

**Reference Of Directories**
>Just For Reference
```
E:\PROGRAMS\JAVA\LAB\PackagesExercise
│
├── labpackages
│   ├── mathpack
│   │   └── Compare.class
│   │─── Compare.java
│   │
├── UserDefinedPackageExample.java
```
