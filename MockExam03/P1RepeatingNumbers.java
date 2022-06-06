package MockExam03;

import java.util.Arrays;
import java.util.Scanner;

public class P1RepeatingNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int[] numbers = new int[n];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(scan.nextLine());
        }

        Arrays.sort(numbers);
        int counter = 1;
        int maxOccurs = 1;
        int mostOccurredNum = 11;

        for (int i = 0; i < numbers.length - 1; i++) {

            if (numbers[i] == numbers[i + 1]) {
                counter++;

                if (counter == maxOccurs && numbers[i] <= mostOccurredNum) {
                    mostOccurredNum = numbers[i];
                }

                if (counter > maxOccurs) {
                    mostOccurredNum = numbers[i];
                    maxOccurs = counter;
                }

            } else {
                counter = 1;
            }
        }

        if (mostOccurredNum == 11) {
            System.out.println(numbers[0]);
        } else {
            System.out.println(mostOccurredNum);
        }
    }
}
