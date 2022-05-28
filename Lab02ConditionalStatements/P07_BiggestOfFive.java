package Lab02ConditionalStatements;

import java.util.Scanner;

public class P07_BiggestOfFive {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());
        int num3 = Integer.parseInt(scan.nextLine());
        int num4 = Integer.parseInt(scan.nextLine());
        int num5 = Integer.parseInt(scan.nextLine());

        System.out.println(Math.max(num1, Math.max(num2, Math.max(num3, Math.max(num4, num5)))));
    }
}
