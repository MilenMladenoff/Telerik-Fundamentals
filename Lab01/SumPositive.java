package Lab01;

import java.util.Scanner;

public class SumPositive {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());
        int sumPositive = number * (number + 1) / 2;
        System.out.println(sumPositive);
    }
}
