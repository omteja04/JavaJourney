package OOP;

public class GenericMethod {
    static <T> void printArray(T[] arr) {
        for (T t : arr) {
            System.out.print(t + " ");
        }
    }

    public static void main(String[] args) {
        // Generic Method
        Integer[] brr = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        printArray(brr);
        System.out.println();
        Character[] chr = { 'h', 'e', 'l', 'l', 'o' };
        printArray(chr);
        System.out.println();
        Double[] d = { 1.7, 2.4, 3.5, 34.76 };
        printArray(d);
        System.out.println();
        String[] strArray = { "Charlie Dixon", "Jimmy Roy", "Alan Hale", "Hula Watson" };
        printArray(strArray);
        System.out.println();

        Dog[] dog = { new Dog("Alice", 8), new Dog("Bob", 9) };
        printArray(dog);
        System.out.println();
    }
}

class Dog {
    String name;
    int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "This is " + name + "(" + age + ")";
    }

}
