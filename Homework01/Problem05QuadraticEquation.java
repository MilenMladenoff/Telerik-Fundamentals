package Homework01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Problem05QuadraticEquation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = Double.parseDouble(scan.nextLine());
        double b = Double.parseDouble(scan.nextLine());
        double c = Double.parseDouble(scan.nextLine());

        double d = b * b - 4 * a * c;
        double x1 = (-b - Math.sqrt(d)) / (2 * a);
        double x2 = (-b + Math.sqrt(d)) / (2 * a);

        DecimalFormat decimalFormat = new DecimalFormat("#.######################");
        String formattedX1 = decimalFormat.format(x1);
        String formattedX2 = decimalFormat.format(x2);
//      I apologize for this formatting, but the expected print values are definitely not for beginners.

        System.out.println(formattedX1);
        System.out.println(formattedX2);
    }
}
