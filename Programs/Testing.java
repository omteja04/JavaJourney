package Programs;
public class Testing {
    public static void main(String[] args) {
        int a = 10;
        float b = 10.1f;
        
        // Format Specifier Syntax %[flag][width][.precision]conversion_character
        //generally flag is right justification
        // to make it left justification put - before the flag
        System.out.printf("%07d\n", a);
        System.out.printf("%-7d", a);
        System.out.printf("Hello\n");
        System.out.printf("%010.2f",b);
        System.out.printf("Hello\n");


        //Ternary Operator 
        // condition ? expression1 : expression2
        int x = 1, y = 2;
        System.out.println(x > y ? x : y);
        System.out.println(y % 2 == 0 ? "Even" : "Odd");
        int z = 10;
        int m = (x > y && x > z) ? x : (y > x && y > z) ? y : z;
        System.out.println(m);


    }
}
