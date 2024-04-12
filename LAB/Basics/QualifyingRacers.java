package LAB.Basics;
/**
 * Author: omteja04
 * Description: QualifyingRacers
 */

import java.util.Scanner;

public class QualifyingRacers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the speeds of the five racers:");

        double totalSpeed = 0;
        double[] speeds = new double[5];

        // Input speeds
        for (int i = 0; i < 5; i++) {
            System.out.print("Racer " + (i + 1) + " speed: ");
            speeds[i] = scanner.nextDouble();
            totalSpeed += speeds[i];
        }

        // Calculate average speed
        double averageSpeed = totalSpeed / 5;

        System.out.println("\nAverage Speed: " + averageSpeed + "\nQualifying Racers:");

        // Display speeds of qualifying racers
        for (int i = 0; i < 5; i++) {
            if (speeds[i] > averageSpeed) {
                System.out.println("Racer " + (i + 1) + ": " + speeds[i]);
            }
        }

        scanner.close();
    }
}