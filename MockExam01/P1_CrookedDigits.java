package MockExam01;

import java.util.Scanner;

public class P1_CrookedDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int sum = 0;

        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);

            if (symbol != '.' && symbol != '-') {
                int digit = Character.getNumericValue(symbol);
                sum += digit;
            }
        }

        int n = sum;

        while (n > 9) {
            int num = n;
            int currentSum = 0;

            while (num > 0) {
                int digit = num % 10;
                currentSum += digit;
                num /= 10;
            }

            n = currentSum;
        }

        System.out.println(n);
    }
}
