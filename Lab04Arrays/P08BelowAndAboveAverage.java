package Lab04Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P08BelowAndAboveAverage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = Arrays.stream(scan.nextLine().split(",")).mapToInt(Integer::parseInt).toArray();
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        double average = sum * 1.0 / numbers.length;
        StringBuilder belowAvg = new StringBuilder();
        StringBuilder aboveAvg = new StringBuilder();

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] < average) {
                belowAvg.append(numbers[i]).append(',');
            } else if (numbers[i] > average) {
                aboveAvg.append(numbers[i]).append(',');
            }
        }

        if (belowAvg.charAt(belowAvg.length() - 1) == ',') {
            belowAvg.deleteCharAt(belowAvg.length() - 1);
        }

        if (aboveAvg.charAt(aboveAvg.length() - 1) == ',') {
            aboveAvg.deleteCharAt(aboveAvg.length() - 1);
        }

        System.out.printf("avg: %.2f%n", average);
        System.out.printf("below: %s%n", belowAvg);
        System.out.printf("above: %s%n", aboveAvg);
    }
}
