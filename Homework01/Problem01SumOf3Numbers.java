package Homework01;

import java.util.Scanner;

public class Problem01SumOf3Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberA = Integer.parseInt(scan.nextLine());
        int numberB = Integer.parseInt(scan.nextLine());
        int numberC = Integer.parseInt(scan.nextLine());

        int sum = numberA + numberB + numberC;

        System.out.println(sum);
    }
}
