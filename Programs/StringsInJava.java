package Programs;

public class StringsInJava {
   public static void main(String[] args) {
      // ^ Character Arrays -> Mutable
      // * Changeable even after created
      // char[] arr = { 'h', 'e', 'l', 'l', 'o' };
      // System.out.println(arr);
      // arr[0] = 'H';
      // System.out.println(arr);
      // ^ Strings ->Immutable
      // * Not Changeable after created
      // String s = "Hello"; /* String Constant Pool */
      // String t = "Hello"; /* String Constant Pool */
      // System.out.println(s == t);
      // String x = new String("Hello"); /* Stored in Heap */
      // String y = new String("Hello"); /* Stored in Heap */
      // System.out.println(x == y);

      // String s = "Hello";
      // System.out.println(s.length());
      // * charAt(index) to access the character at that specific index
      // System.out.println(s.charAt(4)); /* Returns Character at 4th index */
      // * toUpperCase() -> return a new string
      // System.out.println(s.toUpperCase());
      // System.out.println(s.toLowerCase());
      // System.out.println(s.contains("" + 'H')); /* H should be passed as a String
      // */
      // System.out.println(s.contains("" + 'a')); /* a should be passed as a String
      // */
      // System.out.println(s.indexOf('l'));
      // System.out.println(s.lastIndexOf('l'));
      // System.out.println(s.startsWith("Hel"));
      // System.out.println(s.endsWith("" + 'o'));
      // System.out.println(s.substring(2));
      // System.out.println(s.substring(0, 4));
      // System.out.println(s.subSequence(0, 4));
      // String s1 = "abc";
      // String s2 = "abe";

      /*
       * s1.compareTo(s2):-
       * & Compares if(s1<s2) -ve diff between s1 and s2
       * & Compares if(s1>s2) +ve diff between s1 and s2
       * & Compares if(s1==s2) 0
       */
      // System.out.println(s1.compareTo(s2));
      // System.out.println(s2.compareTo(s1));
      // String x = "Hi";
      // String y = "Hi";
      // System.out.println(x.compareTo(y));
      /*
       * ^ If length of the strings is not same the comparison shifts to length
       * criteria only if the some part of the string is same i.e., s2 ->s1+"extra" or
       * s1->s2+"extra"
       */
      String a = "aaa";
      String b = "aaa";
      System.out.println(a.compareTo(b));

      /*
       * s1.equals(s2):-
       * & Compares if(s1!=s2) false
       * & Compares if(s1==s2) true
       */

   }

}
