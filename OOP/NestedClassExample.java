package OOP;

public class NestedClassExample {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        outerClass.heyThere();

        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.whatsUp();

        OuterClass.StaticInnerClass staticInnerClass = new OuterClass.StaticInnerClass();
        staticInnerClass.whatsUp();

    }
}

class OuterClass {
    int number = 6;

    public void heyThere() {
        System.out.println("Hey There!!! I'm OuterClass");
        class LocalInnerClass {
            String LocalInnerClassVariable = "I'm LocalInnerClass";

            public void printLocalInnerClassVariable() {
                System.out.println(LocalInnerClassVariable);
            }
        }
        LocalInnerClass lic = new LocalInnerClass();
        lic.printLocalInnerClassVariable();
    }

    public static class StaticInnerClass {
        int innerNumber = 8;

        public void whatsUp() {
            System.out.println("What's Up!!! I'm StaticInnerClass");
        }
    }

    public class InnerClass {
        int innerNumber = 8;

        public void whatsUp() {
            System.out.println("What's Up!!! I'm NonStaticInnerClass");
        }
    }

}
