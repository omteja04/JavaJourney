package Programs;

public class VariablesScope {
    public static void main(String[] args) {
        System.out.println(Student.collegeName);
        Student s1 = new Student(); // Creating a instance of Student class
        // Creating a instance means Allocating Memory
        s1.printDetails();
        Student.printCollegeName();
    }
}

class Student {
    int age; // Instance Variable
    String name = "Teja"; // Instance Variable
    String rollNumber = "22P31A0539"; // Instance Variable
    static String collegeName = "Aditya College of Engineering and Technology";

    // instance method -> can only be accessed with instance
    void printDetails() {
        System.out.println(name + " " + " " + " " + rollNumber);
    }

    // static method -> can be accessed using className or object of class
    static void printCollegeName() {
        System.out.println(collegeName);
    }
}
