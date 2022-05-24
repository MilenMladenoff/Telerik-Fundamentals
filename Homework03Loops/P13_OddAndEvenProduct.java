package Homework03Loops;

import java.util.Arrays;
import java.util.Scanner;

public class P13_OddAndEvenProduct {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] intArray = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int oddsProduct = 1;
        int evensProduct = 1;

        for (int i = 0; i < intArray.length; i++) {

            if (i % 2 == 0) {
                evensProduct *= intArray[i];
            } else {
                oddsProduct *= intArray[i];
            }
        }

        if (oddsProduct == evensProduct) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
