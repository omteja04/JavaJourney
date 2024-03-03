package Programs;

public class ParsingExamples {
    public static void main(String[] args) {
        System.out.println("To Number : ");
        String x = "1000";
        int a = Integer.parseInt(x);
        System.out.println(a);
        String y = "ABC";
        int b = Integer.parseInt(y, 16);
        System.out.println(b);
        String z = "1010";
        int c = Integer.parseInt(z, 2);
        System.out.println(c);
        System.out.println("\nTo String : ");
        System.out.println(Integer.toString(a));
        System.out.println(Integer.toString(b, 16));
        System.out.println(Integer.toString(c, 2));
    }

}