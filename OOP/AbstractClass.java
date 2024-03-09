/**
 * Author: omteja04
 * Description: AbstractClass
 */

package OOP;
// cSpell:disable
public class AbstractClass {
    public static void main(String args[]) {
        System.out.println("cSpell:disable\n");
        Lion lion = new Lion("Balayya",60);
        lion.introduce();
        Dinosaur dinosaur = new Dinosaur("Salaar Devaratha Raisaar",45);
        dinosaur.introduce();

    }
}

abstract class Animal {

    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    abstract void introduce(); // Abstract method

}

class Lion extends Animal {
    Lion(String name, int age) {
        super(name, age);
    }

    void introduce() {
        System.out.println("Hey, I'm "+name+" and I'm "+age+" years old");
    }
}

class Dinosaur extends Animal {

    Dinosaur(String name, int age) {
        super(name, age);
    }

    void introduce() {
        System.out.println("Hey, I'm " + name + " and I'm " + age + " years old");
    }
}
