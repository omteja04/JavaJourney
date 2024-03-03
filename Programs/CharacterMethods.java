package Programs;

public class CharacterMethods {
    public static void main(String[] args) {
        System.out.println(Character.isUpperCase('a'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isAlphabetic('x'));
        System.out.println(Character.isAlphabetic('X'));
        System.out.println(Character.isLowerCase('a'));
        System.out.println(Character.isLowerCase('A'));
        System.out.println(Character.isWhitespace(' '));
        System.out.println(Character.isWhitespace('$'));
        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit('2'));
        String s = "" + 'a';
        String s1 = Character.toString('b');
        System.out.println(s+"\n"+s1);
    }
}
