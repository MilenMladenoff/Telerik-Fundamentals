package Lab03Loops;

import java.util.Scanner;

public class P04_MinMaxSumAverage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        double min = 10000;
        double max = - 10000;
        double sum = 0.0;

        for (int i = 1; i <= n; i++) {
            double currentNum = Double.parseDouble(scan.nextLine());

            if (currentNum < min) {
                min = currentNum;
            }

            if (currentNum > max) {
                max = currentNum;
            }

            sum += currentNum;
        }

        System.out.printf("min=%.2f%n", min);
        System.out.printf("max=%.2f%n", max);
        System.out.printf("sum=%.2f%n", sum);
        System.out.printf("avg=%.2f%n", sum / n);
    }
}
