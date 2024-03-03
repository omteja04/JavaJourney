
package Programs;

import java.util.Arrays;
import java.util.Scanner;

/* 
 * Default values
    ^ The behavior of the uninitialized variables
    ! In C/C++ we get garbage values when we print the uninitialized variables
    & Uninitialized variables:- variables that are not declared but not assigned with any value
    ~ Java deals with these uninitialized variables based on their datatype
    
    ^ Datatype        Default value
        int             0
        short           0
        byte            0
        long            0L
        float           0.0f
        double          0.0
        char            null char
        boolean         false

    !If the object/reference type is null
        String          null

    * Java Compiler can't assign default values to local variables it renders into compilation error

    
    
*/

public class DefaultValues {
    int y; // instance variable (no use of static)
    static boolean z; // instance variable with static
    static String s; // instance variable with static
    static Scanner sc;
    static Cat cat1;

    public static void main(String[] args) {
        // int x; // Local variable
        DefaultValues values = new DefaultValues();
        System.out.println(values.y);
        System.out.println(z);
        System.out.println(s);
        System.out.println(sc);
        System.out.println(cat1);

        int[] arr = new int[5];
        System.out.println(Arrays.toString(arr));
        String[] str = new String[5];
        System.out.println(Arrays.toString(str));
        boolean[] bool = new boolean[5];
        System.out.println(Arrays.toString(bool));
        // Apart from Default values, we can use fill to get any value.
    }
}

class Cat {

}
