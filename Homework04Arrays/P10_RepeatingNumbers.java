package Homework04Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P10_RepeatingNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String[] elements = input.split(" ");
        int[] numbers = new int[elements.length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(elements[i]);
        }

        Arrays.sort(numbers);

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] == numbers[i - 1]) {
                System.out.println(numbers[i]);
            }
        }

    }
}
