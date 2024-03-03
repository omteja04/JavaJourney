package OOP;

public class OverrideUsage {
    public static void main(String[] args) {
        Cat c1 = new Cat("Alice", 7);
        System.out.println(c1);

    }
}

class Cat {
    String name;
    int age;

    Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat [name=" + name + ", age=" + age + "]";
    }

}