/**
 * Author: omteja04
 * Description: InterfaceProgram
 */

package LAB.InheritanceContinued;

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
