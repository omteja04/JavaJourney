package OOP;

// cSpell:disable
public class Constructors {
    public static void main(String[] args) {
        // System.out.println("cSpell:disable");
        Student s1 = new Student("Teja", 19, "CSE", "ACET", 8.25);
        Student s2 = new Student("Teja", 19);
        Student s3 = new Student("Teja", "CSE");
        Student s4 = new Student("Teja", 8.25);
        System.out.println(s1 + "\n" + s2 + "\n" + s3 + "\n" + s4);

    }
}

class Student {
    String name;
    int age;
    String branch;

    Student() {
    }

    String college;
    double cgpa;

    // * Constructors

    public Student(String string, int i) {
        name = string;
        age = i;
        System.out.println("Constructor is Invoked");
    }

    Student(String name, int age, String branch, String college, double cgpa) {
        this.name = name;
        this.age = age;
        this.branch = branch;
        this.cgpa = cgpa;
        this.college = college;
        System.out.println("Constructor is Invoked");
    }

    public Student(String name, double cgpa) {
        this.name = name;
        this.cgpa = cgpa;
    }

    public Student(String name, String branch) {
        this.name = name;
        this.branch = branch;
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, String branch, String college) {
        this.name = name;
        this.branch = branch;
        this.college = college;
    }

}