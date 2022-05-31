package Homework04Arrays;

import java.util.Scanner;

public class P06_IsArraySymmetric {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String[] elements = input.split(" ");
        int[] numbers = new int[elements.length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(elements[i]);
        }

        boolean isSymmetric = true;

        for (int i = 0; i < numbers.length / 2; i++) {

            if (numbers[i] != numbers[numbers.length - 1 - i]) {
                isSymmetric = false;
                break;
            }
        }

        if (isSymmetric) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
