package Homework01;

import java.util.Scanner;

public class Problem06SumOf5Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scan.nextLine());
        int secondNumber = Integer.parseInt(scan.nextLine());
        int thirdNumber = Integer.parseInt(scan.nextLine());
        int fourthNumber = Integer.parseInt(scan.nextLine());
        int fifthNumber = Integer.parseInt(scan.nextLine());

        int sum = firstNumber + secondNumber + thirdNumber + fourthNumber + fifthNumber;

        System.out.println(sum);
    }
}
