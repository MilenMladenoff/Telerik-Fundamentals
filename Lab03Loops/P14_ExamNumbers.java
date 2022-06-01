package Lab03Loops;

import java.util.Scanner;

public class P14_ExamNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int start = Integer.parseInt(scan.nextLine());
        int end = Integer.parseInt(scan.nextLine());
        int targetSum = Integer.parseInt(scan.nextLine());

        for (int i = start; i <= end; i++) {
            int number = i;
            int digitsSum = 0;

            for (int j = 1; j <= 3; j++) {
                int digit = number % 10;
                digitsSum += digit;
                number /= 10;
            }

            if (digitsSum == targetSum) {
                System.out.println(i);
            }
        }
    }
}
