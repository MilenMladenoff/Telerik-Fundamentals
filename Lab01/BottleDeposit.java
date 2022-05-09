package Lab01;

import java.util.Scanner;

public class BottleDeposit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int halfLiterBottles = Integer.parseInt(scan.nextLine());
        int oneLiterBottles = Integer.parseInt(scan.nextLine());
        double sum = halfLiterBottles * 0.1 + oneLiterBottles * 0.25;
        System.out.printf("%.2f", sum);
    }
}
