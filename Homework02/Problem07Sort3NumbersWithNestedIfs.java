package Homework02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Problem07Sort3NumbersWithNestedIfs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = Double.parseDouble(scan.nextLine());
        double b = Double.parseDouble(scan.nextLine());
        double c = Double.parseDouble(scan.nextLine());

        double maxNum = Math.max(a, Math.max(b, c));
        double minNum = Math.min(a, Math.min(b, c));

        DecimalFormat decimalFormat = new DecimalFormat("#.######################");
        String formattedMaxNum = decimalFormat.format(maxNum);
        String formattedMinNum = decimalFormat.format(minNum);

        System.out.print(formattedMaxNum + " ");

        if (a == maxNum) {
            System.out.print(decimalFormat.format(Math.max(b, c)));
        } else if (b == maxNum) {
            System.out.print(decimalFormat.format(Math.max(a, c)));
        } else if (c == maxNum) {
            System.out.print(decimalFormat.format(Math.max(a, b)));
        }

        System.out.print(" " + formattedMinNum);
    }
}
