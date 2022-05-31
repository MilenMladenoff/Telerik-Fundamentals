package Homework04Arrays;

import java.util.Scanner;

public class P04_IsArraySorted {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String[] elements = input.split(" ");
        int[] numbers = new int[elements.length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(elements[i]);
        }

        boolean isSorted = true;

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] < numbers[i - 1]) {
                isSorted = false;
                break;
            }
        }

        if (isSorted) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
