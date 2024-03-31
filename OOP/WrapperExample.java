package OOP;

public class WrapperExample {
    static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    static void printArray(Integer[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    static void printArray(Character[] array) {
        for (Character i : array) {
            System.out.print(i + " ");
        }
    }

    static void printArray(Double[] array) {
        for (Double i : array) {
            System.out.print(i + " ");
        }
    }

    static void printArray(String[] array) {
        for (String i : array) {
            System.out.print(i + " ");
        }
    }
    static void printArray(Cats[] array) {
        for (Cats i : array) {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        printArray(arr);
        System.out.println();
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

        Cats[] cats = { new Cats("Alice", 8), new Cats("Bob", 9) };
        printArray(cats);
        System.out.println();

    }
}

class Cats {
    String name;
    int age;

    public Cats(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "This is " + name + "(" + age + ")";
    }

}
