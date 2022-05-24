package Homework03Loops;

import java.util.Scanner;

public class P12_Calculate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int k = Integer.parseInt(scan.nextLine());
        int nFactorial = 1;
        int kFactorial = 1;

        for (int i = 1; i <= n; i++) {
            nFactorial *= i;

            if (i > k) {
                continue;
            }

            kFactorial *= i;
        }

        int result = nFactorial / kFactorial;
        System.out.println(result);
    }
}
