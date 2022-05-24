package Homework03Loops;

import java.util.Scanner;

public class P02_NumbersNotDivisibleBy3And7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= n; i++) {

            if (i % 3 == 0 || i % 7 == 0) {
                continue;
            }

            System.out.print(i + " ");
        }
    }
}
