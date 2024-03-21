package Programs;

public class ExceptionLecture1 {
    public static void main(String[] args) {

        // make try as that it will handle only one exception

        try {
            // System.out.println(10/0);

            int[] arr = { 10, 20 };
            System.out.println(arr[0]);
            System.out.println(arr[1]);
            System.out.println(arr[2]);
        }
        // Multiple Catch Blocks or single catch block

        // catch (ArithmeticException e) {
        // System.out.println(e);
        // }

        // catch (IndexOutOfBoundsException e) {
        // System.out.println(e);
        // }

        // in single catch block
        catch (ArithmeticException | IndexOutOfBoundsException e) {
            System.out.println(e);
        }

        // finally will be executed always whether the exception has occurred or not or
        // the exception handled or not.

        finally {
            System.out.println("bye bye");
        }
        System.out.println("Last Line");
    }
}
