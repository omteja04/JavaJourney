package Programs;

public class UserDefinedMethodsExample {
    void sayHello() {
        System.out.println("Hello Everyone!");
    }

    static boolean isFactor(int a, int b) {
        return a % b == 0;
    }

    public static void main(String[] args) {
        System.out.println(isFactor(10, 2));
        // for a static member we doesn't need a object of class
        UserDefinedMethodsExample obj = new UserDefinedMethodsExample();
        obj.sayHello(); // To Use a Non Static member we need a object of the class

    }
}
