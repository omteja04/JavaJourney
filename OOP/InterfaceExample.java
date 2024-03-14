package OOP;

public class InterfaceExample {
    public static void main(String[] args) {
        ABC abc = new ABC();
        abc.show();
        abc.method1();
        abc.method2();
    }
    
}

interface Interface1 {
    void show();

    void method1();
}

interface Interface2 {
    void show();

    void method2();
}

class ABC implements Interface1, Interface2 {
    public void show() {
        System.out.println("Show Function");
    }

    public void method1() {
        System.out.println("Method1");
    }

    public void method2() {
        System.out.println("Method2");
    }
}