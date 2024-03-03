package Programs;
import java.util.*;
import java.text.*;
public class CurrencyFormatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read payment amount from the user
        double payment = scanner.nextDouble();
        scanner.close();

        // Create NumberFormat instances for US and India locales
        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(Locale.forLanguageTag("en-IN"));

        // Format the payment amount using both locales
        String us = usFormat.format(payment);
        String ind = indiaFormat.format(payment);

        // Print the formatted amounts
        System.out.println("US:\t\t" + us);
        System.out.println("India:\t" + ind);
    }
}
