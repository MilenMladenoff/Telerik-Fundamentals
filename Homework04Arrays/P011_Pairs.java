package Homework04Arrays;

import java.util.Scanner;

public class P011_Pairs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = Integer.parseInt(scan.nextLine());
        String input = scan.nextLine();
        String[] elements = input.split(" ");
        int[] numbers = new int[elements.length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(elements[i]);
        }

        for (int i = 0; i < numbers.length; i++) {

            for (int j = i + 1; j < numbers.length; j++) {

                if (numbers[i] + numbers[j] == sum) {
                    System.out.printf("%d, %d%n", numbers[i], numbers[j]);
                }
            }

        }
    }
}
