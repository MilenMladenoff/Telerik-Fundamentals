package Homework04Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P05_FindTwoBiggestNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String[] elements = input.split(" ");
        int[] numbers = new int[elements.length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(elements[i]);
        }

        Arrays.sort(numbers);

        System.out.printf("%d %d", numbers[numbers.length - 1], numbers[numbers.length - 2]);
    }
}
