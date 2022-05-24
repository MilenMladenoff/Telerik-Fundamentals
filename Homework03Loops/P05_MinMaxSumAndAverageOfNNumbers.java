package Homework03Loops;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P05_MinMaxSumAndAverageOfNNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            int currentNum = Integer.parseInt(scan.nextLine());

            if (currentNum < min) {
                min = currentNum;
            }

            if (currentNum > max) {
                max = currentNum;
            }

            sum += currentNum;
        }

        double avg = sum * 1.0 / n;
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String formattedAvg = decimalFormat.format(avg);
        System.out.printf("min = %d%n", min);
        System.out.printf("max = %d%n", max);
        System.out.printf("sum = %d%n", sum);
        System.out.printf("avg = %s", formattedAvg);
    }
}
