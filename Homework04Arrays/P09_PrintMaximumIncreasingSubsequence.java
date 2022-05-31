package Homework04Arrays;

import java.util.Scanner;

public class P09_PrintMaximumIncreasingSubsequence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String[] elements = input.split(" ");
        int[] numbers = new int[elements.length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(elements[i]);
        }

        int increasingCounter = 1;
        int maxSequence = 1;
        int maxSequenceLastIndex = 0;

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] > numbers[i - 1]) {
                increasingCounter++;

                if (increasingCounter >= maxSequence) {
                    maxSequence = increasingCounter;
                    maxSequenceLastIndex = i;
                }

            } else {
                increasingCounter = 1;
            }
        }

        for (int i = maxSequenceLastIndex - maxSequence + 1; i <= maxSequenceLastIndex; i++) {
            System.out.printf("%d ", numbers[i]);
        }
    }
}
