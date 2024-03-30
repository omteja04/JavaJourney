/**
 * Author: omteja04
 * Description: CustomExceptions
 */

package Programs;

import java.lang.reflect.Method;

public class CustomExceptions {
    public static void main(String[] args) {
        Method[] methods = CustomExceptionsExample.class.getDeclaredMethods();
        int cnt = 0;
        for (Method method : methods) {
            if (method.getName().equals("printArray")) {
                cnt++;
            }
        }
        // cSpell:disable
        if (cnt > 1) {
            throw new RuntimeException("No Overloading Allowed - Kabatti Extralu Cheyyakunda Generics lo Raayi");
        }

        String[] stringArr = { "a", "b", "c", "d", "e", };
        Integer[] intArr = { 1, 2, 3, 4, 5 };
        Double[] dbArr = { 0.1, 0.2, 0.3, 0.4, 0.5 };

        CustomExceptionsExample.printArray(stringArr);
        CustomExceptionsExample.printArray(intArr);
        CustomExceptionsExample.printArray(dbArr);

    }
}

class CustomExceptionsExample {
    public static void printArray(String[] stringArr) {
        for (String string : stringArr) {
            System.out.print(string + " ");
        }
        System.out.println();
    }

    public static void printArray(Integer[] integerArr) {
        for (Integer integer : integerArr) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }

    public static void printArray(Double[] doubDoubleArr) {
        for (Double doubDouble : doubDoubleArr) {
            System.out.print(doubDouble + " ");
        }
        System.out.println();
    }
}