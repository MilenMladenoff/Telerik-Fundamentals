package Homework01;

import java.util.Scanner;

public class Problem07SumOfGreatestAndSmallest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//      I apologize for this problem solution, which uses things we haven't learned, but I don't know how else.

        int maxNumber = Integer.MIN_VALUE;
        int minNumber = Integer.MAX_VALUE;

        for (int i = 1; i <= 3; i++) {
            int inputNumber = Integer.parseInt(scan.nextLine());

            if (inputNumber > maxNumber) {
                maxNumber = inputNumber;
            }

            if (inputNumber < minNumber) {
                minNumber = inputNumber;
            }
        }

        System.out.println(maxNumber + minNumber);
    }
}
