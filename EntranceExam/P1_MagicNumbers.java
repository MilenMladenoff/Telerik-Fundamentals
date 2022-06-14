package EntranceExam;

import java.util.Scanner;

public class P1_MagicNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[5];
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scan.nextInt();

            if (numbers[i] % 3 == 0 && numbers[i] % 7 == 0) {
                sum += numbers[i];
            }
        }

        int digitsSum = 0;

        while (sum != 0) {
            int digit = sum % 10;
            digitsSum += digit;
            sum /= 10;
        }

        System.out.println(digitsSum);
    }
}
