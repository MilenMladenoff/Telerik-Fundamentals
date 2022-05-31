package Homework04Arrays;

import java.util.Scanner;

public class P08_NegativePositiveSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String[] elements = input.split(" ");
        int[] numbers = new int[elements.length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(elements[i]);
        }

        for (int number : numbers) {

            if (number < 0) {
                System.out.printf("%d ", number);
            }
        }

        for (int number : numbers) {

            if (number >= 0) {
                System.out.printf("%d ", number);
            }
        }
    }
}
