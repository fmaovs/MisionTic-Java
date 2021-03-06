
package reto1;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Scanner;

/**
 *
 * @author maovi
 */
public class Reto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        var averageRange = 0.00;
        var maxRange = 0.00;
        var minRange = 0.00;

        Scanner sc = new Scanner(System.in);
        int size;
        size = sc.nextInt();
        int[] samples = new int[size];
        // System.out.println(" El valor de n es: " + n );

        for (int i = 0; i < size; i++) {
            // System.out.println(i);
            samples[i] = sc.nextInt();
        }

        // Get average
        OptionalDouble optNumber;
        optNumber = Arrays.stream(samples).average();

        if (!optNumber.isEmpty()) {
            var average = optNumber.getAsDouble();
            averageRange = average;
        }

        // Get maximum
        OptionalInt optNumberMax;
        optNumberMax = Arrays.stream(samples).max();

        if (!optNumberMax.isEmpty()) {
            var max = optNumberMax.getAsInt();
            maxRange = max;
        }

        // Get minimum
        OptionalInt optNumberMin;
        optNumberMin = Arrays.stream(samples).min();

        if (!optNumberMin.isEmpty()) {
            var min = optNumberMin.getAsInt();
            minRange = min;
        }

        // Average risk level
        if (averageRange >= 0.00 && averageRange <= 5.00) {
            System.out.println("SIN RIESGO");
        } else if (averageRange > 5 && averageRange <= 14) {
            System.out.println("BAJO");
        } else if (averageRange > 14 && averageRange <= 35) {
            System.out.println("MEDIO");
        } else if (averageRange > 35 && averageRange <= 80) {
            System.out.println("ALTO");
        } else if (averageRange > 80 && averageRange <= 100) {
            System.out.println("INVIABLE SANITARIAMENTE");
        }

        // Maximum risk level

        if (maxRange >= 0.00 && maxRange <= 5.00) {
            System.out.println("SIN RIESGO");
        } else if (maxRange > 5 && maxRange <= 14) {
            System.out.println("BAJO");
        } else if (maxRange > 14 && maxRange <= 35) {
            System.out.println("MEDIO");
        } else if (maxRange > 35 && maxRange <= 80) {
            System.out.println("ALTO");
        } else if (maxRange > 80 && maxRange <= 100) {
            System.out.println("INVIABLE SANITARIAMENTE");
        }

        // Mimimun risk level
        if (minRange >= 0.00 && minRange <= 5.00) {
            System.out.println("SIN RIESGO");
        } else if (minRange > 5 && minRange <= 14) {
            System.out.println("BAJO");
        } else if (minRange > 14 && minRange <= 35) {
            System.out.println("MEDIO");
        } else if (minRange > 35 && minRange <= 80) {
            System.out.println("ALTO");
        } else if (minRange > 80 && minRange <= 100) {
            System.out.println("INVIABLE SANITARIAMENTE");
        }

    }
}
