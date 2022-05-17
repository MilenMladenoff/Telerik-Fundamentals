package Homework02;

import java.util.Scanner;

public class Problem04MultiplicationSign {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = Double.parseDouble(scan.nextLine());
        double b = Double.parseDouble(scan.nextLine());
        double c = Double.parseDouble(scan.nextLine());
        char sign = 0;

        if (a == 0 || b == 0 || c == 0) {
            sign = '0';
        } else if (a > 0 && b > 0 & c > 0) {
            sign = '+';
        } else if (a < 0 && b < 0 & c < 0) {
            sign = '-';
        } else if (a > 0 && b > 0 & c < 0) {
            sign = '-';
        } else if (a > 0 && b < 0 & c < 0) {
            sign = '+';
        } else if (a < 0 && b > 0 & c > 0) {
            sign = '-';
        } else if (a < 0 && b < 0 & c > 0) {
            sign = '+';
        } else if (a > 0 && b < 0 & c > 0) {
            sign = '-';
        } else if (a < 0 && b > 0 & c < 0) {
            sign = '+';
        }

        System.out.println(sign);
    }
}
