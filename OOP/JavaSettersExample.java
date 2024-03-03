package OOP;

// cSpell:disable
public class JavaSettersExample {
    public static void main(String[] args) {
        System.out.println("cSpell:disable");
        Students s1 = new Students();
        s1.setValues(39, "Teja", "CSE", "ACET", 8.77);
        s1.printDetails();
        Students s2 = new Students();
        s2.setValues(40, "Aditya", "CSE", "ACET", 8.77);
        s2.printDetails();
    }
}

class Students {
    int id;
    String name, branch, college;
    double cgpa;

    void setValues(int id, String name, String branch, String college, double cgpa) {
        this.id = id;
        this.name = name;
        this.branch = branch;
        this.cgpa = cgpa;
        this.college = college;
    }

    void printDetails() {
        System.out.println(id + " " + name + " " + branch + " " + college + " " + cgpa);
    }
}