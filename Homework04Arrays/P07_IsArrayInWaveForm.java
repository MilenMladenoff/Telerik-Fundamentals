package Homework04Arrays;

import java.util.Scanner;

public class P07_IsArrayInWaveForm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String[] elements = input.split(" ");
        int[] numbers = new int[elements.length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(elements[i]);
        }

        boolean isWave = true;

        for (int i = 1; i < numbers.length - 1; i++) {

            if ((numbers[i - 1] > numbers[i] && numbers[i] < numbers[i +1])
                    || (numbers[i - 1] < numbers[i] && numbers[i] > numbers[i +1])) {
                isWave = true;
            } else {
                isWave = false;
                break;
            }
        }

        if (isWave) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
