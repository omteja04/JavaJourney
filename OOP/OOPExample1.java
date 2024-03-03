package OOP;

public class OOPExample1 {
    public static void main(String[] args) {
        Person p1 = new Person(); // ^ Creating object of a person
        // System.out.println(p1.age); // Default Value --> 0
        // System.out.println(p1.name);// Default Value --> null
        p1.name = "Kyle Allen";
        p1.age = 17;
        p1.printDetails();

        Person p2 = new Person();
        p2.name = "Julia Hernandez";
        p2.age = 19;
        p2.printDetails();

    }
}

class Person {
    // ^ Member Variables / Attributes
    String name; // & non-static / instance member
    int age; // & non-static / instance member

    // ^ non-static / instance method
    void printDetails() {
        System.out.println("My name is " + name + " and I'm " + age + " years old");
    }

}
