package Programs;

public class StringBufferClass {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println(sb);
        sb.append(123);// Appends 123 at the end of Hello
        sb.append(12.45); // Appends 12.45 at the end of Hello123
        sb.setCharAt(0, 'p'); // replaces the char at 0th index with 'p'
        sb.deleteCharAt(0); // removes char at 0th index
        sb.insert(3, "xyz"); // inserts the string "xyz" at 3rd index
        System.out.println(sb);
        String outputString = new String(sb);
        System.out.println(outputString.length());
    }
}
