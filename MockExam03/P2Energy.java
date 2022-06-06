package MockExam03;

import java.util.Scanner;

public class P2Energy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int evensSum = 0;
        int oddsSum = 0;

        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);
            int digit = Integer.parseInt(String.valueOf(symbol));

            if (digit % 2 == 0) {
                evensSum += digit;
            } else {
                oddsSum += digit;
            }
        }

        if (evensSum > oddsSum) {
            System.out.printf("%d energy drinks", evensSum);
        } else if (evensSum < oddsSum) {
            System.out.printf("%d cups of coffee", oddsSum);
        } else {
            System.out.printf("%d of both", evensSum);
        }
    }
}
