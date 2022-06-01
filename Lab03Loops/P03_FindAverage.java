package Lab03Loops;

import java.util.Scanner;

public class P03_FindAverage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        double average = 0.0;

        for (int i = 1; i <= n; i++) {
            average += Double.parseDouble(scan.nextLine());
        }

        System.out.printf("%.2f", average / n);
    }
}
