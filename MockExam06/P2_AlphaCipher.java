package MockExam06;

import java.util.Scanner;

public class P2_AlphaCipher {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder cipher = new StringBuilder();

        for (int i = 1; i <= 5; i++) {
            int currentNumber = Integer.parseInt(scan.nextLine());
            int digitsSum = 1;

            for (int j = 1; j <= 3; j++) {
                int currentDigit = currentNumber % 10;
                digitsSum *= currentDigit;
                currentNumber /= 10;
            }

            String sumToString = String.valueOf(digitsSum);
            cipher.append(sumToString.charAt(sumToString.length() - 1));
        }

        System.out.println(cipher);
    }
}
