package Programs;

import java.util.Arrays;

public class ForEachLoop2DArrays {
    public static void main(String[] args) {
        String[][] characters = { { "Professor", "Tokyo", "Berlin" }, { "JonSnow", "Daenerys", "Tyrion" },
                { "Walter", "Jesse", "Saul" } };
        for (String[] eachSeries : characters) {
            for (String eachCharacter : eachSeries) {
                System.out.print(eachCharacter + " ");
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(characters));

    }
}
