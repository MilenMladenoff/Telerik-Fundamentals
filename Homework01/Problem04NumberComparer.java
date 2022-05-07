package Homework01;

import java.util.Scanner;

public class Problem04NumberComparer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberA = Integer.parseInt(scan.nextLine());
        int numberB = Integer.parseInt(scan.nextLine());

        int greaterNumber = Math.max(numberA, numberB);

        System.out.println(greaterNumber);
    }
}
